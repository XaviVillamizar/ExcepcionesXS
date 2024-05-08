package Throwable.RuntimeException;

public class ClassCastException {
   public static void main(String[] args) {
      try {
         Object obj = "Hola";
         Integer number = (Integer)obj;
         System.out.println("Number: " + number);
      } catch (Exception var3) {
         System.err.println("Error: ClassCastException occurred.");
         System.err.println("  Reason: " + var3.getMessage());
      }

   }
}
