//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.13 at 09:19:26 PM EDT 
//


package cz.datalite.ares.ws.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vystup_format.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="vystup_format"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="XML"/&gt;
 *     &lt;enumeration value="HTML"/&gt;
 *     &lt;enumeration value="XHTML"/&gt;
 *     &lt;enumeration value="TEXT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "vystup_format")
@XmlEnum
public enum VystupFormat {

    XML,
    HTML,
    XHTML,
    TEXT;

    public String value() {
        return name();
    }

    public static VystupFormat fromValue(String v) {
        return valueOf(v);
    }

}
