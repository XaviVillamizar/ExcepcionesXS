package Throwable.RuntimeException;

import java.util.Locale;

public class IllformedLocaleException {
   public static void main(String[] args) {
      try {
         new Locale("en_", "US");
      } catch (java.util.IllformedLocaleException var2) {
         System.err.println("Error: La cadena de configuración del Locale está mal formada.");
         System.err.println("  Razón: " + var2.getMessage());
      }

   }
}
