package Throwable.Exception;

public class UnmodifiableClassException {
   public static void main(String[] args) {
      try {
         throw new RuntimeException("Uncompilable code - cannot find symbol\n  symbol:   class InstrumentationAgent\n  location: package java.lang.instrument");
      } catch (java.lang.instrument.UnmodifiableClassException var2) {
         System.err.println("Error: Clase no modificable.");
         var2.printStackTrace();
      }
   }
}
