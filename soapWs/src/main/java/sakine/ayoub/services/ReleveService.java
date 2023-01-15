package sakine.ayoub.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlType;
import sakine.ayoub.entities.ListOp;
import sakine.ayoub.entities.Operation;
import sakine.ayoub.entities.Releve;
import sakine.ayoub.enums.TypeOperation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@WebService(name = "ReleveWs")
public class ReleveService {

    @WebMethod
    public Releve myReleve(){
        Releve releve=new Releve();

        ListOp operations=new ListOp();

        List<Operation> operationList=new ArrayList<>();
        operationList.add(new Operation(TypeOperation.debit,new Date(), new Random().nextDouble()*1000,"description1"));
        operationList.add(new Operation(TypeOperation.credit,new Date(), new Random().nextDouble()*1000,"description2"));

        operations.setDateDebut(new Date());
        operations.setDateFin(new Date());
        operations.setOperations(operationList);

        releve.setDateReleve(new Date());
        releve.setRib("12346545667");
        releve.setSolde(12340);
        releve.setOperations(operations);

        return releve;
    }
}
