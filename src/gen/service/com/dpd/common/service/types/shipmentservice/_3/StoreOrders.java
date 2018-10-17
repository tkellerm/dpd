
package com.dpd.common.service.types.shipmentservice._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r storeOrders complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="storeOrders"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="printOptions" type="{http://dpd.com/common/service/types/ShipmentService/3.2}printOptions" minOccurs="0"/&gt;
 *         &lt;element name="order" type="{http://dpd.com/common/service/types/ShipmentService/3.2}shipmentServiceData" maxOccurs="30"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeOrders", propOrder = {
    "printOptions",
    "order"
})
public class StoreOrders {

    protected PrintOptions printOptions;
    @XmlElement(required = true)
    protected List<ShipmentServiceData> order;

    /**
     * Ruft den Wert der printOptions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrintOptions }
     *     
     */
    public PrintOptions getPrintOptions() {
        return printOptions;
    }

    /**
     * Legt den Wert der printOptions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintOptions }
     *     
     */
    public void setPrintOptions(PrintOptions value) {
        this.printOptions = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the order property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentServiceData }
     * 
     * 
     */
    public List<ShipmentServiceData> getOrder() {
        if (order == null) {
            order = new ArrayList<ShipmentServiceData>();
        }
        return this.order;
    }

}
