package Throwable.RuntimeException;

public class MalformedParameterizedTypeException {
   public static void main(String[] args) {
      try {
         throw new java.lang.reflect.MalformedParameterizedTypeException();
      } catch (java.lang.reflect.MalformedParameterizedTypeException var2) {
         System.err.println("Error: Tipo de parámetro mal formado.");
         System.err.println("  Mensaje: " + var2.getMessage());
      }
   }
}
