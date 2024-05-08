package Throwable.RuntimeException;

public class InvalidRequestStateExceptionEx {
   public static void main(String[] args) {
      RequestHandler handler = new RequestHandler();

      try {
         handler.processRequest();
         handler.setValidState(false);
         handler.processRequest();
      } catch (InvalidRequestStateException var3) {
         System.err.println("Error: Solicitud no válida.");
         System.err.println("  Razón: " + var3.getMessage());
      }

   }
}
