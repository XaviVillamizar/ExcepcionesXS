package Throwable.Exception;

import Throwable.Exception.UnsupportedCallbackException.1;

public class UnsupportedCallbackException {
   public static void main(String[] args) {
      try {
         new 1();
      } catch (Exception var2) {
         System.err.println("Error: Callback no soportado.");
         var2.printStackTrace();
      }

   }
}
