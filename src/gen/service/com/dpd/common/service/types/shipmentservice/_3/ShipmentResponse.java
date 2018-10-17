
package com.dpd.common.service.types.shipmentservice._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Bundles shipment response data.
 * 
 * <p>Java-Klasse für shipmentResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="shipmentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mpsId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="parcelInformation" type="{http://dpd.com/common/service/types/ShipmentService/3.2}parcelInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="faults" type="{http://dpd.com/common/service/types/ShipmentService/3.2}faultCodeType" maxOccurs="3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shipmentResponse", propOrder = {
    "identificationNumber",
    "mpsId",
    "parcelInformation",
    "faults"
})
public class ShipmentResponse {

    protected String identificationNumber;
    protected String mpsId;
    protected List<ParcelInformationType> parcelInformation;
    protected List<FaultCodeType> faults;

    /**
     * Ruft den Wert der identificationNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * Legt den Wert der identificationNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationNumber(String value) {
        this.identificationNumber = value;
    }

    /**
     * Ruft den Wert der mpsId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpsId() {
        return mpsId;
    }

    /**
     * Legt den Wert der mpsId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpsId(String value) {
        this.mpsId = value;
    }

    /**
     * Gets the value of the parcelInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parcelInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParcelInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParcelInformationType }
     * 
     * 
     */
    public List<ParcelInformationType> getParcelInformation() {
        if (parcelInformation == null) {
            parcelInformation = new ArrayList<ParcelInformationType>();
        }
        return this.parcelInformation;
    }

    /**
     * Gets the value of the faults property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faults property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaults().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaultCodeType }
     * 
     * 
     */
    public List<FaultCodeType> getFaults() {
        if (faults == null) {
            faults = new ArrayList<FaultCodeType>();
        }
        return this.faults;
    }

}
