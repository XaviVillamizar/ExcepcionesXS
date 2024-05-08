package Throwable.RuntimeException;

public class UndeclaredThrowableException {
   public static void main(String[] args) throws CheckedException {
      Example example = new Example();

      try {
         example.doSomething();
      } catch (java.lang.reflect.UndeclaredThrowableException var3) {
         System.err.println("Error: Undeclared checked exception occurred.");
         System.err.println("  Wrapped exception: " + var3.getUndeclaredThrowable().getClass().getName());
         System.err.println("  Message: " + var3.getUndeclaredThrowable().getMessage());
      }

   }
}
