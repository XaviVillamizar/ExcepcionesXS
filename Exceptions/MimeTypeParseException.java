package Throwable.Exception;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class MimeTypeParseException {
   public static void main(String[] args) {
      String urlString = "https://www.example.com/image.jpg";

      try {
         URLConnection connection = (new URL(urlString)).openConnection();
         String mimeType = connection.getContentType();
         System.out.println("MIME tipo: " + mimeType);
      } catch (IOException var4) {
         System.err.println("Error de conexión: " + var4.getMessage());
         var4.printStackTrace();
      } catch (Exception var5) {
         System.err.println("Error inesperado: " + var5.getMessage());
         var5.printStackTrace();
      }

   }
}
