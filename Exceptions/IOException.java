package Throwable.Exception;

import java.io.BufferedReader;
import java.io.FileReader;

public class IOException {
   public static void main(String[] args) {
      try {
         BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));

         String linea;
         while((linea = reader.readLine()) != null) {
            System.out.println(linea);
         }

         reader.close();
      } catch (Exception var3) {
         System.err.println("Ocurrio un error de entrada/salida: " + var3.getMessage());
         var3.printStackTrace();
      }

   }
}
