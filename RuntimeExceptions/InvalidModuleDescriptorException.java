package Throwable.RuntimeException;

import java.lang.module.ModuleDescriptor;

public class InvalidModuleDescriptorException {
   public static void main(String[] args) {
      try {
         ModuleDescriptor var1 = ModuleDescriptor.newModule("module").requires("nonexistent.module").build();
      } catch (java.lang.module.InvalidModuleDescriptorException var2) {
         System.err.println("Error: Descriptor de módulo inválido.");
         System.err.println("  Razón: " + var2.getMessage());
      }

   }
}
