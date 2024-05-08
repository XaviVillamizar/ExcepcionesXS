package Throwable.RuntimeException;

public class JSException {
   public static void main(String[] args) {
      try {
         throw new netscape.javascript.JSException("Error al ejecutar código JavaScript");
      } catch (netscape.javascript.JSException var2) {
         System.err.println("Error: Excepción de JavaScript.");
         System.err.println("  Razón: " + var2.getMessage());
      }
   }
}
