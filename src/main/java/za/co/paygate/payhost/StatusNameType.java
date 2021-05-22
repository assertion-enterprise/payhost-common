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
 * <p>Java class for StatusNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusNameType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *     &lt;enumeration value="RiskRejected"/&gt;
 *     &lt;enumeration value="ValidationError"/&gt;
 *     &lt;enumeration value="WebRedirectRequired"/&gt;
 *     &lt;enumeration value="ThreeDSecureRedirectRequired"/&gt;
 *     &lt;enumeration value="VaultFailure"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusNameType")
@XmlEnum
public enum StatusNameType {

    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("RiskRejected")
    RISK_REJECTED("RiskRejected"),
    @XmlEnumValue("ValidationError")
    VALIDATION_ERROR("ValidationError"),
    @XmlEnumValue("WebRedirectRequired")
    WEB_REDIRECT_REQUIRED("WebRedirectRequired"),
    @XmlEnumValue("ThreeDSecureRedirectRequired")
    THREE_D_SECURE_REDIRECT_REQUIRED("ThreeDSecureRedirectRequired"),
    @XmlEnumValue("VaultFailure")
    VAULT_FAILURE("VaultFailure");
    private final String value;

    StatusNameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatusNameType fromValue(String v) {
        for (StatusNameType c: StatusNameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}