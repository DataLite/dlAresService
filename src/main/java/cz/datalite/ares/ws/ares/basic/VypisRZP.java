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
 * Výpis z rejstříku živnostenského podnikání v ARES
 * 
 * <p>Java class for vypis_RZP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vypis_RZP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UVOD" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}uvod" minOccurs="0"/&gt;
 *         &lt;element name="ZAU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zakladni_udaje_RZP"/&gt;
 *         &lt;element name="REG" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}registrace_RZP" minOccurs="0"/&gt;
 *         &lt;element name="PZI" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ZI" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}zivnosti_RZP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_RZP", propOrder = {
    "uvod",
    "zau",
    "reg",
    "pzi",
    "zi"
})
public class VypisRZP {

    @XmlElement(name = "UVOD")
    protected Uvod uvod;
    @XmlElement(name = "ZAU", required = true)
    protected ZakladniUdajeRZP zau;
    @XmlElement(name = "REG")
    protected RegistraceRZP reg;
    @XmlElement(name = "PZI")
    protected BigInteger pzi;
    @XmlElement(name = "ZI")
    protected ZivnostiRZP zi;

    /**
     * Gets the value of the uvod property.
     * 
     * @return
     *     possible object is
     *     {@link Uvod }
     *     
     */
    public Uvod getUVOD() {
        return uvod;
    }

    /**
     * Sets the value of the uvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uvod }
     *     
     */
    public void setUVOD(Uvod value) {
        this.uvod = value;
    }

    /**
     * Gets the value of the zau property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeRZP }
     *     
     */
    public ZakladniUdajeRZP getZAU() {
        return zau;
    }

    /**
     * Sets the value of the zau property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeRZP }
     *     
     */
    public void setZAU(ZakladniUdajeRZP value) {
        this.zau = value;
    }

    /**
     * Gets the value of the reg property.
     * 
     * @return
     *     possible object is
     *     {@link RegistraceRZP }
     *     
     */
    public RegistraceRZP getREG() {
        return reg;
    }

    /**
     * Sets the value of the reg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistraceRZP }
     *     
     */
    public void setREG(RegistraceRZP value) {
        this.reg = value;
    }

    /**
     * Gets the value of the pzi property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPZI() {
        return pzi;
    }

    /**
     * Sets the value of the pzi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPZI(BigInteger value) {
        this.pzi = value;
    }

    /**
     * Gets the value of the zi property.
     * 
     * @return
     *     possible object is
     *     {@link ZivnostiRZP }
     *     
     */
    public ZivnostiRZP getZI() {
        return zi;
    }

    /**
     * Sets the value of the zi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZivnostiRZP }
     *     
     */
    public void setZI(ZivnostiRZP value) {
        this.zi = value;
    }

}
