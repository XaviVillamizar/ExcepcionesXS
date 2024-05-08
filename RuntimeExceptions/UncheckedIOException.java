package Throwable.RuntimeException;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class UncheckedIOException {
   public static void main(String[] args) {
      try {
         FileInputStream fileInputStream = new FileInputStream("archivo_no_existente.txt");
         InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
         BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
         String line = bufferedReader.readLine();
         System.out.println("Primera línea del archivo: " + line);
      } catch (IOException var5) {
      }

   }
}
