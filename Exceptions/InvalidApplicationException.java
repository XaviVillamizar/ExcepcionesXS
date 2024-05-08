package Throwable.Exception;

public class InvalidApplicationException {
   public static void main(String[] args) {
      try {
         throw new RuntimeException("Uncompilable code - constructor InvalidApplicationException in class Throwable.Exception.InvalidApplicationException cannot be applied to given types;\n  required: no arguments\n  found:    java.lang.String\n  reason: actual and formal argument lists differ in length");
      } catch (Exception var2) {
         System.err.println("Ocurrio una excepcion de aplicacion invalida: " + var2.getMessage());
         var2.printStackTrace();
      }
   }
}
