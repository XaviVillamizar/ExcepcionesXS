package Throwable.Exception;

import javax.naming.Context;
import javax.naming.InitialContext;

public class NamingException {
   public static void main(String[] args) {
      try {
         Context initialContext = new InitialContext();
         Object var2 = initialContext.lookup("java:comp/env/dataSource");
      } catch (Exception var3) {
         System.err.println("Error: Naming service lookup failed.");
         System.err.println("  Reason: " + var3.getMessage());
      }

   }
}
