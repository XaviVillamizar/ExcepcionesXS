package Throwable.RuntimeException;

public class InvalidStackFrameExceptionEx {
   public static void main(String[] args) {
      Debugger debugger = new Debugger();

      try {
         debugger.debug();
      } catch (InvalidStackFrameException var3) {
         System.err.println("Error: Error en el marco de pila durante la depuración.");
         System.err.println("  Razón: " + var3.getMessage());
      }

   }
}
