package declaration;

import generated.*;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.*;
import java.util.*;

public class DeclarationGeneratorSection2 {
    private static final String URL = "jdbc:mysql://localhost:3306/loi_finances_db";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // Remplace par ton mot de passe si défini

    public static void main(String[] args) {
        Section2 section2 = new Section2();
        section2.setVersionDocument(TVersionDoc.VERSION_1_0);

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {

            // Dynamisation de l'en-tête depuis le premier enregistrement de 'comptes'
            TEntete entete = new TEntete();
            try (Statement stmtEntete = conn.createStatement();
                 ResultSet rsEntete = stmtEntete.executeQuery("SELECT matricule_fiscal, raison_social FROM comptes LIMIT 1")) {
                if (rsEntete.next()) {
                    entete.setMatriculeFiscal(rsEntete.getString("matricule_fiscal"));
                    entete.setRaisonSocial(rsEntete.getString("raison_social"));
                } else {
                    throw new IllegalStateException("Aucun compte trouvé dans la table 'comptes' pour l'en-tête.");
                }
            }
            XMLGregorianCalendar exerciceCal = DatatypeFactory.newInstance().newXMLGregorianCalendar("2024");
            entete.setExercice(exerciceCal);
            entete.setReferenceDeclaration(1); // Valide selon T_ReferenceDecision
            section2.setEntete(entete);

            // Liste des comptes clôturés avec excédents positifs
            Section2.ListeComptes listeComptes = new Section2.ListeComptes();
            Map<String, BigDecimal> totalsParDevise = new HashMap<>();
            Map<String, Long> compteParDevise = new HashMap<>();
            try (Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT num_compte, cod_type, nom_prenom_rs, montant, devise FROM comptes WHERE statut = 'Clôturé' AND montant > 0")) {
                int compteCount = 0;
                while (rs.next()) {
                    byte codType = rs.getByte("cod_type");

                    // Validation : Vérifier que CodType est entre 1 et 9
                    if (codType < 1 || codType > 9) {
                        System.err.println("Erreur : CodType invalide (" + codType + ") pour le compte " + rs.getString("num_compte") + ". Compte ignoré.");
                        continue;
                    }

                    Section2.ListeComptes.Compte compte = new Section2.ListeComptes.Compte();
                    Section2.ListeComptes.Compte.LeCompte leCompte = new Section2.ListeComptes.Compte.LeCompte();
                    leCompte.setNumCompte(rs.getString("num_compte"));
                    leCompte.setCodType(codType);
                    compte.setLeCompte(leCompte);

                    // Configuration de IdentiteProprietaireCompte
                    Section2.ListeComptes.Compte.IdentiteProprietaireCompte proprietaire = new Section2.ListeComptes.Compte.IdentiteProprietaireCompte();
                    proprietaire.setNomPrenomRS(rs.getString("nom_prenom_rs"));
                    compte.setIdentiteProprietaireCompte(proprietaire);

                    // Ajout des éléments disponibles
                    BigDecimal montant = rs.getBigDecimal("montant") != null ? rs.getBigDecimal("montant") : BigDecimal.ZERO;
                    if (montant.compareTo(BigDecimal.ZERO) <= 0) {
                        System.err.println("Avertissement : Montant invalide (≤ 0) pour le compte " + rs.getString("num_compte") + ". Utilisation de 0.01.");
                        montant = new BigDecimal("0.01");
                    }
                    // Décommentez si setMontant est disponible
                    // compte.setMontant(montant.toString());

                    String devise = rs.getString("devise");
                    if (devise != null) {
                        compte.setDevise(devise);
                    }

                    listeComptes.getCompte().add(compte);
                    compteCount++;

                    // Calcul des totaux et compte par devise
                    totalsParDevise.merge(devise, montant, BigDecimal::add);
                    compteParDevise.merge(devise, 1L, Long::sum);
                }
                System.out.println("Nombre de comptes traités : " + compteCount);
            }
            section2.setListeComptes(listeComptes);

            // Configuration des totaux par devise
            Section2.TotauxParDevise totauxParDevise = new Section2.TotauxParDevise();
            for (Map.Entry<String, BigDecimal> entry : totalsParDevise.entrySet()) {
                Section2.TotauxParDevise.DetailsDevise detailsDevise = new Section2.TotauxParDevise.DetailsDevise();
                detailsDevise.setDevise(entry.getKey());
                detailsDevise.setNombreLigne(BigInteger.valueOf(compteParDevise.getOrDefault(entry.getKey(), 0L)));
                detailsDevise.setMontantTotal(entry.getValue().toString());
                totauxParDevise.getDetailsDevise().add(detailsDevise);
            }
            section2.setTotauxParDevise(totauxParDevise);

            // Génération du fichier XML
            JAXBContext context = JAXBContext.newInstance(Section2.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            String filename = String.format("FDCDSection2_%s_%d.xml", entete.getMatriculeFiscal(), entete.getExercice().getYear());
            marshaller.marshal(section2, new File(filename));
            System.out.println("Fichier généré : " + filename + " à " + new java.util.Date());

        } catch (Exception e) {
            System.err.println("Erreur lors de l'exécution : " + e.getMessage());
            e.printStackTrace();
        }
    }
}