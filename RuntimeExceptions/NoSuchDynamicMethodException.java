package Throwable.RuntimeException;

public class NoSuchDynamicMethodException {
   public static void main(String[] args) {
      new Throwable.RuntimeException.NoSuchDynamicMethodException.DynamicObject();

      try {
         throw new RuntimeException("Uncompilable code - cannot find symbol\n  symbol:   method invokeExact(java.lang.String)\n  location: class java.lang.Object");
      } catch (jdk.dynalink.NoSuchDynamicMethodException var3) {
         System.err.println("Error: No se encontró el método dinámico especificado.");
         System.err.println("  Mensaje: " + var3.getMessage());
      } catch (Throwable var4) {
         System.err.println("Error: Ocurrió un error inesperado.");
         var4.printStackTrace();
      }

   }
}
