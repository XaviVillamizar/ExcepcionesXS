package Throwable.RuntimeException;

public class InconsistentDebugInfoException {
   public static void main(String[] args) {
      try {
         throw new com.sun.jdi.InconsistentDebugInfoException();
      } catch (com.sun.jdi.InconsistentDebugInfoException var2) {
         System.err.println("Error: Inconsistent Debug Information.");
         System.err.println("  Message: " + var2.getMessage());
      }
   }
}
