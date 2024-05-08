package Throwable.Error;

public class ThreadDeath {
   public static void main(String[] args) {
      Thread hilo = new Thread(() -> {
         try {
            Thread.sleep(5000L);
         } catch (InterruptedException var1) {
            var1.printStackTrace();
         }

         throw new Error("Simulando un error grave en el hilo");
      });
      hilo.start();

      try {
         hilo.join();
      } catch (InterruptedException var3) {
         var3.printStackTrace();
      }

      System.out.println("El hilo ha terminado sin lanzar una excepcion ThreadDeath.");
   }
}
