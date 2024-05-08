package Throwable.RuntimeException;

public class MirroredTypesException {
   public static void main(String[] args) {
      try {
         MyAnnotation var1 = (MyAnnotation)Throwable.RuntimeException.MirroredTypesException.MirroredTypesExample.class.getAnnotation(MyAnnotation.class);
      } catch (Exception var2) {
         System.err.println("Error: No se pudieron determinar los tipos reflejados de la anotación.");
         System.err.println("  Razón: " + var2.getMessage());
      }

   }
}
