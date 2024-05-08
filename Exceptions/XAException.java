package Throwable.Exception;

public class XAException {
   public static void main(String[] args) {
      try {
         throw new RuntimeException("Uncompilable code - cannot find symbol\n  symbol:   class TransactionManager\n  location: class Throwable.Exception.XAException");
      } catch (Exception var2) {
         if (var2 instanceof javax.transaction.xa.XAException) {
            System.err.println("Error: XAException durante la transacción.");
            System.err.println("  Código de error XA: " + ((javax.transaction.xa.XAException)var2).errorCode);
            System.err.println("  Mensaje: " + var2.getMessage());
         } else {
            System.err.println("Error: Excepción inesperada durante la transacción.");
            var2.printStackTrace();
         }

      }
   }
}
