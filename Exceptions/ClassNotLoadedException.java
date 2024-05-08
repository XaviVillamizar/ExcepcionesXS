package Throwable.Exception;

public class ClassNotLoadedException {
   public static void main(String[] args) {
      try {
         Class.forName("ClaseNoExistente");
      } catch (ClassNotFoundException var2) {
         System.err.println("La clase no pudo ser encontrada: " + var2.getMessage());
      }

   }
}
