package Throwable.Exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.AccessControlException;

public class NotOwnerException {
   public static void main(String[] args) {
      try {
         File file = new File("secret.txt");
         FileWriter writer = new FileWriter(file);
         writer.write("Unauthorized modification attempt!");
         writer.close();
      } catch (AccessControlException var3) {
         System.err.println("Error: Permiso denegado debido a que no es el propietario.");
      } catch (IOException var4) {
         System.err.println("Error: Excepción de control de acceso: " + var4.getMessage());
      }

   }
}
