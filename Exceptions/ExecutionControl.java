package Throwable.Exception;

import java.security.AccessController;

public class ExecutionControl {
   public static void main(String[] args) {
      try {
         String result = (String)AccessController.doPrivileged(() -> {
            throw new RuntimeException("Uncompilable code - unreported exception <any>; must be caught or declared to be thrown");
         });
         System.out.println("Resultado de la accion privilegiada: " + result);
      } catch (Exception var2) {
         System.err.println("Ocurrio una excepcion durante la accion privilegiada: " + var2.getMessage());
         var2.printStackTrace();
      }

   }
}
