package sakine.ayoub;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.SchemaOutputResolver;
import sakine.ayoub.entities.Releve;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class TestGenerateShemaXml {
    public static void main(String[] args) throws IOException, JAXBException {
            JAXBContext jaxbContext=JAXBContext.newInstance(Releve.class);

        jaxbContext.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String s, String s1) throws IOException {
                File file=new File("releve.xsd");
                StreamResult streamResult=new StreamResult(file);
                streamResult.setSystemId(file.getName());
                return streamResult;
            }
        });
    }

    }

