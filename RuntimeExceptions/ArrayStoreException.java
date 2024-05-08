package Throwable.RuntimeException;

public class ArrayStoreException {
   public static void main(String[] args) {
      try {
         Object[] array = new Integer[5];
         array[0] = "Hello";
      } catch (Exception var2) {
         System.err.println("Error: Intento de almacenar un tipo de dato incorrecto en el arreglo.");
         System.err.println("  Razon: " + var2.getMessage());
      }

   }
}
