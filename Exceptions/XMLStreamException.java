package Throwable.Exception;

import java.io.StringReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

public class XMLStreamException {
   public static void main(String[] args) {
      String xmlString = "<root><element>Contenido</element></root>";

      try {
         StringReader stringReader = new StringReader(xmlString);

         try {
            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = factory.createXMLStreamReader(stringReader);

            while(reader.hasNext()) {
               int event = reader.next();
               if (event == 1) {
                  System.out.println("Inicio de elemento: " + reader.getLocalName());
               } else if (event == 2) {
                  System.out.println("Fin de elemento: " + reader.getLocalName());
               } else if (event == 4) {
                  System.out.println("Contenido: " + reader.getText());
               }
            }
         } catch (Throwable var7) {
            try {
               stringReader.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }

            throw var7;
         }

         stringReader.close();
      } catch (javax.xml.stream.XMLStreamException var8) {
         System.err.println("Error al procesar el stream XML: " + var8.getMessage());
      }

   }
}
