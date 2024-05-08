package Throwable.RuntimeException;

public class NullPointerException {
   public static void main(String[] args) {
      Object person = null;

      try {
         String name = ((Person)person).getName();
         System.out.println("Nombre de la persona: " + name);
      } catch (Exception var3) {
         System.err.println("Error: Se produjo una NullPointerException.");
         System.err.println("  Razón: La persona no ha sido inicializada correctamente.");
      }

   }
}
