package Throwable.RuntimeException;

public class IllegalMonitorStateException {
   private static final Object lock = new Object();

   public static void main(String[] args) {
      try {
         synchronized(lock) {
            System.out.println("Dentro del bloque sincronizado...");
         }

         lock.notify();
      } catch (Exception var4) {
         System.err.println("Error: Intentando acceder a un monitor sin poseer el bloqueo.");
         var4.printStackTrace();
      }

   }
}
