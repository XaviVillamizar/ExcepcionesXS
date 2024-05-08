package Throwable.Exception;

public class JMException {
   public static void main(String[] args) {
      try {
         throw new javax.management.JMException("Error en la gestion de JMX");
      } catch (javax.management.JMException var2) {
         System.err.println("Ocurrio una excepcion en la gestion de JMX: " + var2.getMessage());
         var2.printStackTrace();
      }
   }
}
