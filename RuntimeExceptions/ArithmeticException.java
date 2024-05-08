package Throwable.RuntimeException;

public class ArithmeticException {
   public static void main(String[] args) {
      try {
         int result = divide(10, 0);
         System.out.println("Result: " + result);
      } catch (Exception var2) {
         System.err.println("Error: Division by zero.");
         System.err.println("  Reason: " + var2.getMessage());
      }

   }

   public static int divide(int dividend, int divisor) {
      return dividend / divisor;
   }
}
