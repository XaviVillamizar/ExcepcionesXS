package Throwable.Exception;

import java.net.URI;

public class URISyntaxException {
   public static void main(String[] args) {
      try {
         String invalidUrl = "invalid_website.com";
         URI uri = new URI(invalidUrl);
         System.out.println("Parsed URI: " + String.valueOf(uri));
      } catch (java.net.URISyntaxException var3) {
         System.err.println("Error: Invalid URI format.");
         System.err.println("  Reason: " + var3.getReason());
         System.err.println("  Index: " + var3.getIndex());
         System.err.println("  Input: " + var3.getInput());
      }

   }
}
