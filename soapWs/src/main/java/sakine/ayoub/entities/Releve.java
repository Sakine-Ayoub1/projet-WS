package sakine.ayoub.entities;

import jakarta.xml.bind.annotation.*;

import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Releve {

    @XmlAttribute
    private String rib;
    private Date dateReleve;
    private double solde;
    
    private ListOp listOp;

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

    public ListOp getOperations() {
        return listOp;
    }

    public void setOperations(ListOp listOp) {
        this.listOp = listOp;
    }
}
