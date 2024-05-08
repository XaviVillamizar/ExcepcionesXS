package Throwable.Error;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class FactoryConfigurationError {
   public static void main(String[] args) {
      try {
         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         DocumentBuilder builder = factory.newDocumentBuilder();
         System.out.println("El programa se ejecuto correctamente.");
      } catch (javax.xml.parsers.FactoryConfigurationError var3) {
         System.err.println("Error de configuracion de la fábrica: " + var3.getMessage());
      } catch (ParserConfigurationException var4) {
         System.err.println("Ocurrio un error inesperado: " + var4.getMessage());
      }

   }
}
