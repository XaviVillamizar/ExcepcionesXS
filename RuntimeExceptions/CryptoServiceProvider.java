package Throwable.RuntimeException;

import java.security.ProviderException;

class CryptoServiceProvider {
   public static byte[] encrypt(byte[] data, String algorithm) throws ProviderException {
      if (!algorithm.equals("AES")) {
         throw new ProviderException("El algoritmo de cifrado no es compatible");
      } else {
         return new byte[0];
      }
   }
}
