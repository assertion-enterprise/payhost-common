//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.22 at 06:53:12 PM SAST 
//


package za.co.paygate.payhost;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for WebPaymentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WebPaymentRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Account" type="{http://www.paygate.co.za/PayHOST}PayGateAccountType"/&gt;
 *         &lt;element name="Customer" type="{http://www.paygate.co.za/PayHOST}PersonType"/&gt;
 *         &lt;element name="Vault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VaultId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *         &lt;element name="PaymentType" type="{http://www.paygate.co.za/PayHOST}PaymentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Redirect" type="{http://www.paygate.co.za/PayHOST}RedirectRequestType"/&gt;
 *         &lt;element name="Order" type="{http://www.paygate.co.za/PayHOST}OrderType"/&gt;
 *         &lt;element name="ThreeDSecure" type="{http://www.paygate.co.za/PayHOST}ThreeDSecureType" minOccurs="0"/&gt;
 *         &lt;element name="Risk" type="{http://www.paygate.co.za/PayHOST}RiskType" minOccurs="0"/&gt;
 *         &lt;element name="UserDefinedFields" type="{http://www.paygate.co.za/PayHOST}KeyValueType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BillingDescriptor" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebPaymentRequestType", propOrder = {
    "account",
    "customer",
    "vault",
    "vaultId",
    "paymentType",
    "redirect",
    "order",
    "threeDSecure",
    "risk",
    "userDefinedFields",
    "billingDescriptor"
})
public class WebPaymentRequestType {

    @XmlElement(name = "Account", required = true)
    protected PayGateAccountType account;
    @XmlElement(name = "Customer", required = true)
    protected PersonType customer;
    @XmlElement(name = "Vault", defaultValue = "false")
    protected Boolean vault;
    @XmlElement(name = "VaultId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String vaultId;
    @XmlElement(name = "PaymentType")
    protected List<PaymentType> paymentType;
    @XmlElement(name = "Redirect", required = true)
    protected RedirectRequestType redirect;
    @XmlElement(name = "Order", required = true)
    protected OrderType order;
    @XmlElement(name = "ThreeDSecure")
    protected ThreeDSecureType threeDSecure;
    @XmlElement(name = "Risk")
    protected RiskType risk;
    @XmlElement(name = "UserDefinedFields")
    protected List<KeyValueType> userDefinedFields;
    @XmlElement(name = "BillingDescriptor")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String billingDescriptor;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link PayGateAccountType }
     *     
     */
    public PayGateAccountType getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayGateAccountType }
     *     
     */
    public void setAccount(PayGateAccountType value) {
        this.account = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link PersonType }
     *     
     */
    public PersonType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonType }
     *     
     */
    public void setCustomer(PersonType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the vault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVault() {
        return vault;
    }

    /**
     * Sets the value of the vault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVault(Boolean value) {
        this.vault = value;
    }

    /**
     * Gets the value of the vaultId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVaultId() {
        return vaultId;
    }

    /**
     * Sets the value of the vaultId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVaultId(String value) {
        this.vaultId = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentType }
     * 
     * 
     */
    public List<PaymentType> getPaymentType() {
        if (paymentType == null) {
            paymentType = new ArrayList<PaymentType>();
        }
        return this.paymentType;
    }

    /**
     * Gets the value of the redirect property.
     * 
     * @return
     *     possible object is
     *     {@link RedirectRequestType }
     *     
     */
    public RedirectRequestType getRedirect() {
        return redirect;
    }

    /**
     * Sets the value of the redirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectRequestType }
     *     
     */
    public void setRedirect(RedirectRequestType value) {
        this.redirect = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrder(OrderType value) {
        this.order = value;
    }

    /**
     * Gets the value of the threeDSecure property.
     * 
     * @return
     *     possible object is
     *     {@link ThreeDSecureType }
     *     
     */
    public ThreeDSecureType getThreeDSecure() {
        return threeDSecure;
    }

    /**
     * Sets the value of the threeDSecure property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreeDSecureType }
     *     
     */
    public void setThreeDSecure(ThreeDSecureType value) {
        this.threeDSecure = value;
    }

    /**
     * Gets the value of the risk property.
     * 
     * @return
     *     possible object is
     *     {@link RiskType }
     *     
     */
    public RiskType getRisk() {
        return risk;
    }

    /**
     * Sets the value of the risk property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskType }
     *     
     */
    public void setRisk(RiskType value) {
        this.risk = value;
    }

    /**
     * Gets the value of the userDefinedFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userDefinedFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserDefinedFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueType }
     * 
     * 
     */
    public List<KeyValueType> getUserDefinedFields() {
        if (userDefinedFields == null) {
            userDefinedFields = new ArrayList<KeyValueType>();
        }
        return this.userDefinedFields;
    }

    /**
     * Gets the value of the billingDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingDescriptor() {
        return billingDescriptor;
    }

    /**
     * Sets the value of the billingDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingDescriptor(String value) {
        this.billingDescriptor = value;
    }

}
