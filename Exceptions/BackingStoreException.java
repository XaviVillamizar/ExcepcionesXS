package Throwable.Exception;

import java.util.prefs.Preferences;

public class BackingStoreException {
   public static void main(String[] args) {
      try {
         Preferences prefs = Preferences.userRoot();
         prefs.put("clave", "81");
         prefs.flush();
         String valor = prefs.get("clave", "valor_por_defecto");
         System.out.println("Valor recuperado: " + valor);
      } catch (Exception var3) {
         System.err.println("Error de almacenamiento de preferencias: " + var3.getMessage());
      }

   }
}
