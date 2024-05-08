package Throwable.Error;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOError {
   public static void main(String[] args) {
      try {
         BufferedReader reader = new BufferedReader(new FileReader("archivo_que_no_existe.txt"));

         String linea;
         while((linea = reader.readLine()) != null) {
            System.out.println(linea);
         }

         reader.close();
      } catch (IOException var3) {
         System.err.println("Error de E/S: " + var3.getMessage());
      }

   }
}
