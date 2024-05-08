package Throwable.RuntimeException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {
   public static void main(String[] args) {
      List<String> list = new ArrayList();
      list.add("A");
      list.add("B");
      list.add("C");
      Iterator iterator = list.iterator();

      while(iterator.hasNext()) {
         String element = (String)iterator.next();
         System.out.println(element);
         list.add("D");
      }

   }
}
