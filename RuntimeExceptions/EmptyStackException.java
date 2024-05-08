package Throwable.RuntimeException;

public class EmptyStackException {
   public static void main(String[] args) {
      try {
         processRequest("12345");
      } catch (DuplicateRequestException var2) {
         System.err.println("Error: Se detectó una solicitud duplicada.");
         System.err.println("  Razón: " + var2.getMessage());
      }

   }

   public static void processRequest(String requestId) throws DuplicateRequestException {
      boolean isDuplicate = checkIfRequestIsDuplicate(requestId);
      if (isDuplicate) {
         throw new DuplicateRequestException("La solicitud con ID " + requestId + " ya ha sido procesada.");
      } else {
         System.out.println("La solicitud con ID " + requestId + " se está procesando.");
      }
   }

   public static boolean checkIfRequestIsDuplicate(String requestId) {
      return false;
   }
}
