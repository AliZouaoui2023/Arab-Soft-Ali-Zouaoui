//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v4.0.4 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
//


package generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Type de l'action de dépôt : A (ajout), M (modification), I (inchangé).
 *                            Seules les majuscules sont autorisées.
 * 
 * <p>Classe Java pour T_TypeAction.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * <pre>{@code
 * <simpleType name="T_TypeAction">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     <length value="1"/>
 *     <enumeration value="A"/>
 *     <enumeration value="M"/>
 *     <enumeration value="I"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "T_TypeAction")
@XmlEnum
public enum TTypeAction {

    A,
    M,
    I;

    public String value() {
        return name();
    }

    public static TTypeAction fromValue(String v) {
        return valueOf(v);
    }

}
