package Throwable.RuntimeException;

public class UnmodifiableModuleExceptionEx {
   public static void main(String[] args) {
      ModuleManager moduleManager = new ModuleManager();
      Module module = new Module("SecurityModule", false);

      try {
         moduleManager.modifyModule(module);
      } catch (UnmodifiableModuleException var4) {
         System.err.println("Error: Unmodifiable module encountered.");
         System.err.println("  Message: " + var4.getMessage());
      }

   }
}
