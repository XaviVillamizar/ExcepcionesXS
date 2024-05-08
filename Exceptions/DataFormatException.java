package Throwable.Exception;

import java.util.zip.Inflater;

public class DataFormatException {
   public static void main(String[] args) {
      byte[] compressedData = new byte[]{120, -100, 75, 76, 74, 73, 44, 2, 0, 0, -111, -75, 11, 0, 30};

      try {
         String decompressedData = decompressData(compressedData);
         System.out.println("Datos descomprimidos: " + decompressedData);
      } catch (java.util.zip.DataFormatException var3) {
         System.err.println("Error al descomprimir los datos: " + var3.getMessage());
      }

   }

   private static String decompressData(byte[] compressedData) throws java.util.zip.DataFormatException {
      Inflater inflater = new Inflater();
      inflater.setInput(compressedData);
      byte[] buffer = new byte[1024];
      StringBuilder output = new StringBuilder();

      while(!inflater.finished()) {
         int count = inflater.inflate(buffer);
         output.append(new String(buffer, 0, count));
      }

      inflater.end();
      return output.toString();
   }
}
