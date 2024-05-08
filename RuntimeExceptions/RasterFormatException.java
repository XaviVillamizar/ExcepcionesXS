package Throwable.RuntimeException;

import java.awt.image.BufferedImage;

public class RasterFormatException {
   public static void main(String[] args) {
      try {
         BufferedImage image = new BufferedImage(-1, -1, 2);
         image.getSubimage(0, 0, 10, 10);
      } catch (java.awt.image.RasterFormatException var2) {
         System.err.println("Error: Formato de raster inválido.");
         System.err.println("  Razón: " + var2.getMessage());
      }

   }
}
