package Throwable.Exception;

public class GeneralSecurityException {
   public static void main(String[] args) {
      try {
         throw new java.security.GeneralSecurityException("Error de seguridad general");
      } catch (Exception var2) {
         System.err.println("Ocurrio un error de seguridad: " + var2.getMessage());
         var2.printStackTrace();
      }
   }
}
