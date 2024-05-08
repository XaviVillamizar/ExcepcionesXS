package Throwable.Exception;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class NoninvertibleTransformException {
   public static void main(String[] args) throws Exception {
      byte[] keyBytes = "mySecretKey".getBytes();
      new SecretKeySpec(keyBytes, "AES");
      Cipher cipher = Cipher.getInstance("AES");
      String plaintext = "Mensaje secreto";
      byte[] encryptedText = cipher.doFinal(plaintext.getBytes());
      cipher.doFinal(encryptedText);
   }
}
