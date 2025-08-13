package declaration;

import generated.*;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import java.io.File;
import java.math.BigInteger;
import java.util.Date;

public class DeclarationGenerator {
    public static void main(String[] args) throws Exception {
        // Création de l'instance Section1
        Section1 section1 = new Section1();
        section1.setVersionDocument(TVersionDoc.VERSION_1_0);

        // Configuration de l'en-tête
        TEntete entete = new TEntete();
        entete.setMatriculeFiscal("1234567A");
        entete.setRaisonSocial("Banque Exemple");
        // Conversion de l'année en XMLGregorianCalendar
        XMLGregorianCalendar exerciceCal = DatatypeFactory.newInstance().newXMLGregorianCalendar("2024");
        entete.setExercice(exerciceCal);
        section1.setEntete(entete);

        // Configuration de la liste des comptes
        Section1.ListeComptes listeComptes = new Section1.ListeComptes();
        Section1.ListeComptes.Compte compte = new Section1.ListeComptes.Compte();
        Section1.ListeComptes.Compte.LeCompte leCompte = new Section1.ListeComptes.Compte.LeCompte();
        leCompte.setNumCompte("12345678901234567890");
        leCompte.setCodType((byte) 1); // Compte courant
        compte.setLeCompte(leCompte);

        Section1.ListeComptes.Compte.IdentiteProprietaireCompte proprietaire = new Section1.ListeComptes.Compte.IdentiteProprietaireCompte();
        proprietaire.setNomPrenomRS("John Doe");
        compte.setIdentiteProprietaireCompte(proprietaire);

        listeComptes.getCompte().add(compte);
        section1.setListeComptes(listeComptes);

        // Configuration des totaux par devise
        Section1.TotauxParDevise totauxParDevise = new Section1.TotauxParDevise();
        Section1.TotauxParDevise.DetailsDevise detailsDevise = new Section1.TotauxParDevise.DetailsDevise();
        detailsDevise.setDevise("TND");
        detailsDevise.setNombreLigne(BigInteger.valueOf(1));
        detailsDevise.setMontantTotal("1000.00");
        totauxParDevise.getDetailsDevise().add(detailsDevise);
        section1.setTotauxParDevise(totauxParDevise);

        // Génération du fichier XML
        JAXBContext context = JAXBContext.newInstance(Section1.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        String filename = String.format("FDCDSection1_%s_%d.xml", entete.getMatriculeFiscal(), entete.getExercice().getYear());
        marshaller.marshal(section1, new File(filename));
        System.out.println("Fichier généré : " + filename + " à " + new Date());
    }
}