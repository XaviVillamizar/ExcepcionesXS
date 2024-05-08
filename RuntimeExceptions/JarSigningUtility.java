package Throwable.RuntimeException;

class JarSigningUtility {
   public void signJar(String jarFilePath, String keystorePath, String alias, String password) throws JarSignerException {
      throw new JarSignerException("Error al firmar el archivo JAR: " + jarFilePath);
   }
}
