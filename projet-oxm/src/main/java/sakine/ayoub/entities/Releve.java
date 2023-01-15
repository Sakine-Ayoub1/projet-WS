package sakine.ayoub.entities;

import jakarta.xml.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Releve {

    @XmlAttribute
    private String rib;
    private Date dateReleve;
    private double solde;

    private Operations operations;

    public Releve() {
    }

    public Releve(String rib, Date dateReleve, double solde) {
        this.rib = rib;
        this.dateReleve = dateReleve;
        this.solde = solde;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Operations getOperations() {
        return operations;
    }

    public void setOperations(Operations operations) {
        this.operations = operations;
    }
}
