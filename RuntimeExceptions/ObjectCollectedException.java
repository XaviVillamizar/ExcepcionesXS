package Throwable.RuntimeException;

public class ObjectCollectedException {
   public static void main(String[] args) {
      try {
         String temporaryString = someMethodThatReturnsString();
         System.out.println(temporaryString.toUpperCase());
      } catch (Exception var2) {
         System.err.println("Error: Object might have been collected.");
         System.err.println("  Reason: The temporaryString reference might not be strong enough to prevent garbage collection.");
      }

   }

   private static String someMethodThatReturnsString() {
      return "This is a temporary string";
   }
}
