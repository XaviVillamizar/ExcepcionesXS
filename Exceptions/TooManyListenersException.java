package Throwable.Exception;

import Throwable.Exception.TooManyListenersException.1;
import Throwable.Exception.TooManyListenersException.2;
import java.util.EventListener;

public class TooManyListenersException {
   public static void main(String[] args) {
      EventSource eventSource = new EventSource();
      EventListener listener1 = new 1();
      2 listener2 = new 2();

      try {
         eventSource.addListener(listener1);
         eventSource.addListener(listener2);
      } catch (java.util.TooManyListenersException var5) {
         System.err.println("Error: Se agregaron demasiados EventListeners.");
         var5.printStackTrace();
      }

   }
}
