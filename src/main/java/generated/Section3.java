//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v4.0.4 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
//


package generated;

import java.math.BigDecimal;
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
 *         <element name="ListeContrats">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence maxOccurs="unbounded">
 *                   <element name="Contrat">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="ContratsAssuranceConstitutionPat">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="NumContrat" type="{}T_AlphaNum"/>
 *                                       <element name="CategContrat" type="{}T_CategContrat"/>
 *                                       <element name="NomCommercialContrat" type="{}T_ChaineTexte250"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="SouscripteurDeContratAdh">
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
 *                             <element name="BeneficiairesContrats">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence maxOccurs="unbounded">
 *                                       <element name="Beneficiaire">
 *                                         <complexType>
 *                                           <complexContent>
 *                                             <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               <sequence>
 *                                                 <element name="NomPrenomRS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 <element name="TypeIdent" type="{}T_TypeIdent" minOccurs="0"/>
 *                                                 <element name="LibelleCodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 <element name="NumIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 <element name="DateNaissance" type="{}T_DateJJMMAAAA" minOccurs="0"/>
 *                                                 <element name="Part" type="{}T_PourcentageDecimal" minOccurs="0"/>
 *                                               </sequence>
 *                                             </restriction>
 *                                           </complexContent>
 *                                         </complexType>
 *                                       </element>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="Exigible">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="MotifEcheance" type="{}T_MotifEcheance"/>
 *                                       <element name="LibExig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       <element name="DateEcheance" type="{}T_DateJJMMAAAA"/>
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
 *                             <element name="DecheanceAuTerme">
 *                               <complexType>
 *                                 <complexContent>
 *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     <sequence>
 *                                       <element name="TypeDerniereOpRecLg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       <element name="DateDerniereOperation" type="{}T_DateJJMMAAAA" minOccurs="0"/>
 *                                       <element name="DatePrescriptionCompte" type="{}T_DateJJMMAAAA"/>
 *                                     </sequence>
 *                                   </restriction>
 *                                 </complexContent>
 *                               </complexType>
 *                             </element>
 *                             <element name="Devise" type="{}T_TypeDevise"/>
 *                             <element name="MontantTransfert" type="{}T_Montant"/>
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
    "versionDocument",
    "entete",
    "listeContrats",
    "detailsDevise"
})
@XmlRootElement(name = "section3")
public class Section3 {

    @XmlElement(name = "VersionDocument", required = true)
    @XmlSchemaType(name = "string")
    protected TVersionDoc versionDocument;
    @XmlElement(name = "Entete", required = true)
    protected TEntete entete;
    @XmlElement(name = "ListeContrats", required = true)
    protected Section3 .ListeContrats listeContrats;
    @XmlElement(name = "DetailsDevise", required = true)
    protected Section3 .DetailsDevise detailsDevise;

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
     * Obtient la valeur de la propriété listeContrats.
     * 
     * @return
     *     possible object is
     *     {@link Section3 .ListeContrats }
     *     
     */
    public Section3 .ListeContrats getListeContrats() {
        return listeContrats;
    }

    /**
     * Définit la valeur de la propriété listeContrats.
     * 
     * @param value
     *     allowed object is
     *     {@link Section3 .ListeContrats }
     *     
     */
    public void setListeContrats(Section3 .ListeContrats value) {
        this.listeContrats = value;
    }

    /**
     * Obtient la valeur de la propriété detailsDevise.
     * 
     * @return
     *     possible object is
     *     {@link Section3 .DetailsDevise }
     *     
     */
    public Section3 .DetailsDevise getDetailsDevise() {
        return detailsDevise;
    }

    /**
     * Définit la valeur de la propriété detailsDevise.
     * 
     * @param value
     *     allowed object is
     *     {@link Section3 .DetailsDevise }
     *     
     */
    public void setDetailsDevise(Section3 .DetailsDevise value) {
        this.detailsDevise = value;
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
     *         <element name="Contrat">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="ContratsAssuranceConstitutionPat">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="NumContrat" type="{}T_AlphaNum"/>
     *                             <element name="CategContrat" type="{}T_CategContrat"/>
     *                             <element name="NomCommercialContrat" type="{}T_ChaineTexte250"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="SouscripteurDeContratAdh">
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
     *                   <element name="BeneficiairesContrats">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence maxOccurs="unbounded">
     *                             <element name="Beneficiaire">
     *                               <complexType>
     *                                 <complexContent>
     *                                   <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     <sequence>
     *                                       <element name="NomPrenomRS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       <element name="TypeIdent" type="{}T_TypeIdent" minOccurs="0"/>
     *                                       <element name="LibelleCodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       <element name="NumIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       <element name="DateNaissance" type="{}T_DateJJMMAAAA" minOccurs="0"/>
     *                                       <element name="Part" type="{}T_PourcentageDecimal" minOccurs="0"/>
     *                                     </sequence>
     *                                   </restriction>
     *                                 </complexContent>
     *                               </complexType>
     *                             </element>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Exigible">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="MotifEcheance" type="{}T_MotifEcheance"/>
     *                             <element name="LibExig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             <element name="DateEcheance" type="{}T_DateJJMMAAAA"/>
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
     *                   <element name="DecheanceAuTerme">
     *                     <complexType>
     *                       <complexContent>
     *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           <sequence>
     *                             <element name="TypeDerniereOpRecLg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             <element name="DateDerniereOperation" type="{}T_DateJJMMAAAA" minOccurs="0"/>
     *                             <element name="DatePrescriptionCompte" type="{}T_DateJJMMAAAA"/>
     *                           </sequence>
     *                         </restriction>
     *                       </complexContent>
     *                     </complexType>
     *                   </element>
     *                   <element name="Devise" type="{}T_TypeDevise"/>
     *                   <element name="MontantTransfert" type="{}T_Montant"/>
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
        "contrat"
    })
    public static class ListeContrats {

        @XmlElement(name = "Contrat", required = true)
        protected List<Section3 .ListeContrats.Contrat> contrat;

        /**
         * Gets the value of the contrat property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contrat property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getContrat().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Section3 .ListeContrats.Contrat }
         * </p>
         * 
         * 
         * @return
         *     The value of the contrat property.
         */
        public List<Section3 .ListeContrats.Contrat> getContrat() {
            if (contrat == null) {
                contrat = new ArrayList<>();
            }
            return this.contrat;
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
         *         <element name="ContratsAssuranceConstitutionPat">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="NumContrat" type="{}T_AlphaNum"/>
         *                   <element name="CategContrat" type="{}T_CategContrat"/>
         *                   <element name="NomCommercialContrat" type="{}T_ChaineTexte250"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="SouscripteurDeContratAdh">
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
         *         <element name="BeneficiairesContrats">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence maxOccurs="unbounded">
         *                   <element name="Beneficiaire">
         *                     <complexType>
         *                       <complexContent>
         *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           <sequence>
         *                             <element name="NomPrenomRS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             <element name="TypeIdent" type="{}T_TypeIdent" minOccurs="0"/>
         *                             <element name="LibelleCodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             <element name="NumIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             <element name="DateNaissance" type="{}T_DateJJMMAAAA" minOccurs="0"/>
         *                             <element name="Part" type="{}T_PourcentageDecimal" minOccurs="0"/>
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
         *         <element name="Exigible">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="MotifEcheance" type="{}T_MotifEcheance"/>
         *                   <element name="LibExig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   <element name="DateEcheance" type="{}T_DateJJMMAAAA"/>
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
         *         <element name="DecheanceAuTerme">
         *           <complexType>
         *             <complexContent>
         *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 <sequence>
         *                   <element name="TypeDerniereOpRecLg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   <element name="DateDerniereOperation" type="{}T_DateJJMMAAAA" minOccurs="0"/>
         *                   <element name="DatePrescriptionCompte" type="{}T_DateJJMMAAAA"/>
         *                 </sequence>
         *               </restriction>
         *             </complexContent>
         *           </complexType>
         *         </element>
         *         <element name="Devise" type="{}T_TypeDevise"/>
         *         <element name="MontantTransfert" type="{}T_Montant"/>
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
            "contratsAssuranceConstitutionPat",
            "souscripteurDeContratAdh",
            "beneficiairesContrats",
            "exigible",
            "obligationInfoPub",
            "decheanceAuTerme",
            "devise",
            "montantTransfert",
            "typeActionDepot"
        })
        public static class Contrat {

            @XmlElement(name = "ContratsAssuranceConstitutionPat", required = true)
            protected Section3 .ListeContrats.Contrat.ContratsAssuranceConstitutionPat contratsAssuranceConstitutionPat;
            @XmlElement(name = "SouscripteurDeContratAdh", required = true)
            protected Section3 .ListeContrats.Contrat.SouscripteurDeContratAdh souscripteurDeContratAdh;
            @XmlElement(name = "BeneficiairesContrats", required = true)
            protected Section3 .ListeContrats.Contrat.BeneficiairesContrats beneficiairesContrats;
            @XmlElement(name = "Exigible", required = true)
            protected Section3 .ListeContrats.Contrat.Exigible exigible;
            @XmlElement(name = "ObligationInfoPub", required = true)
            protected Section3 .ListeContrats.Contrat.ObligationInfoPub obligationInfoPub;
            @XmlElement(name = "DecheanceAuTerme", required = true)
            protected Section3 .ListeContrats.Contrat.DecheanceAuTerme decheanceAuTerme;
            @XmlElement(name = "Devise", required = true)
            protected String devise;
            @XmlElement(name = "MontantTransfert", required = true)
            protected String montantTransfert;
            @XmlElement(name = "TypeActionDepot", required = true)
            @XmlSchemaType(name = "token")
            protected TTypeAction typeActionDepot;

            /**
             * Obtient la valeur de la propriété contratsAssuranceConstitutionPat.
             * 
             * @return
             *     possible object is
             *     {@link Section3 .ListeContrats.Contrat.ContratsAssuranceConstitutionPat }
             *     
             */
            public Section3 .ListeContrats.Contrat.ContratsAssuranceConstitutionPat getContratsAssuranceConstitutionPat() {
                return contratsAssuranceConstitutionPat;
            }

            /**
             * Définit la valeur de la propriété contratsAssuranceConstitutionPat.
             * 
             * @param value
             *     allowed object is
             *     {@link Section3 .ListeContrats.Contrat.ContratsAssuranceConstitutionPat }
             *     
             */
            public void setContratsAssuranceConstitutionPat(Section3 .ListeContrats.Contrat.ContratsAssuranceConstitutionPat value) {
                this.contratsAssuranceConstitutionPat = value;
            }

            /**
             * Obtient la valeur de la propriété souscripteurDeContratAdh.
             * 
             * @return
             *     possible object is
             *     {@link Section3 .ListeContrats.Contrat.SouscripteurDeContratAdh }
             *     
             */
            public Section3 .ListeContrats.Contrat.SouscripteurDeContratAdh getSouscripteurDeContratAdh() {
                return souscripteurDeContratAdh;
            }

            /**
             * Définit la valeur de la propriété souscripteurDeContratAdh.
             * 
             * @param value
             *     allowed object is
             *     {@link Section3 .ListeContrats.Contrat.SouscripteurDeContratAdh }
             *     
             */
            public void setSouscripteurDeContratAdh(Section3 .ListeContrats.Contrat.SouscripteurDeContratAdh value) {
                this.souscripteurDeContratAdh = value;
            }

            /**
             * Obtient la valeur de la propriété beneficiairesContrats.
             * 
             * @return
             *     possible object is
             *     {@link Section3 .ListeContrats.Contrat.BeneficiairesContrats }
             *     
             */
            public Section3 .ListeContrats.Contrat.BeneficiairesContrats getBeneficiairesContrats() {
                return beneficiairesContrats;
            }

            /**
             * Définit la valeur de la propriété beneficiairesContrats.
             * 
             * @param value
             *     allowed object is
             *     {@link Section3 .ListeContrats.Contrat.BeneficiairesContrats }
             *     
             */
            public void setBeneficiairesContrats(Section3 .ListeContrats.Contrat.BeneficiairesContrats value) {
                this.beneficiairesContrats = value;
            }

            /**
             * Obtient la valeur de la propriété exigible.
             * 
             * @return
             *     possible object is
             *     {@link Section3 .ListeContrats.Contrat.Exigible }
             *     
             */
            public Section3 .ListeContrats.Contrat.Exigible getExigible() {
                return exigible;
            }

            /**
             * Définit la valeur de la propriété exigible.
             * 
             * @param value
             *     allowed object is
             *     {@link Section3 .ListeContrats.Contrat.Exigible }
             *     
             */
            public void setExigible(Section3 .ListeContrats.Contrat.Exigible value) {
                this.exigible = value;
            }

            /**
             * Obtient la valeur de la propriété obligationInfoPub.
             * 
             * @return
             *     possible object is
             *     {@link Section3 .ListeContrats.Contrat.ObligationInfoPub }
             *     
             */
            public Section3 .ListeContrats.Contrat.ObligationInfoPub getObligationInfoPub() {
                return obligationInfoPub;
            }

            /**
             * Définit la valeur de la propriété obligationInfoPub.
             * 
             * @param value
             *     allowed object is
             *     {@link Section3 .ListeContrats.Contrat.ObligationInfoPub }
             *     
             */
            public void setObligationInfoPub(Section3 .ListeContrats.Contrat.ObligationInfoPub value) {
                this.obligationInfoPub = value;
            }

            /**
             * Obtient la valeur de la propriété decheanceAuTerme.
             * 
             * @return
             *     possible object is
             *     {@link Section3 .ListeContrats.Contrat.DecheanceAuTerme }
             *     
             */
            public Section3 .ListeContrats.Contrat.DecheanceAuTerme getDecheanceAuTerme() {
                return decheanceAuTerme;
            }

            /**
             * Définit la valeur de la propriété decheanceAuTerme.
             * 
             * @param value
             *     allowed object is
             *     {@link Section3 .ListeContrats.Contrat.DecheanceAuTerme }
             *     
             */
            public void setDecheanceAuTerme(Section3 .ListeContrats.Contrat.DecheanceAuTerme value) {
                this.decheanceAuTerme = value;
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
             * Obtient la valeur de la propriété montantTransfert.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMontantTransfert() {
                return montantTransfert;
            }

            /**
             * Définit la valeur de la propriété montantTransfert.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMontantTransfert(String value) {
                this.montantTransfert = value;
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
             *       <sequence maxOccurs="unbounded">
             *         <element name="Beneficiaire">
             *           <complexType>
             *             <complexContent>
             *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 <sequence>
             *                   <element name="NomPrenomRS" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   <element name="TypeIdent" type="{}T_TypeIdent" minOccurs="0"/>
             *                   <element name="LibelleCodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   <element name="NumIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   <element name="DateNaissance" type="{}T_DateJJMMAAAA" minOccurs="0"/>
             *                   <element name="Part" type="{}T_PourcentageDecimal" minOccurs="0"/>
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
                "beneficiaire"
            })
            public static class BeneficiairesContrats {

                @XmlElement(name = "Beneficiaire", required = true)
                protected List<Section3 .ListeContrats.Contrat.BeneficiairesContrats.Beneficiaire> beneficiaire;

                /**
                 * Gets the value of the beneficiaire property.
                 * 
                 * <p>This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the beneficiaire property.</p>
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * </p>
                 * <pre>
                 * getBeneficiaire().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Section3 .ListeContrats.Contrat.BeneficiairesContrats.Beneficiaire }
                 * </p>
                 * 
                 * 
                 * @return
                 *     The value of the beneficiaire property.
                 */
                public List<Section3 .ListeContrats.Contrat.BeneficiairesContrats.Beneficiaire> getBeneficiaire() {
                    if (beneficiaire == null) {
                        beneficiaire = new ArrayList<>();
                    }
                    return this.beneficiaire;
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
                 *         <element name="NomPrenomRS" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         <element name="TypeIdent" type="{}T_TypeIdent" minOccurs="0"/>
                 *         <element name="LibelleCodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         <element name="NumIdent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         <element name="DateNaissance" type="{}T_DateJJMMAAAA" minOccurs="0"/>
                 *         <element name="Part" type="{}T_PourcentageDecimal" minOccurs="0"/>
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
                    "dateNaissance",
                    "part"
                })
                public static class Beneficiaire {

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
                    @XmlElement(name = "Part")
                    protected BigDecimal part;

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

                    /**
                     * Obtient la valeur de la propriété part.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getPart() {
                        return part;
                    }

                    /**
                     * Définit la valeur de la propriété part.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setPart(BigDecimal value) {
                        this.part = value;
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
             *       <sequence>
             *         <element name="NumContrat" type="{}T_AlphaNum"/>
             *         <element name="CategContrat" type="{}T_CategContrat"/>
             *         <element name="NomCommercialContrat" type="{}T_ChaineTexte250"/>
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
                "numContrat",
                "categContrat",
                "nomCommercialContrat"
            })
            public static class ContratsAssuranceConstitutionPat {

                @XmlElement(name = "NumContrat", required = true)
                protected String numContrat;
                @XmlElement(name = "CategContrat", required = true)
                protected String categContrat;
                @XmlElement(name = "NomCommercialContrat", required = true)
                protected String nomCommercialContrat;

                /**
                 * Obtient la valeur de la propriété numContrat.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumContrat() {
                    return numContrat;
                }

                /**
                 * Définit la valeur de la propriété numContrat.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumContrat(String value) {
                    this.numContrat = value;
                }

                /**
                 * Obtient la valeur de la propriété categContrat.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCategContrat() {
                    return categContrat;
                }

                /**
                 * Définit la valeur de la propriété categContrat.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCategContrat(String value) {
                    this.categContrat = value;
                }

                /**
                 * Obtient la valeur de la propriété nomCommercialContrat.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNomCommercialContrat() {
                    return nomCommercialContrat;
                }

                /**
                 * Définit la valeur de la propriété nomCommercialContrat.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNomCommercialContrat(String value) {
                    this.nomCommercialContrat = value;
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
             *         <element name="TypeDerniereOpRecLg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "typeDerniereOpRecLg",
                "dateDerniereOperation",
                "datePrescriptionCompte"
            })
            public static class DecheanceAuTerme {

                @XmlElement(name = "TypeDerniereOpRecLg")
                protected String typeDerniereOpRecLg;
                @XmlElement(name = "DateDerniereOperation")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String dateDerniereOperation;
                @XmlElement(name = "DatePrescriptionCompte", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String datePrescriptionCompte;

                /**
                 * Obtient la valeur de la propriété typeDerniereOpRecLg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTypeDerniereOpRecLg() {
                    return typeDerniereOpRecLg;
                }

                /**
                 * Définit la valeur de la propriété typeDerniereOpRecLg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTypeDerniereOpRecLg(String value) {
                    this.typeDerniereOpRecLg = value;
                }

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
             *         <element name="MotifEcheance" type="{}T_MotifEcheance"/>
             *         <element name="LibExig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         <element name="DateEcheance" type="{}T_DateJJMMAAAA"/>
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
                "motifEcheance",
                "libExig",
                "dateEcheance"
            })
            public static class Exigible {

                @XmlElement(name = "MotifEcheance", required = true)
                protected String motifEcheance;
                /**
                 * LibExig doit exister et être non vide si MotifEcheance = '3'; sinon, absent
                 * 
                 */
                @XmlElement(name = "LibExig")
                protected String libExig;
                @XmlElement(name = "DateEcheance", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String dateEcheance;

                /**
                 * Obtient la valeur de la propriété motifEcheance.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMotifEcheance() {
                    return motifEcheance;
                }

                /**
                 * Définit la valeur de la propriété motifEcheance.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMotifEcheance(String value) {
                    this.motifEcheance = value;
                }

                /**
                 * LibExig doit exister et être non vide si MotifEcheance = '3'; sinon, absent
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLibExig() {
                    return libExig;
                }

                /**
                 * Définit la valeur de la propriété libExig.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 * @see #getLibExig()
                 */
                public void setLibExig(String value) {
                    this.libExig = value;
                }

                /**
                 * Obtient la valeur de la propriété dateEcheance.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDateEcheance() {
                    return dateEcheance;
                }

                /**
                 * Définit la valeur de la propriété dateEcheance.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDateEcheance(String value) {
                    this.dateEcheance = value;
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
            public static class SouscripteurDeContratAdh {

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

        }

    }

}
