package Throwable.Exception;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.DESKeySpec;

public class KeySelectorException {
   public static void main(String[] args) throws Exception {
      byte[] rawKey = "ThisIsNotARealKey".getBytes();
      DESKeySpec keySpec = new DESKeySpec(rawKey);

      try {
         KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
         keyGenerator.init((AlgorithmParameterSpec)keySpec);
         System.out.println("Llave generada");
      } catch (Exception var4) {
         System.err.println("Error generando llave: " + var4.getMessage());
      }

   }
}
