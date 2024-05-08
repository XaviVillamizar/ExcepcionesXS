package Throwable.RuntimeException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.attribute.UserPrincipal;

public class IllegalPathStateException {
   public static void main(String[] args) {
      try {
         Path path = Paths.get("not:a:valid:path");
         Files.getLastModifiedTime(path);
         UserPrincipal owner = Files.getOwner(path);
         Files.setOwner(path, owner);
         Files.setPosixFilePermissions(path, PosixFilePermissions.fromString("rwxr-x---"));
      } catch (IOException var3) {
         System.err.println("Error de E/S al intentar acceder al archivo.");
         var3.printStackTrace();
      } catch (UnsupportedOperationException var4) {
         System.err.println("Error: Operación no soportada para la ruta proporcionada.");
         var4.printStackTrace();
      } catch (Exception var5) {
         System.err.println("Error: Argumento ilegal utilizado para la ruta.");
         var5.printStackTrace();
      }

   }
}
