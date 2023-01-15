
package sakine.ayoub.proxy;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOperation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="typeOperation">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="credit"/>
 *     <enumeration value="debit"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeOperation")
@XmlEnum
public enum TypeOperation {

    @XmlEnumValue("credit")
    CREDIT("credit"),
    @XmlEnumValue("debit")
    DEBIT("debit");
    private final String value;

    TypeOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOperation fromValue(String v) {
        for (TypeOperation c: TypeOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
