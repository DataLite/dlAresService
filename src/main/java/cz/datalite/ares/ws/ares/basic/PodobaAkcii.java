//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.13 at 09:19:26 PM EDT 
//


package cz.datalite.ares.ws.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for podoba_akcii.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="podoba_akcii"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="v listinné podobě"/&gt;
 *     &lt;enumeration value="v zaknihované podobě"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "podoba_akcii")
@XmlEnum
public enum PodobaAkcii {

    @XmlEnumValue("v listinn\u00e9 podob\u011b")
    V_LISTINNÉ_PODOBĚ("v listinn\u00e9 podob\u011b"),
    @XmlEnumValue("v zaknihovan\u00e9 podob\u011b")
    V_ZAKNIHOVANÉ_PODOBĚ("v zaknihovan\u00e9 podob\u011b");
    private final String value;

    PodobaAkcii(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PodobaAkcii fromValue(String v) {
        for (PodobaAkcii c: PodobaAkcii.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}