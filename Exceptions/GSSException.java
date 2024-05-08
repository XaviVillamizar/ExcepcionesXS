package Throwable.Exception;

public class GSSException {
   public static void main(String[] args) {
      try {
         throw new org.ietf.jgss.GSSException(11, 1, "Error de GSS");
      } catch (org.ietf.jgss.GSSException var2) {
         System.err.println("Ocurrio un error GSS: " + var2.getMessage());
         var2.printStackTrace();
      }
   }
}
