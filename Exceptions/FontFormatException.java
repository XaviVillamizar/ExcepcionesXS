package Throwable.Exception;

import java.awt.Font;
import java.io.File;

public class FontFormatException {
   public static void main(String[] args) {
      try {
         Font customFont = Font.createFont(0, new File("customfont.ttf"));
         System.out.println("Fuente cargada exitosamente: " + customFont.getName());
      } catch (Exception var2) {
         System.err.println("Error al cargar la fuente: " + var2.getMessage());
         var2.printStackTrace();
      }

   }
}
