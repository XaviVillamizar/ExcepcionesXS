package Throwable.Exception;

public class StringConcatException {
   public static void main(String[] args) {
      StringBuilder builder = new StringBuilder();

      for(int i = 0; i < Integer.MAX_VALUE; ++i) {
         builder.append("String ");
      }

      String result = builder.toString();
   }
}
