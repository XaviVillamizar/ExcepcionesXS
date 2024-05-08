package Throwable.RuntimeException;

public class JarSignerExceptionEx {
   public static void main(String[] args) {
      JarSigningUtility jarSigner = new JarSigningUtility();
      String jarFilePath = "example.jar";
      String keystorePath = "keystore.jks";
      String alias = "myAlias";
      String password = "myPassword";

      try {
         jarSigner.signJar(jarFilePath, keystorePath, alias, password);
      } catch (JarSignerException var7) {
         System.err.println("Error: No se pudo firmar el archivo JAR.");
         System.err.println("  Razón: " + var7.getMessage());
      }

   }
}
