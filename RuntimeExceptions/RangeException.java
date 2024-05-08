package Throwable.RuntimeException;

import javax.xml.parsers.ParserConfigurationException;

public class RangeException {
   public static void main(String[] args) {
      try {
         throw new RuntimeException("Uncompilable code - cannot find symbol\n  symbol:   method createRange()\n  location: variable document of type org.w3c.dom.Document");
      } catch (ParserConfigurationException var2) {
         System.err.println("Error: ParserConfigurationException - " + var2.getMessage());
      }
   }
}
