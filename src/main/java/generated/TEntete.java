//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v4.0.4 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
//


package generated;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * En-tête de la déclaration des comptes dormants
 * 
 * <p>Classe Java pour T_Entete complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType name="T_Entete">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MatriculeFiscal" type="{}T_MatriculeFiscal"/>
 *         <element name="RaisonSocial" type="{}T_ChaineTexte250"/>
 *         <element name="Exercice" type="{}T_Annee"/>
 *         <element name="ActeDeDepot" type="{}T_ActeDeDepot"/>
 *         <element name="ReferenceDeclaration" type="{}T_RefDec"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_Entete", propOrder = {
    "matriculeFiscal",
    "raisonSocial",
    "exercice",
    "acteDeDepot",
    "referenceDeclaration"
})
public class TEntete {

    @XmlElement(name = "MatriculeFiscal", required = true)
    protected String matriculeFiscal;
    @XmlElement(name = "RaisonSocial", required = true)
    protected String raisonSocial;
    @XmlElement(name = "Exercice", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar exercice;
    @XmlElement(name = "ActeDeDepot", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String acteDeDepot;
    @XmlElement(name = "ReferenceDeclaration")
    @XmlSchemaType(name = "integer")
    protected int referenceDeclaration;

    /**
     * Obtient la valeur de la propriété matriculeFiscal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculeFiscal() {
        return matriculeFiscal;
    }

    /**
     * Définit la valeur de la propriété matriculeFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculeFiscal(String value) {
        this.matriculeFiscal = value;
    }

    /**
     * Obtient la valeur de la propriété raisonSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaisonSocial() {
        return raisonSocial;
    }

    /**
     * Définit la valeur de la propriété raisonSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaisonSocial(String value) {
        this.raisonSocial = value;
    }

    /**
     * Obtient la valeur de la propriété exercice.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExercice() {
        return exercice;
    }

    /**
     * Définit la valeur de la propriété exercice.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExercice(XMLGregorianCalendar value) {
        this.exercice = value;
    }

    /**
     * Obtient la valeur de la propriété acteDeDepot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActeDeDepot() {
        return acteDeDepot;
    }

    /**
     * Définit la valeur de la propriété acteDeDepot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActeDeDepot(String value) {
        this.acteDeDepot = value;
    }

    /**
     * Obtient la valeur de la propriété referenceDeclaration.
     * 
     */
    public int getReferenceDeclaration() {
        return referenceDeclaration;
    }

    /**
     * Définit la valeur de la propriété referenceDeclaration.
     * 
     */
    public void setReferenceDeclaration(int value) {
        this.referenceDeclaration = value;
    }

}
