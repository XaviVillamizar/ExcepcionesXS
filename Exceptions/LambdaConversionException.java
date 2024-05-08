package Throwable.Exception;

public class LambdaConversionException {
   public static void main(String[] args) {
      try {
         String userInput = getUserInput();
         String uppercaseInput = userInput.toUpperCase();
         System.out.println("Entrada en mayusculas: " + uppercaseInput);
      } catch (Exception var3) {
         System.err.println("Error al procesar la entrada: " + var3.getMessage());
      }

   }

   private static String getUserInput() {
      return "excepcion";
   }
}
