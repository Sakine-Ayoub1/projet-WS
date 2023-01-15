package sakine.ayoub;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import sakine.ayoub.entities.Releve;

import java.io.File;

public class TestDeserialization {

    public static void main(String[] args) throws JAXBException {
        {

            JAXBContext jaxbContext=JAXBContext.newInstance(Releve.class);

            Unmarshaller unmarshaller= jaxbContext.createUnmarshaller();
            Releve releve= (Releve) unmarshaller.unmarshal(new File("releve.xml"));

            releve.getOperations().getOperations().forEach(o->{
                System.out.println("*********************");
                System.out.println(o.toString());
            });
        }
    }

}
