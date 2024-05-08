package Throwable.Exception;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class NotBoundException {
   public static void main(String[] args) {
      try {
         Context initialContext = new InitialContext();
         Object var2 = initialContext.lookup("unboundName");
      } catch (NamingException var3) {
         System.err.println("Error: Fallo en la operacion del servicio de nombres.");
         System.err.println("  Motivo: " + var3.getMessage());
      }

   }
}
