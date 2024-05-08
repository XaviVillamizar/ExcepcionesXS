package Throwable.RuntimeException;

public class LayerInstantiationException {
   public static void main(String[] args) {
      try {
         Layer1 layer1 = new Layer1();
         Layer2 layer2 = new Layer2(layer1);
         layer2.doSomething();
      } catch (Exception var3) {
         System.err.println("Error: Error en cargas las capas.");
         System.err.println("  Reason: " + var3.getMessage());
      }

   }
}
