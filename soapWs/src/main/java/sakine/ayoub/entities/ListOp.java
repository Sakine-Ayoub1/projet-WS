package sakine.ayoub.entities;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListOp {

    @XmlAttribute
    private Date dateDebut;
    @XmlAttribute
    private Date dateFin;

    @XmlElement
    private List<Operation> list=new ArrayList<>();

    public ListOp() {
    }

    public ListOp(Date dateDebut, Date dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public List<Operation> getOperations() {
        return list;
    }

    public void setOperations(List<Operation> list) {
        this.list = list;
    }
}
