package Throwable.RuntimeException;

public class ProviderException {
   public static void main(String[] args) {
      try {
         byte[] var1 = CryptoServiceProvider.encrypt(new byte[0], "RSA");
      } catch (java.security.ProviderException var2) {
         System.err.println("Error al cifrar los datos:");
         System.err.println("  Razón: " + var2.getMessage());
      }

   }
}
