package Throwable.RuntimeException;

public class IllegalCallerException {
   public static void main(String[] args) {
      illegalMethodCall();
   }

   public static void illegalMethodCall() {
      try {
         if (!Thread.currentThread().getStackTrace()[2].getMethodName().equals("main")) {
            throw new RuntimeException("Esta llamada no está permitida en este contexto.");
         }
      } catch (Exception var1) {
         System.err.println("Error: Llamada ilegal al método.");
         System.err.println("  Razón: " + var1.getMessage());
      }

   }
}
