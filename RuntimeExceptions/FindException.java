package Throwable.RuntimeException;

public class FindException {
   public static void main(String[] args) {
      try {
         ModuleLoader loader = ModuleLoader.getSystemLoader();
         loader.loadModule("invalidModuleName");
      } catch (java.lang.module.FindException var2) {
         System.err.println("Error: modulo no encontrado.");
         System.err.println("  Razón: El nombre del modulo especificado es invalido o no existe.");
         System.err.println("  Nombre del modulo: " + var2.getMessage());
      } catch (ModuleNotFoundException var3) {
         System.err.println("Error: modulo no encontrado.");
         System.err.println("  Razon: El modulo especificado no pudo ser encontrado.");
      }

   }
}
