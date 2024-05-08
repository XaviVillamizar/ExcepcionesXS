package Throwable.RuntimeException;

public class InternalExceptionEx {
   public static void main(String[] args) {
      CryptoLibrary crypto = new CryptoLibrary();
      String data = "This is some secret data";
      String shortKey = "abc";

      try {
         String encryptedData = crypto.encrypt(data, shortKey);
         System.out.println("Encrypted data: " + encryptedData);
      } catch (InternalException var5) {
         System.err.println("Error: Encryption failed due to internal library error.");
         System.err.println("  Reason: " + var5.getMessage());
      }

   }
}
