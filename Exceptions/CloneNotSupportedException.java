package Throwable.Exception;

public class CloneNotSupportedException {
   public static void main(String[] args) {
      new Person("Alice");

      try {
         throw new RuntimeException("Uncompilable code - unreported exception Throwable.Exception.CloneNotSupportedException; must be caught or declared to be thrown");
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }
}
