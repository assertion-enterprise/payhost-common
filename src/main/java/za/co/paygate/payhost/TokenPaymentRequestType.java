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
 * <p>Java class for TokenPaymentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TokenPaymentRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Account" type="{http://www.paygate.co.za/PayHOST}PayGateAccountType"/&gt;
 *         &lt;element name="Customer" type="{http://www.paygate.co.za/PayHOST}PersonType" minOccurs="0"/&gt;
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="TokenDetail" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *         &lt;element name="Vault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Redirect" type="{http://www.paygate.co.za/PayHOST}RedirectRequestType" minOccurs="0"/&gt;
 *         &lt;element name="Order" type="{http://www.paygate.co.za/PayHOST}OrderType"/&gt;
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
@XmlType(name = "TokenPaymentRequestType", propOrder = {
    "account",
    "customer",
    "token",
    "tokenDetail",
    "vault",
    "redirect",
    "order",
    "risk",
    "userDefinedFields",
    "billingDescriptor"
})
public class TokenPaymentRequestType {

    @XmlElement(name = "Account", required = true)
    protected PayGateAccountType account;
    @XmlElement(name = "Customer")
    protected PersonType customer;
    @XmlElement(name = "Token", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String token;
    @XmlElement(name = "TokenDetail", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tokenDetail;
    @XmlElement(name = "Vault", defaultValue = "false")
    protected Boolean vault;
    @XmlElement(name = "Redirect")
    protected RedirectRequestType redirect;
    @XmlElement(name = "Order", required = true)
    protected OrderType order;
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
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the tokenDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenDetail() {
        return tokenDetail;
    }

    /**
     * Sets the value of the tokenDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenDetail(String value) {
        this.tokenDetail = value;
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
