package Throwable.Exception;

import javax.xml.datatype.DatatypeFactory;

public class DatatypeConfigurationException {
   public static void main(String[] args) {
      try {
         DatatypeFactory var1 = DatatypeFactory.newInstance();
      } catch (Exception var2) {
         System.err.println("Se produjo un error al obtener la instancia de DatatypeFactory: " + var2.getMessage());
         var2.printStackTrace();
      }

   }
}
