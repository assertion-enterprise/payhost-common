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
 * <p>Java class for TransactionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionCodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="NotDone"/&gt;
 *     &lt;enumeration value="Approved"/&gt;
 *     &lt;enumeration value="Declined"/&gt;
 *     &lt;enumeration value="Paid"/&gt;
 *     &lt;enumeration value="Refunded"/&gt;
 *     &lt;enumeration value="ReceivedByPaygate"/&gt;
 *     &lt;enumeration value="RepliedToClient"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionCodeType")
@XmlEnum
public enum TransactionCodeType {

    @XmlEnumValue("NotDone")
    NOT_DONE("NotDone"),
    @XmlEnumValue("Approved")
    APPROVED("Approved"),
    @XmlEnumValue("Declined")
    DECLINED("Declined"),
    @XmlEnumValue("Paid")
    PAID("Paid"),
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded"),
    @XmlEnumValue("ReceivedByPaygate")
    RECEIVED_BY_PAYGATE("ReceivedByPaygate"),
    @XmlEnumValue("RepliedToClient")
    REPLIED_TO_CLIENT("RepliedToClient");
    private final String value;

    TransactionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionCodeType fromValue(String v) {
        for (TransactionCodeType c: TransactionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}