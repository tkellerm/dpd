
package com.dpd.common.service.types.shipmentservice._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Bundles shipment service data.
 * 
 * <p>Java-Klasse für shipmentServiceData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="shipmentServiceData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="generalShipmentData" type="{http://dpd.com/common/service/types/ShipmentService/3.2}generalShipmentData"/&gt;
 *         &lt;element name="parcels" type="{http://dpd.com/common/service/types/ShipmentService/3.2}parcel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productAndServiceData" type="{http://dpd.com/common/service/types/ShipmentService/3.2}productAndServiceData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shipmentServiceData", propOrder = {
    "generalShipmentData",
    "parcels",
    "productAndServiceData"
})
public class ShipmentServiceData {

    @XmlElement(required = true)
    protected GeneralShipmentData generalShipmentData;
    protected List<Parcel> parcels;
    @XmlElement(required = true)
    protected ProductAndServiceData productAndServiceData;

    /**
     * Ruft den Wert der generalShipmentData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeneralShipmentData }
     *     
     */
    public GeneralShipmentData getGeneralShipmentData() {
        return generalShipmentData;
    }

    /**
     * Legt den Wert der generalShipmentData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralShipmentData }
     *     
     */
    public void setGeneralShipmentData(GeneralShipmentData value) {
        this.generalShipmentData = value;
    }

    /**
     * Gets the value of the parcels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parcels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParcels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parcel }
     * 
     * 
     */
    public List<Parcel> getParcels() {
        if (parcels == null) {
            parcels = new ArrayList<Parcel>();
        }
        return this.parcels;
    }

    /**
     * Ruft den Wert der productAndServiceData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProductAndServiceData }
     *     
     */
    public ProductAndServiceData getProductAndServiceData() {
        return productAndServiceData;
    }

    /**
     * Legt den Wert der productAndServiceData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAndServiceData }
     *     
     */
    public void setProductAndServiceData(ProductAndServiceData value) {
        this.productAndServiceData = value;
    }

}
