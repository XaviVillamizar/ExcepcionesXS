package Throwable.RuntimeException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DOMException {
   public static void main(String[] args) {
      try {
         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         DocumentBuilder builder = factory.newDocumentBuilder();
         Document document = builder.newDocument();
         String invalidElementName = "2invalidElement";
         Element invalidElement = document.createElement(invalidElementName);
         System.out.println("Elemento creado: " + invalidElement.getTagName());
      } catch (ParserConfigurationException var6) {
         System.err.println("Error: No se pudo configurar el parser del documento XML.");
         var6.printStackTrace();
      } catch (Exception var7) {
         System.err.println("Error: Se produjo una excepcion del Modelo de Objetos del Documento (DOM).");
         System.err.println("  Mensaje: " + var7.getMessage());
      }

   }
}
