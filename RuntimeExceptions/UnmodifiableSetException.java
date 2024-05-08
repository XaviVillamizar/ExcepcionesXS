package Throwable.RuntimeException;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnmodifiableSetException {
   public static void main(String[] args) {
      Set<String> mutableSet = new HashSet();
      mutableSet.add("Apple");
      mutableSet.add("Banana");
      mutableSet.add("Orange");
      Set unmodifiableSet = Collections.unmodifiableSet(mutableSet);

      try {
         unmodifiableSet.add("Pear");
      } catch (Exception var4) {
         System.err.println("Error: Unmodifiable set encountered.");
         System.err.println("  Message: " + var4.getMessage());
      }

   }
}
