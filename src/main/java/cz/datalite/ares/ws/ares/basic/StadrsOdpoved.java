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
 * <p>Java class for stadrs_odpoved complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stadrs_odpoved"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vsechna_slova" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}vysledek_dotazu"/&gt;
 *         &lt;element name="Po_redukci_slov" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}vysledek_dotazu" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stadrs_odpoved", propOrder = {
    "vsechnaSlova",
    "poRedukciSlov"
})
public class StadrsOdpoved {

    @XmlElement(name = "Vsechna_slova", required = true)
    protected VysledekDotazu vsechnaSlova;
    @XmlElement(name = "Po_redukci_slov")
    protected VysledekDotazu poRedukciSlov;

    /**
     * Gets the value of the vsechnaSlova property.
     * 
     * @return
     *     possible object is
     *     {@link VysledekDotazu }
     *     
     */
    public VysledekDotazu getVsechnaSlova() {
        return vsechnaSlova;
    }

    /**
     * Sets the value of the vsechnaSlova property.
     * 
     * @param value
     *     allowed object is
     *     {@link VysledekDotazu }
     *     
     */
    public void setVsechnaSlova(VysledekDotazu value) {
        this.vsechnaSlova = value;
    }

    /**
     * Gets the value of the poRedukciSlov property.
     * 
     * @return
     *     possible object is
     *     {@link VysledekDotazu }
     *     
     */
    public VysledekDotazu getPoRedukciSlov() {
        return poRedukciSlov;
    }

    /**
     * Sets the value of the poRedukciSlov property.
     * 
     * @param value
     *     allowed object is
     *     {@link VysledekDotazu }
     *     
     */
    public void setPoRedukciSlov(VysledekDotazu value) {
        this.poRedukciSlov = value;
    }

}
