package Throwable.Exception;

public class DestroyFailedException {
   public static void main(String[] args) {
      MyClass myObject = new MyClass();

      try {
         myObject.destroy();
      } catch (Exception var3) {
         System.err.println("La destruccion del objeto fallo: " + var3.getMessage());
         var3.printStackTrace();
      }

   }
}
