package Throwable.Error;

import java.io.File;
import java.io.IOException;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;

public class SchemaFactoryConfigurationError {
   public static void main(String[] args) {
      SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
      File schemaFile = new File("pruebaexcepcion.xsd");

      try {
         Schema schema = schemaFactory.newSchema(schemaFile);
         Validator validator = schema.newValidator();
         validator.validate(new StreamSource(new File("documento.xml")));
         System.out.println("El documento XML es válido.");
      } catch (IOException | SAXException var5) {
         System.err.println("Error al validar el documento XML: " + var5.getMessage());
      }

   }
}
