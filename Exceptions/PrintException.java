package Throwable.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintException {
   public static void main(String[] args) {
      try {
         File outputFile = new File("nonExistentFile.txt");
         FileOutputStream fos = new FileOutputStream(outputFile);
         PrintStream ps = new PrintStream(fos);
         ps.println("Hello, World!");
         ps.close();
      } catch (FileNotFoundException var4) {
         System.err.println("Error: File not found.");
         System.err.println("  Reason: " + var4.getMessage());
      } catch (IOException var5) {
         System.err.println("Error: I/O exception occurred.");
         System.err.println("  Reason: " + var5.getMessage());
      }

   }
}
