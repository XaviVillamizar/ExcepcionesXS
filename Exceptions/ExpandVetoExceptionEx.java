package Throwable.Exception;

public class ExpandVetoExceptionEx {
   public static void main(String[] args) {
      MyComponent component = new MyComponent(100);

      try {
         component.expand(50);
         component.expand(60);
      } catch (ExpandVetoException var3) {
         System.err.println("Expansion vetoed: " + var3.getMessage());
      }

   }
}
