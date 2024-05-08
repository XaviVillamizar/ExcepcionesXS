package Throwable.RuntimeException;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;

public class NoSuchMechanismException {
   public static void main(String[] args) {
      try {
         Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
         System.out.println("Se ha obtenido una instancia del algoritmo de cifrado.");
      } catch (NoSuchAlgorithmException var2) {
         System.err.println("Error: No se pudo encontrar el algoritmo de cifrado especificado.");
         System.err.println("  Razón: " + var2.getMessage());
      } catch (Exception var3) {
         System.err.println("Error: No se pudo encontrar el relleno de cifrado especificado.");
         System.err.println("  Razón: " + var3.getMessage());
      }

   }
}
