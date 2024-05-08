package Throwable.RuntimeException;

import java.util.ResourceBundle;

public class MissingResourceException {
   public static void main(String[] args) {
      try {
         ResourceBundle var1 = ResourceBundle.getBundle("MissingBundle");
      } catch (Exception var2) {
         System.err.println("Error: Recurso faltante en el ResourceBundle.");
      }

   }
}
