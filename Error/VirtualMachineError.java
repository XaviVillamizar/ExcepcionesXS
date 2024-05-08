package Throwable.Error;

public class VirtualMachineError {
   public static void main(String[] args) {
      try {
         recursiveMemoryAllocation(0);
      } catch (OutOfMemoryError var2) {
         System.err.println("Error: sin memoria.");
      }

   }

   private static void recursiveMemoryAllocation(int depth) {
      if (depth == 100) {
         System.out.println("profundidad: " + depth + "!");
      } else {
         byte[] largeArray = new byte[1048576];
         recursiveMemoryAllocation(depth + 1);
      }
   }
}
