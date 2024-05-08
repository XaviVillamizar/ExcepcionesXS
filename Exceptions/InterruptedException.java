package Throwable.Exception;

public class InterruptedException {
   public static void main(String[] args) {
      try {
         Thread.sleep(1000L);
      } catch (Exception var2) {
         System.err.println("La ejecucion fue interrumpida: " + var2.getMessage());
         var2.printStackTrace();
      }

   }
}
