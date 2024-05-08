package Throwable.Exception;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class ParserConfigurationException {
   public static void main(String[] args) throws javax.xml.parsers.ParserConfigurationException {
      try {
         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         factory.setFeature("http://xml.org/sax/features/validation", true);
         DocumentBuilder var2 = factory.newDocumentBuilder();
      } catch (Exception var3) {
         System.err.println("Error: Error de configuración del analizador XML.");
         System.err.println("  Motivo: " + var3.getMessage());
      }

   }
}
