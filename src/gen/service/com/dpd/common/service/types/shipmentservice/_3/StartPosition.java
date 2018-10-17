
package com.dpd.common.service.types.shipmentservice._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r startPosition.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="startPosition"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UPPER_LEFT"/&gt;
 *     &lt;enumeration value="UPPER_RIGHT"/&gt;
 *     &lt;enumeration value="LOWER_LEFT"/&gt;
 *     &lt;enumeration value="LOWER_RIGHT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "startPosition")
@XmlEnum
public enum StartPosition {


    /**
     * Print first label in the upper left corner of the A4 paper.
     * 
     */
    UPPER_LEFT,

    /**
     * Print first label in the upper right corner of the A4 paper.
     * 
     */
    UPPER_RIGHT,

    /**
     * Print first label in the lower left corner of the A4 paper.
     * 
     */
    LOWER_LEFT,

    /**
     * Print first label in the lower right corner of the A4 paper.
     * 
     */
    LOWER_RIGHT;

    public String value() {
        return name();
    }

    public static StartPosition fromValue(String v) {
        return valueOf(v);
    }

}
