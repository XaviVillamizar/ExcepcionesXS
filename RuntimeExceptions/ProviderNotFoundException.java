package Throwable.RuntimeException;

public class ProviderNotFoundException {
   public static void main(String[] args) {
      try {
         throw new RuntimeException("Uncompilable code - constructor ProviderNotFoundException in class Throwable.RuntimeException.ProviderNotFoundException cannot be applied to given types;\n  required: no arguments\n  found:    java.lang.String\n  reason: actual and formal argument lists differ in length");
      } catch (Exception var2) {
         System.err.println("Error: Proveedor no encontrado.");
         System.err.println("  Razón: " + var2.getMessage());
      }
   }
}
