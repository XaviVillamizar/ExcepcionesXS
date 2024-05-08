package Throwable.Exception;

public class VMStartException extends Exception {
   public VMStartException(String message) {
      super(message);
   }

   public static void main(String[] args) {
      try {
         throw new VMStartException("Failed to start the virtual machine");
      } catch (VMStartException var2) {
         System.err.println("Error: Failed to launch JVM.");
         System.err.println("  Reason: " + var2.getMessage());
      }
   }
}
