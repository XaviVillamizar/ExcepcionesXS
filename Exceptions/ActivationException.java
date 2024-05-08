package Throwable.Exception;

public class ActivationException {
   public static void main(String[] args) {
      try {
         Throwable.Exception.ActivationException.Service service = new Throwable.Exception.ActivationException.MyService();
         service.doSomething();
      } catch (Exception var2) {
         System.err.println("Error: Activation failed (dependency injection issue).");
         System.err.println("  Reason: Missing or invalid implementation class.");
      }

   }
}
