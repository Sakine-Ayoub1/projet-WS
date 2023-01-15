
package sakine.ayoub.proxy;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for releve complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="releve">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="dateReleve" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="solde" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="listOp" type="{http://services.ayoub.sakine/}listOp" minOccurs="0"/>
 *       </sequence>
 *       <attribute name="rib" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "releve", propOrder = {
    "dateReleve",
    "solde",
    "listOp"
})
public class Releve {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateReleve;
    protected double solde;
    protected ListOp listOp;
    @XmlAttribute(name = "rib")
    protected String rib;

    /**
     * Gets the value of the dateReleve property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReleve() {
        return dateReleve;
    }

    /**
     * Sets the value of the dateReleve property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReleve(XMLGregorianCalendar value) {
        this.dateReleve = value;
    }

    /**
     * Gets the value of the solde property.
     * 
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Sets the value of the solde property.
     * 
     */
    public void setSolde(double value) {
        this.solde = value;
    }

    /**
     * Gets the value of the listOp property.
     * 
     * @return
     *     possible object is
     *     {@link ListOp }
     *     
     */
    public ListOp getListOp() {
        return listOp;
    }

    /**
     * Sets the value of the listOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOp }
     *     
     */
    public void setListOp(ListOp value) {
        this.listOp = value;
    }

    /**
     * Gets the value of the rib property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRib() {
        return rib;
    }

    /**
     * Sets the value of the rib property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRib(String value) {
        this.rib = value;
    }

}
