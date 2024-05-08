package Throwable.RuntimeException;

import java.util.ArrayList;
import java.util.List;

public class IllegalStateException {
   public static void main(String[] args) {
      ArrayList myList = new ArrayList();

      try {
         String var2 = (String)myList.remove(0);
      } catch (Exception var4) {
         System.err.println("Error: Intentando eliminar un elemento de una lista vacía.");
         var4.printStackTrace();
      }

      try {
         List<String> fixedSizeList = List.of("A", "B", "C");
         fixedSizeList.add("D");
      } catch (Exception var3) {
         System.err.println("Error: Intentando agregar un elemento a una lista de tamaño fijo.");
         var3.printStackTrace();
      }

   }
}
