package Throwable.Error;

public class LinkageError {
   public static void main(String[] args) {
      try {
         Class<?> claseEjemplo = Class.forName("ClaseEjemplo");
         Object instancia = claseEjemplo.newInstance();
         claseEjemplo.getMethod("metodo").invoke(instancia);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }
}
