package Throwable.RuntimeException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RejectedExecutionException {
   public static void main(String[] args) {
      ExecutorService executor = Executors.newSingleThreadExecutor();

      try {
         for(int i = 0; i < 10; ++i) {
            executor.submit(() -> {
               try {
                  Thread.sleep(1000L);
                  System.out.println("Tarea completada.");
               } catch (InterruptedException var1) {
                  var1.printStackTrace();
               }

            });
         }
      } catch (java.util.concurrent.RejectedExecutionException var6) {
         System.err.println("Error: Ejecución rechazada.");
         System.err.println("  Razón: " + var6.getMessage());
      } finally {
         executor.shutdown();
      }

   }
}
