package Throwable.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.List;

public class AclNotFoundException {
   public static void main(String[] args) {
      try {
         String filePath = "non_existent_file.txt";
         File file = new File(filePath);
         if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filePath);
         }

         AclFileAttributeView aclView = (AclFileAttributeView)Files.getFileAttributeView(Paths.get(filePath), AclFileAttributeView.class);
         List var4 = aclView.getAcl();
      } catch (FileNotFoundException var5) {
         System.err.println("Error: File not found.");
         System.err.println("  Reason: " + var5.getMessage());
      } catch (Exception var6) {
         System.err.println("Error: Unexpected exception.");
         var6.printStackTrace();
      }

   }
}
