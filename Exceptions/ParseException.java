package Throwable.Exception;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseException {
   public static void main(String[] args) throws java.text.ParseException {
      try {
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         String dateString = "2024-05-07";
         Date parsedDate = sdf.parse(dateString);
         System.out.println("Parsed date: " + String.valueOf(parsedDate));
      } catch (Exception var4) {
         System.err.println("Error: Invalid date format encountered.");
         System.err.println("  Reason: " + var4.getMessage());
      }

   }
}
