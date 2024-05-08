package Throwable.RuntimeException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnsupportedOperationException {
   public static void main(String[] args) {
      List<String> mutableList = new ArrayList();
      mutableList.add("Apple");
      mutableList.add("Banana");
      mutableList.add("Orange");
      List unmodifiableList = Collections.unmodifiableList(mutableList);

      try {
         unmodifiableList.add("Pear");
      } catch (Exception var4) {
         System.err.println("Error: Unsupported operation encountered.");
         System.err.println("  Message: " + var4.getMessage());
      }

   }

   UnsupportedOperationException(String not_supported_yet) {
      throw new java.lang.UnsupportedOperationException("Not supported yet.");
   }
}
