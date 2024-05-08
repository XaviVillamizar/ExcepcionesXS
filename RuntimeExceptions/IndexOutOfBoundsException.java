package Throwable.RuntimeException;

public class IndexOutOfBoundsException {
   public static void main(String[] args) {
      try {
         int[] array = new int[]{1, 2, 3};
         int var2 = array[3];
      } catch (ArrayIndexOutOfBoundsException var3) {
         System.err.println("Error: Index out of bounds.");
         System.err.println("  Message: " + var3.getMessage());
      }

   }
}
