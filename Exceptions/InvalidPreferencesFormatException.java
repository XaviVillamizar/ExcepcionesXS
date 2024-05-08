package Throwable.Exception;

public class InvalidPreferencesFormatException {
   public static void main(String[] args) {
      try {
         throw new java.util.prefs.InvalidPreferencesFormatException("Formato de preferencias invalido");
      } catch (java.util.prefs.InvalidPreferencesFormatException var2) {
         System.err.println("Ocurrio una excepcion de formato de preferencias invalido: " + var2.getMessage());
         var2.printStackTrace();
      }
   }
}
