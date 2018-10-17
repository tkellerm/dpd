
package com.dpd.common.ws.loginservice.v2_0.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Is created when a user logs in and contains its login information.
 * 
 * <p>Java-Klasse für Login complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Login"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="delisId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerUid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="depot" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Login", propOrder = {
    "delisId",
    "customerUid",
    "authToken",
    "depot"
})
public class Login {

    @XmlElement(required = true)
    protected String delisId;
    @XmlElement(required = true)
    protected String customerUid;
    @XmlElement(required = true)
    protected String authToken;
    @XmlElement(required = true)
    protected String depot;

    /**
     * Ruft den Wert der delisId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelisId() {
        return delisId;
    }

    /**
     * Legt den Wert der delisId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelisId(String value) {
        this.delisId = value;
    }

    /**
     * Ruft den Wert der customerUid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUid() {
        return customerUid;
    }

    /**
     * Legt den Wert der customerUid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUid(String value) {
        this.customerUid = value;
    }

    /**
     * Ruft den Wert der authToken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthToken() {
        return authToken;
    }

    /**
     * Legt den Wert der authToken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthToken(String value) {
        this.authToken = value;
    }

    /**
     * Ruft den Wert der depot-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepot() {
        return depot;
    }

    /**
     * Legt den Wert der depot-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepot(String value) {
        this.depot = value;
    }

}
