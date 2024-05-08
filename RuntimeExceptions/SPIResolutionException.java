package Throwable.RuntimeException;

import Throwable.RuntimeException.MyService.ServiceProvider;

public class SPIResolutionException {
   public static void main(String[] args) {
      try {
         Service service = ServiceProvider.getService();
         service.doSomething();
      } catch (Exception var2) {
         System.err.println("Error: No se pudo resolver la implementación del servicio.");
         System.err.println("  Razón: " + var2.getMessage());
      }

   }
}
