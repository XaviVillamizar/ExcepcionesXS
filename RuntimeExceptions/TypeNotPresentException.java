package Throwable.RuntimeException;

public class TypeNotPresentException {
   public static void main(String[] args) {
      try {
         Class var1 = Class.forName("com.example.NonExistentClass");
      } catch (ClassNotFoundException var2) {
         System.err.println("Error: Clase no encontrada.");
         System.err.println("  Razón: " + var2.getMessage());
      }

   }
}
