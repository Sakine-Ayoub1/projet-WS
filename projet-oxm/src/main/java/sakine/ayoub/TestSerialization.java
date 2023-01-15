package sakine.ayoub;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import sakine.ayoub.entities.Operation;
import sakine.ayoub.entities.Operations;
import sakine.ayoub.entities.Releve;
import sakine.ayoub.enums.TypeOperation;

import java.io.File;
import java.util.Date;

public class TestSerialization {
    public static void main(String[] args) throws JAXBException {
        Releve releve=new Releve("134298379475",new Date(),6740);
        Operations operations=new Operations(new Date(),new Date());
        operations.getOperations().add(new Operation(TypeOperation.credit,new Date(),3478,"description1"));
        operations.getOperations().add(new Operation(TypeOperation.debit,new Date(),5678,"description2"));
        operations.getOperations().add(new Operation(TypeOperation.debit,new Date(),120,"description3"));
        operations.getOperations().add(new Operation(TypeOperation.credit,new Date(),1789,"description4"));
        releve.setOperations(operations);

        JAXBContext jaxbContext=JAXBContext.newInstance(Releve.class);
        Marshaller marshaller=jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(releve,new File("releve.xml"));
    }
}