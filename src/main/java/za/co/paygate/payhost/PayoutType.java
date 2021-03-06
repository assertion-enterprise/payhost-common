//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.22 at 06:53:12 PM SAST 
//


package za.co.paygate.payhost;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayoutType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayoutType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Eft"/&gt;
 *     &lt;enumeration value="Salary"/&gt;
 *     &lt;enumeration value="PayAndClear"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PayoutType")
@XmlEnum
public enum PayoutType {

    @XmlEnumValue("Eft")
    EFT("Eft"),
    @XmlEnumValue("Salary")
    SALARY("Salary"),
    @XmlEnumValue("PayAndClear")
    PAY_AND_CLEAR("PayAndClear");
    private final String value;

    PayoutType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayoutType fromValue(String v) {
        for (PayoutType c: PayoutType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
