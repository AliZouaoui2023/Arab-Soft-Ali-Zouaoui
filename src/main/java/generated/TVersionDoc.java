//
// Ce fichier a été généré par Eclipse Implementation of JAXB, v4.0.4 
// Voir https://eclipse-ee4j.github.io/jaxb-ri 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
//


package generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ce type représente la version du document, fixée à "version-1.0" conformément à la convention de versionnement sémantique.
 * 
 * <p>Classe Java pour T_VersionDoc.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * <pre>{@code
 * <simpleType name="T_VersionDoc">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="version-1.0"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "T_VersionDoc")
@XmlEnum
public enum TVersionDoc {

    @XmlEnumValue("version-1.0")
    VERSION_1_0("version-1.0");
    private final String value;

    TVersionDoc(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static TVersionDoc fromValue(String v) {
        for (TVersionDoc c: TVersionDoc.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
