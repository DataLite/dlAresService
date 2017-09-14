//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.13 at 09:19:26 PM EDT 
//


package cz.datalite.ares.ws.ares.basic;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Údaje k registraci, zrušení, likvidaci dle číselníku rozhodnutí
 * 
 * <p>Java class for rozhodnuti complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rozhodnuti"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Typ_rozhodnuti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cislo_rozhodnuti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Datum_rozhodnuti" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Pravni_moc" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rozhodnuti", propOrder = {
    "typRozhodnuti",
    "cisloRozhodnuti",
    "datumRozhodnuti",
    "pravniMoc"
})
public class Rozhodnuti {

    @XmlElement(name = "Typ_rozhodnuti")
    protected String typRozhodnuti;
    @XmlElement(name = "Cislo_rozhodnuti")
    protected String cisloRozhodnuti;
    @XmlElement(name = "Datum_rozhodnuti")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumRozhodnuti;
    @XmlElement(name = "Pravni_moc")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pravniMoc;

    /**
     * Gets the value of the typRozhodnuti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypRozhodnuti() {
        return typRozhodnuti;
    }

    /**
     * Sets the value of the typRozhodnuti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypRozhodnuti(String value) {
        this.typRozhodnuti = value;
    }

    /**
     * Gets the value of the cisloRozhodnuti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloRozhodnuti() {
        return cisloRozhodnuti;
    }

    /**
     * Sets the value of the cisloRozhodnuti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloRozhodnuti(String value) {
        this.cisloRozhodnuti = value;
    }

    /**
     * Gets the value of the datumRozhodnuti property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumRozhodnuti() {
        return datumRozhodnuti;
    }

    /**
     * Sets the value of the datumRozhodnuti property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumRozhodnuti(XMLGregorianCalendar value) {
        this.datumRozhodnuti = value;
    }

    /**
     * Gets the value of the pravniMoc property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPravniMoc() {
        return pravniMoc;
    }

    /**
     * Sets the value of the pravniMoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPravniMoc(XMLGregorianCalendar value) {
        this.pravniMoc = value;
    }

}
