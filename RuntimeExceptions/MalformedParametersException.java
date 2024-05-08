package Throwable.RuntimeException;

public class MalformedParametersException {
   public static void main(String[] args) {
      try {
         throw new java.lang.reflect.MalformedParametersException("Malformed parameters in method");
      } catch (java.lang.reflect.MalformedParametersException var2) {
         System.err.println("Error: Parámetros mal formados en un método.");
         System.err.println("  Mensaje: " + var2.getMessage());
      }
   }
}
