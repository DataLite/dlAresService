//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.13 at 09:19:26 PM EDT 
//


package cz.datalite.ares.ws.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Částka vkladu slouží k uložení finančních obnosů v Kč nebo volným textem
 * 
 * <p>Java class for vklad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vklad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/&gt;
 *         &lt;element name="OST" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vklad", propOrder = {
    "kc",
    "ost"
})
public class Vklad {

    @XmlElement(name = "KC")
    protected String kc;
    @XmlElement(name = "OST")
    protected String ost;

    /**
     * Gets the value of the kc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKC() {
        return kc;
    }

    /**
     * Sets the value of the kc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKC(String value) {
        this.kc = value;
    }

    /**
     * Gets the value of the ost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOST() {
        return ost;
    }

    /**
     * Sets the value of the ost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOST(String value) {
        this.ost = value;
    }

}