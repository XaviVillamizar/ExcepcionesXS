package Throwable.Exception;

public class AbsentInformationExceptionEx {
   public static void main(String[] args) {
      try {
         obtenerInformacion();
      } catch (AbsentInformationException var2) {
         System.out.println(var2.getMessage());
      }

   }

   public static void obtenerInformacion() throws AbsentInformationException {
      throw new AbsentInformationException("La informacion necesaria no esta disponible.");
   }
}
