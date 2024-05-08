package Throwable.RuntimeException;

import com.sun.jdi.VirtualMachine;

public class InvalidModuleException {
   public static void main(String[] args) {
      Object vm = null;

      try {
         ((VirtualMachine)vm).allModules();
      } catch (com.sun.jdi.InvalidModuleException var3) {
         System.err.println("Error: Módulo no válido.");
         System.err.println("  Razón: " + var3.getMessage());
      }

   }
}
