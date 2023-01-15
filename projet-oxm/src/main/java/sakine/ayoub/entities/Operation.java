package sakine.ayoub.entities;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import sakine.ayoub.enums.TypeOperation;

import java.util.Date;

@XmlRootElement(name = "operation")
@XmlAccessorType(XmlAccessType.FIELD)
public class Operation {

    @XmlAttribute
    private TypeOperation type;

    @XmlAttribute
    private Date date;
    @XmlAttribute
    private double montant;
    @XmlAttribute
    private String description;

    public Operation() {
    }

    public Operation(TypeOperation type, Date date, double montant, String description) {
        this.type = type;
        this.date = date;
        this.montant = montant;
        this.description = description;
    }

    public TypeOperation getType() {
        return type;
    }

    public void setType(TypeOperation type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "type=" + type +
                ", date=" + date +
                ", montant=" + montant +
                ", description='" + description + '\'' +
                '}';
    }
}
