package Throwable.RuntimeException;

public class NativeMethodException {
   public static void main(String[] args) {
      try {
         NativeMethodExample example = new NativeMethodExample();
         example.nativeMethod();
      } catch (Exception var2) {
         System.err.println("Error: No se pudo cargar o invocar el método nativo.");
         System.err.println("  Razón: " + var2.getMessage());
      }

   }
}
