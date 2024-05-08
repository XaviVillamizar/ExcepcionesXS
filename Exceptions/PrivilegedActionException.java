package Throwable.Exception;

import java.io.File;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class PrivilegedActionException {
   public static void main(String[] args) {
      PrivilegedAction<Void> action = () -> {
         try {
            File newFile = new File("/restricted/directory/new_file.txt");
            newFile.createNewFile();
            return null;
         } catch (IOException var1) {
            throw new RuntimeException("Uncompilable code - unreported exception <any>; must be caught or declared to be thrown");
         }
      };
      AccessController.doPrivileged(action);
   }
}
