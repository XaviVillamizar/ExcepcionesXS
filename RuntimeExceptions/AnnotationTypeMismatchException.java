package Throwable.RuntimeException;

public class AnnotationTypeMismatchException {
   public static void main(String[] args) {
      try {
         throw new RuntimeException("Uncompilable code - incompatible types: java.lang.String cannot be converted to int");
      } catch (NoSuchFieldException var2) {
         var2.printStackTrace();
      } catch (Exception var3) {
         System.err.println("Error: Mismatch between annotation type and attribute type.");
         System.err.println("  Reason: " + var3.getMessage());
      }

   }
}
