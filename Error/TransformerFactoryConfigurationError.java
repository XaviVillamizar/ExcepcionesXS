package Throwable.Error;

import javax.xml.transform.TransformerFactory;

public class TransformerFactoryConfigurationError {
   public static void main(String[] args) {
      try {
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         System.out.println("Instancia de TransformerFactory creada exitosamente: " + transformerFactory.toString());
      } catch (Error var2) {
         System.err.println("Se produjo un error: " + var2.getMessage());
         var2.printStackTrace();
      }

   }
}
