package Throwable.Exception;

public class IllegalClassFormatException {
   public static void main(String[] args) {
      try {
         throw new RuntimeException("Uncompilable code - constructor IllegalClassFormatException in class Throwable.Exception.IllegalClassFormatException cannot be applied to given types;\n  required: no arguments\n  found:    java.lang.String\n  reason: actual and formal argument lists differ in length");
      } catch (Exception var2) {
         System.err.println("Ocurrio un formato de clase ilegal: " + var2.getMessage());
         var2.printStackTrace();
      }
   }
}
