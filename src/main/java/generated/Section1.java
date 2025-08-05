//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v4.0.4 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
//


package generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour anonymous complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VersionDocument" type="{}T_VersionDoc"/>
 *         <element name="Entete" type="{}T_Entete"/>
 *         <element name="ListeComptes">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence maxOccurs="unbounded">
 *                   <element name="Compte">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="leCompte">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="NumCompte" type="{}T_NumCompte"/>
 *                                       <element name="CodType" type="{}T_TypeCompte"/>
 *                                       <element name="LibelleCodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="IdentiteProprietaireCompte">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="NomPrenomRS" type="{}T_ChaineTexte250"/>
 *                                       <element name="TypeIdent" type="{}T_TypeIdent" minOccurs="0"/>
 *                                       <element name="LibelleCodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       <element name="NumIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       <element name="DateNaissance" type="{}T_DateJJMMAAAA" minOccurs="0"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="GestionnaireCompte" minOccurs="0">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="NomPrenomRS" type="{}T_ChaineTexte250"/>
 *                                       <element name="TypeIdent" type="{}T_TypeIdent" minOccurs="0"/>
 *                                       <element name="LibelleCodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       <element name="NumIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       <element name="DateNaissance" type="{}T_DateJJMMAAAA" minOccurs="0"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="ObligationInfoPub">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="DateInformationTitulaire" type="{}T_DateJJMMAAAA" minOccurs="0"/>
 *                                       <element name="DatePublicationJO" type="{}T_DateJJMMAAAA"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="PrescriptionCompte">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="DateDerniereOperation" type="{}T_DateJJMMAAAA" minOccurs="0"/>
 *                                       <element name="DatePrescriptionCompte" type="{}T_DateJJMMAAAA"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="Montant" type="{}T_Montant"/>
 *                             <element name="Devise" type="{}T_TypeDevise"/>
 *                             <element name="TypeActionDepot" type="{}T_TypeAction"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="TotauxParDevise">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence maxOccurs="unbounded">
 *                   <element name="DetailsDevise">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="Devise" type="{}T_TypeDevise"/>
 *                             <element name="NombreLigne" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                             <element name="MontantTotal" type="{}T_Montant"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "versionDocument",
    "entete",
    "listeComptes",
    "totauxParDevise"
})
@XmlRootElement(name = "section1")
public class Section1 {

    @XmlElement(name = "VersionDocument", required = true)
    @XmlSchemaType(name = "string")
    protected TVersionDoc versionDocument;
    @XmlElement(name = "Entete", required = true)
    protected TEntete entete;
    @XmlElement(name = "ListeComptes", required = true)
    protected Section1 .ListeComptes listeComptes;
    @XmlElement(name = "TotauxParDevise", required = true)
    protected Section1 .TotauxParDevise totauxParDevise;

    /**
     * Obtient la valeur de la propriété versionDocument.
     * 
     * @return
     *     possible object is
     *     {@link TVersionDoc }
     *     
     */
    public TVersionDoc getVersionDocument() {
        return versionDocument;
    }

    /**
     * Définit la valeur de la propriété versionDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link TVersionDoc }
     *     
     */
    public void setVersionDocument(TVersionDoc value) {
        this.versionDocument = value;
    }

    /**
     * Obtient la valeur de la propriété entete.
     * 
     * @return
     *     possible object is
     *     {@link TEntete }
     *     
     */
    public TEntete getEntete() {
        return entete;
    }

    /**
     * Définit la valeur de la propriété entete.
     * 
     * @param value
     *     allowed object is
     *     {@link TEntete }
     *     
     */
    public void setEntete(TEntete value) {
        this.entete = value;
    }

    /**
     * Obtient la valeur de la propriété listeComptes.
     * 
     * @return
     *     possible object is
     *     {@link Section1 .ListeComptes }
     *     
     */
    public Section1 .ListeComptes getListeComptes() {
        return listeComptes;
    }

    /**
     * Définit la valeur de la propriété listeComptes.
     * 
     * @param value
     *     allowed object is
     *     {@link Section1 .ListeComptes }
     *     
     */
    public void setListeComptes(Section1 .ListeComptes value) {
        this.listeComptes = value;
    }

    /**
     * Obtient la valeur de la propriété totauxParDevise.
     * 
     * @return
     *     possible object is
     *     {@link Section1 .TotauxParDevise }
     *     
     */
    public Section1 .TotauxParDevise getTotauxParDevise() {
        return totauxParDevise;
    }

    /**
     * Définit la valeur de la propriété totauxParDevise.
     * 
     * @param value
     *     allowed object is
     *     {@link Section1 .TotauxParDevise }
     *     
     */
    public void setTotauxParDevise(Section1 .TotauxParDevise value) {
        this.totauxParDevise = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.</p>
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence maxOccurs="unbounded">
     *         <element name="Compte">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="leCompte">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="NumCompte" type="{}T_NumCompte"/>
     *                             <element name="CodType" type="{}T_TypeCompte"/>
     *                             <element name="LibelleCodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="IdentiteProprietaireCompte">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="NomPrenomRS" type="{}T_ChaineTexte250"/>
     *                             <element name="TypeIdent" type="{}T_TypeIdent" minOccurs="0"/>
     *                             <element name="LibelleCodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             <element name="NumIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             <element name="DateNaissance" type="{}T_DateJJMMAAAA" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="GestionnaireCompte" minOccurs="0">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="NomPrenomRS" type="{}T_ChaineTexte250"/>
     *                             <element name="TypeIdent" type="{}T_TypeIdent" minOccurs="0"/>
     *                             <element name="LibelleCodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             <element name="NumIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             <element name="DateNaissance" type="{}T_DateJJMMAAAA" minOccurs="0"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="ObligationInfoPub">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="DateInformationTitulaire" type="{}T_DateJJMMAAAA" minOccurs="0"/>
     *                             <element name="DatePublicationJO" type="{}T_DateJJMMAAAA"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="PrescriptionCompte">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="DateDerniereOperation" type="{}T_DateJJMMAAAA" minOccurs="0"/>
     *                             <element name="DatePrescriptionCompte" type="{}T_DateJJMMAAAA"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Montant" type="{}T_Montant"/>
     *                   <element name="Devise" type="{}T_TypeDevise"/>
     *                   <element name="TypeActionDepot" type="{}T_TypeAction"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "compte"
    })
    public static class ListeComptes {

        @XmlElement(name = "Compte", required = true)
        protected List<Section1 .ListeComptes.Compte> compte;

        /**
         * Gets the value of the compte property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the compte property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getCompte().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Section1 .ListeComptes.Compte }
         * </p>
         * 
         * 
         * @return
         *     The value of the compte property.
         */
        public List<Section1 .ListeComptes.Compte> getCompte() {
            if (compte == null) {
                compte = new ArrayList<>();
            }
            return this.compte;
        }


        /**
         * <p>Classe Java pour anonymous complex type.</p>
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <sequence>
         *         <element name="leCompte">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="NumCompte" type="{}T_NumCompte"/>
         *                   <element name="CodType" type="{}T_TypeCompte"/>
         *                   <element name="LibelleCodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="IdentiteProprietaireCompte">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="NomPrenomRS" type="{}T_ChaineTexte250"/>
         *                   <element name="TypeIdent" type="{}T_TypeIdent" minOccurs="0"/>
         *                   <element name="LibelleCodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   <element name="NumIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   <element name="DateNaissance" type="{}T_DateJJMMAAAA" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="GestionnaireCompte" minOccurs="0">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="NomPrenomRS" type="{}T_ChaineTexte250"/>
         *                   <element name="TypeIdent" type="{}T_TypeIdent" minOccurs="0"/>
         *                   <element name="LibelleCodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   <element name="NumIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   <element name="DateNaissance" type="{}T_DateJJMMAAAA" minOccurs="0"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="ObligationInfoPub">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="DateInformationTitulaire" type="{}T_DateJJMMAAAA" minOccurs="0"/>
         *                   <element name="DatePublicationJO" type="{}T_DateJJMMAAAA"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="PrescriptionCompte">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="DateDerniereOperation" type="{}T_DateJJMMAAAA" minOccurs="0"/>
         *                   <element name="DatePrescriptionCompte" type="{}T_DateJJMMAAAA"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Montant" type="{}T_Montant"/>
         *         <element name="Devise" type="{}T_TypeDevise"/>
         *         <element name="TypeActionDepot" type="{}T_TypeAction"/>
         *       </sequence>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "leCompte",
            "identiteProprietaireCompte",
            "gestionnaireCompte",
            "obligationInfoPub",
            "prescriptionCompte",
            "montant",
            "devise",
            "typeActionDepot"
        })
        public static class Compte {

            @XmlElement(required = true)
            protected Section1 .ListeComptes.Compte.LeCompte leCompte;
            @XmlElement(name = "IdentiteProprietaireCompte", required = true)
            protected Section1 .ListeComptes.Compte.IdentiteProprietaireCompte identiteProprietaireCompte;
            @XmlElement(name = "GestionnaireCompte")
            protected Section1 .ListeComptes.Compte.GestionnaireCompte gestionnaireCompte;
            @XmlElement(name = "ObligationInfoPub", required = true)
            protected Section1 .ListeComptes.Compte.ObligationInfoPub obligationInfoPub;
            @XmlElement(name = "PrescriptionCompte", required = true)
            protected Section1 .ListeComptes.Compte.PrescriptionCompte prescriptionCompte;
            @XmlElement(name = "Montant", required = true)
            protected String montant;
            @XmlElement(name = "Devise", required = true)
            protected String devise;
            @XmlElement(name = "TypeActionDepot", required = true)
            @XmlSchemaType(name = "token")
            protected TTypeAction typeActionDepot;

            /**
             * Obtient la valeur de la propriété leCompte.
             * 
             * @return
             *     possible object is
             *     {@link Section1 .ListeComptes.Compte.LeCompte }
             *     
             */
            public Section1 .ListeComptes.Compte.LeCompte getLeCompte() {
                return leCompte;
            }

            /**
             * Définit la valeur de la propriété leCompte.
             * 
             * @param value
             *     allowed object is
             *     {@link Section1 .ListeComptes.Compte.LeCompte }
             *     
             */
            public void setLeCompte(Section1 .ListeComptes.Compte.LeCompte value) {
                this.leCompte = value;
            }

            /**
             * Obtient la valeur de la propriété identiteProprietaireCompte.
             * 
             * @return
             *     possible object is
             *     {@link Section1 .ListeComptes.Compte.IdentiteProprietaireCompte }
             *     
             */
            public Section1 .ListeComptes.Compte.IdentiteProprietaireCompte getIdentiteProprietaireCompte() {
                return identiteProprietaireCompte;
            }

            /**
             * Définit la valeur de la propriété identiteProprietaireCompte.
             * 
             * @param value
             *     allowed object is
             *     {@link Section1 .ListeComptes.Compte.IdentiteProprietaireCompte }
             *     
             */
            public void setIdentiteProprietaireCompte(Section1 .ListeComptes.Compte.IdentiteProprietaireCompte value) {
                this.identiteProprietaireCompte = value;
            }

            /**
             * Obtient la valeur de la propriété gestionnaireCompte.
             * 
             * @return
             *     possible object is
             *     {@link Section1 .ListeComptes.Compte.GestionnaireCompte }
             *     
             */
            public Section1 .ListeComptes.Compte.GestionnaireCompte getGestionnaireCompte() {
                return gestionnaireCompte;
            }

            /**
             * Définit la valeur de la propriété gestionnaireCompte.
             * 
             * @param value
             *     allowed object is
             *     {@link Section1 .ListeComptes.Compte.GestionnaireCompte }
             *     
             */
            public void setGestionnaireCompte(Section1 .ListeComptes.Compte.GestionnaireCompte value) {
                this.gestionnaireCompte = value;
            }

            /**
             * Obtient la valeur de la propriété obligationInfoPub.
             * 
             * @return
             *     possible object is
             *     {@link Section1 .ListeComptes.Compte.ObligationInfoPub }
             *     
             */
            public Section1 .ListeComptes.Compte.ObligationInfoPub getObligationInfoPub() {
                return obligationInfoPub;
            }

            /**
             * Définit la valeur de la propriété obligationInfoPub.
             * 
             * @param value
             *     allowed object is
             *     {@link Section1 .ListeComptes.Compte.ObligationInfoPub }
             *     
             */
            public void setObligationInfoPub(Section1 .ListeComptes.Compte.ObligationInfoPub value) {
                this.obligationInfoPub = value;
            }

            /**
             * Obtient la valeur de la propriété prescriptionCompte.
             * 
             * @return
             *     possible object is
             *     {@link Section1 .ListeComptes.Compte.PrescriptionCompte }
             *     
             */
            public Section1 .ListeComptes.Compte.PrescriptionCompte getPrescriptionCompte() {
                return prescriptionCompte;
            }

            /**
             * Définit la valeur de la propriété prescriptionCompte.
             * 
             * @param value
             *     allowed object is
             *     {@link Section1 .ListeComptes.Compte.PrescriptionCompte }
             *     
             */
            public void setPrescriptionCompte(Section1 .ListeComptes.Compte.PrescriptionCompte value) {
                this.prescriptionCompte = value;
            }

            /**
             * Obtient la valeur de la propriété montant.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMontant() {
                return montant;
            }

            /**
             * Définit la valeur de la propriété montant.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMontant(String value) {
                this.montant = value;
            }

            /**
             * Obtient la valeur de la propriété devise.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDevise() {
                return devise;
            }

            /**
             * Définit la valeur de la propriété devise.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDevise(String value) {
                this.devise = value;
            }

            /**
             * Obtient la valeur de la propriété typeActionDepot.
             * 
             * @return
             *     possible object is
             *     {@link TTypeAction }
             *     
             */
            public TTypeAction getTypeActionDepot() {
                return typeActionDepot;
            }

            /**
             * Définit la valeur de la propriété typeActionDepot.
             * 
             * @param value
             *     allowed object is
             *     {@link TTypeAction }
             *     
             */
            public void setTypeActionDepot(TTypeAction value) {
                this.typeActionDepot = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.</p>
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       <sequence>
             *         <element name="NomPrenomRS" type="{}T_ChaineTexte250"/>
             *         <element name="TypeIdent" type="{}T_TypeIdent" minOccurs="0"/>
             *         <element name="LibelleCodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         <element name="NumIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         <element name="DateNaissance" type="{}T_DateJJMMAAAA" minOccurs="0"/>
             *       </sequence>
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "nomPrenomRS",
                "typeIdent",
                "libelleCodType",
                "numIdent",
                "dateNaissance"
            })
            public static class GestionnaireCompte {

                @XmlElement(name = "NomPrenomRS", required = true)
                protected String nomPrenomRS;
                @XmlElement(name = "TypeIdent")
                protected Byte typeIdent;
                @XmlElement(name = "LibelleCodType")
                protected String libelleCodType;
                /**
                 * NumIdent doit être non vide si TypeIdent = '6'
                 * 
                 */
                @XmlElement(name = "NumIdent")
                protected String numIdent;
                @XmlElement(name = "DateNaissance")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String dateNaissance;

                /**
                 * Obtient la valeur de la propriété nomPrenomRS.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNomPrenomRS() {
                    return nomPrenomRS;
                }

                /**
                 * Définit la valeur de la propriété nomPrenomRS.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNomPrenomRS(String value) {
                    this.nomPrenomRS = value;
                }

                /**
                 * Obtient la valeur de la propriété typeIdent.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getTypeIdent() {
                    return typeIdent;
                }

                /**
                 * Définit la valeur de la propriété typeIdent.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setTypeIdent(Byte value) {
                    this.typeIdent = value;
                }

                /**
                 * Obtient la valeur de la propriété libelleCodType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLibelleCodType() {
                    return libelleCodType;
                }

                /**
                 * Définit la valeur de la propriété libelleCodType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLibelleCodType(String value) {
                    this.libelleCodType = value;
                }

                /**
                 * NumIdent doit être non vide si TypeIdent = '6'
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumIdent() {
                    return numIdent;
                }

                /**
                 * Définit la valeur de la propriété numIdent.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getNumIdent()
                 */
                public void setNumIdent(String value) {
                    this.numIdent = value;
                }

                /**
                 * Obtient la valeur de la propriété dateNaissance.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDateNaissance() {
                    return dateNaissance;
                }

                /**
                 * Définit la valeur de la propriété dateNaissance.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDateNaissance(String value) {
                    this.dateNaissance = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.</p>
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       <sequence>
             *         <element name="NomPrenomRS" type="{}T_ChaineTexte250"/>
             *         <element name="TypeIdent" type="{}T_TypeIdent" minOccurs="0"/>
             *         <element name="LibelleCodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         <element name="NumIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         <element name="DateNaissance" type="{}T_DateJJMMAAAA" minOccurs="0"/>
             *       </sequence>
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "nomPrenomRS",
                "typeIdent",
                "libelleCodType",
                "numIdent",
                "dateNaissance"
            })
            public static class IdentiteProprietaireCompte {

                @XmlElement(name = "NomPrenomRS", required = true)
                protected String nomPrenomRS;
                @XmlElement(name = "TypeIdent")
                protected Byte typeIdent;
                @XmlElement(name = "LibelleCodType")
                protected String libelleCodType;
                /**
                 * NumIdent doit être non vide si TypeIdent = '6'
                 * 
                 */
                @XmlElement(name = "NumIdent")
                protected String numIdent;
                @XmlElement(name = "DateNaissance")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String dateNaissance;

                /**
                 * Obtient la valeur de la propriété nomPrenomRS.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNomPrenomRS() {
                    return nomPrenomRS;
                }

                /**
                 * Définit la valeur de la propriété nomPrenomRS.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNomPrenomRS(String value) {
                    this.nomPrenomRS = value;
                }

                /**
                 * Obtient la valeur de la propriété typeIdent.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Byte }
                 *     
                 */
                public Byte getTypeIdent() {
                    return typeIdent;
                }

                /**
                 * Définit la valeur de la propriété typeIdent.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Byte }
                 *     
                 */
                public void setTypeIdent(Byte value) {
                    this.typeIdent = value;
                }

                /**
                 * Obtient la valeur de la propriété libelleCodType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLibelleCodType() {
                    return libelleCodType;
                }

                /**
                 * Définit la valeur de la propriété libelleCodType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLibelleCodType(String value) {
                    this.libelleCodType = value;
                }

                /**
                 * NumIdent doit être non vide si TypeIdent = '6'
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumIdent() {
                    return numIdent;
                }

                /**
                 * Définit la valeur de la propriété numIdent.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getNumIdent()
                 */
                public void setNumIdent(String value) {
                    this.numIdent = value;
                }

                /**
                 * Obtient la valeur de la propriété dateNaissance.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDateNaissance() {
                    return dateNaissance;
                }

                /**
                 * Définit la valeur de la propriété dateNaissance.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDateNaissance(String value) {
                    this.dateNaissance = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.</p>
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       <sequence>
             *         <element name="NumCompte" type="{}T_NumCompte"/>
             *         <element name="CodType" type="{}T_TypeCompte"/>
             *         <element name="LibelleCodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       </sequence>
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "numCompte",
                "codType",
                "libelleCodType"
            })
            public static class LeCompte {

                @XmlElement(name = "NumCompte", required = true)
                protected String numCompte;
                @XmlElement(name = "CodType")
                protected byte codType;
                @XmlElement(name = "LibelleCodType")
                protected String libelleCodType;

                /**
                 * Obtient la valeur de la propriété numCompte.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumCompte() {
                    return numCompte;
                }

                /**
                 * Définit la valeur de la propriété numCompte.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumCompte(String value) {
                    this.numCompte = value;
                }

                /**
                 * Obtient la valeur de la propriété codType.
                 * 
                 */
                public byte getCodType() {
                    return codType;
                }

                /**
                 * Définit la valeur de la propriété codType.
                 * 
                 */
                public void setCodType(byte value) {
                    this.codType = value;
                }

                /**
                 * Obtient la valeur de la propriété libelleCodType.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLibelleCodType() {
                    return libelleCodType;
                }

                /**
                 * Définit la valeur de la propriété libelleCodType.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLibelleCodType(String value) {
                    this.libelleCodType = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.</p>
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       <sequence>
             *         <element name="DateInformationTitulaire" type="{}T_DateJJMMAAAA" minOccurs="0"/>
             *         <element name="DatePublicationJO" type="{}T_DateJJMMAAAA"/>
             *       </sequence>
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "dateInformationTitulaire",
                "datePublicationJO"
            })
            public static class ObligationInfoPub {

                @XmlElement(name = "DateInformationTitulaire")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String dateInformationTitulaire;
                @XmlElement(name = "DatePublicationJO", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String datePublicationJO;

                /**
                 * Obtient la valeur de la propriété dateInformationTitulaire.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDateInformationTitulaire() {
                    return dateInformationTitulaire;
                }

                /**
                 * Définit la valeur de la propriété dateInformationTitulaire.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDateInformationTitulaire(String value) {
                    this.dateInformationTitulaire = value;
                }

                /**
                 * Obtient la valeur de la propriété datePublicationJO.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatePublicationJO() {
                    return datePublicationJO;
                }

                /**
                 * Définit la valeur de la propriété datePublicationJO.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatePublicationJO(String value) {
                    this.datePublicationJO = value;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.</p>
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
             * 
             * <pre>{@code
             * <complexType>
             *   <complexContent>
             *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       <sequence>
             *         <element name="DateDerniereOperation" type="{}T_DateJJMMAAAA" minOccurs="0"/>
             *         <element name="DatePrescriptionCompte" type="{}T_DateJJMMAAAA"/>
             *       </sequence>
             *     </restriction>
             *   </complexContent>
             * </complexType>
             * }</pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "dateDerniereOperation",
                "datePrescriptionCompte"
            })
            public static class PrescriptionCompte {

                @XmlElement(name = "DateDerniereOperation")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String dateDerniereOperation;
                @XmlElement(name = "DatePrescriptionCompte", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String datePrescriptionCompte;

                /**
                 * Obtient la valeur de la propriété dateDerniereOperation.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDateDerniereOperation() {
                    return dateDerniereOperation;
                }

                /**
                 * Définit la valeur de la propriété dateDerniereOperation.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDateDerniereOperation(String value) {
                    this.dateDerniereOperation = value;
                }

                /**
                 * Obtient la valeur de la propriété datePrescriptionCompte.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDatePrescriptionCompte() {
                    return datePrescriptionCompte;
                }

                /**
                 * Définit la valeur de la propriété datePrescriptionCompte.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDatePrescriptionCompte(String value) {
                    this.datePrescriptionCompte = value;
                }

            }

        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.</p>
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence maxOccurs="unbounded">
     *         <element name="DetailsDevise">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="Devise" type="{}T_TypeDevise"/>
     *                   <element name="NombreLigne" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *                   <element name="MontantTotal" type="{}T_Montant"/>
     *                 </sequence>
     *               </restriction>
     *             </complexContent>
     *           </complexType>
     *         </element>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "detailsDevise"
    })
    public static class TotauxParDevise {

        @XmlElement(name = "DetailsDevise", required = true)
        protected List<Section1 .TotauxParDevise.DetailsDevise> detailsDevise;

        /**
         * Gets the value of the detailsDevise property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detailsDevise property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getDetailsDevise().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Section1 .TotauxParDevise.DetailsDevise }
         * </p>
         * 
         * 
         * @return
         *     The value of the detailsDevise property.
         */
        public List<Section1 .TotauxParDevise.DetailsDevise> getDetailsDevise() {
            if (detailsDevise == null) {
                detailsDevise = new ArrayList<>();
            }
            return this.detailsDevise;
        }


        /**
         * <p>Classe Java pour anonymous complex type.</p>
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <sequence>
         *         <element name="Devise" type="{}T_TypeDevise"/>
         *         <element name="NombreLigne" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
         *         <element name="MontantTotal" type="{}T_Montant"/>
         *       </sequence>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "devise",
            "nombreLigne",
            "montantTotal"
        })
        public static class DetailsDevise {

            @XmlElement(name = "Devise", required = true)
            protected String devise;
            @XmlElement(name = "NombreLigne", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger nombreLigne;
            @XmlElement(name = "MontantTotal", required = true)
            protected String montantTotal;

            /**
             * Obtient la valeur de la propriété devise.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDevise() {
                return devise;
            }

            /**
             * Définit la valeur de la propriété devise.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDevise(String value) {
                this.devise = value;
            }

            /**
             * Obtient la valeur de la propriété nombreLigne.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNombreLigne() {
                return nombreLigne;
            }

            /**
             * Définit la valeur de la propriété nombreLigne.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNombreLigne(BigInteger value) {
                this.nombreLigne = value;
            }

            /**
             * Obtient la valeur de la propriété montantTotal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMontantTotal() {
                return montantTotal;
            }

            /**
             * Définit la valeur de la propriété montantTotal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMontantTotal(String value) {
                this.montantTotal = value;
            }

        }

    }

}
