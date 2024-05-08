package Throwable.RuntimeException;

class CryptoLibrary {
   public String encrypt(String data, String key) throws InternalException {
      if (key.length() < 10) {
         throw new InternalException("Invalid key length");
      } else {
         return "encryptedData";
      }
   }
}
