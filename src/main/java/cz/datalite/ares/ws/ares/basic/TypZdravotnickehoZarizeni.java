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
import java.math.BigInteger;


/**
 * <p>Java class for typ_zdravotnickeho_zarizeni complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typ_zdravotnickeho_zarizeni"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ZZK" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ZZN" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typ_zdravotnickeho_zarizeni", propOrder = {
    "zzk",
    "zzn"
})
public class TypZdravotnickehoZarizeni {

    @XmlElement(name = "ZZK")
    protected BigInteger zzk;
    @XmlElement(name = "ZZN")
    protected String zzn;

    /**
     * Gets the value of the zzk property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZZK() {
        return zzk;
    }

    /**
     * Sets the value of the zzk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZZK(BigInteger value) {
        this.zzk = value;
    }

    /**
     * Gets the value of the zzn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZZN() {
        return zzn;
    }

    /**
     * Sets the value of the zzn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZZN(String value) {
        this.zzn = value;
    }

}
