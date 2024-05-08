package Throwable.RuntimeException;

public class SecurityException {
   public static void main(String[] args) {
      try {
         checkPermission();
      } catch (Exception var2) {
         System.err.println("Error: Operación no permitida debido a restricciones de seguridad.");
         System.err.println("  Razón: " + var2.getMessage());
      }

   }

   public static void checkPermission() {
   }
}
