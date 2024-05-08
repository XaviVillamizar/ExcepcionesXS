package Throwable.RuntimeException;

import java.util.concurrent.CompletableFuture;

public class CompletionException {
   public static void main(String[] args) {
      try {
         CompletableFuture<String> apiCallFuture = CompletableFuture.supplyAsync(() -> {
            if (Math.random() < 0.5D) {
               throw new RuntimeException("Fallo en la llamada a la API");
            } else {
               return "Respuesta exitosa de la API";
            }
         });
         String response = (String)apiCallFuture.get();
         System.out.println("Respuesta de la API: " + response);
      } catch (Exception var3) {
         System.err.println("Error: Fallo la tarea asincrona.");
         System.err.println("  Razon: La tarea subyacente lanzo una excepcion.");
      }

   }
}
