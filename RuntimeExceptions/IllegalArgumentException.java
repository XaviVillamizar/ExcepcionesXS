package Throwable.RuntimeException;

public class IllegalArgumentException {
   public static void main(String[] args) {
      try {
         throw new RuntimeException("Uncompilable code - incompatible types: int cannot be converted to java.lang.String");
      } catch (Exception var2) {
         System.err.println("Error: Argumento invalido.");
         System.err.println("  Reason: el elemento no es compatible con la lista");
      }
   }
}
