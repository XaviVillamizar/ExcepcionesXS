package Throwable.RuntimeException;

public class NegativeArraySizeException {
   public static void main(String[] args) {
      try {
         int negativeSize = -5;
         int[] var2 = new int[negativeSize];
      } catch (Exception var3) {
         System.err.println("Error: Se intentó crear un array con tamaño negativo.");
         System.err.println("  Razón: " + var3.getMessage());
      }

   }
}
