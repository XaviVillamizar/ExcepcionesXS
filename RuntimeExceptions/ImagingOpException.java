package Throwable.RuntimeException;

import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImagingOpException {
   public static void main(String[] args) {
      try {
         File inputFile = new File("input_image.jpg");
         BufferedImage originalImage = ImageIO.read(inputFile);
         RescaleOp rescaleOp = new RescaleOp(1.2F, 0.0F, (RenderingHints)null);
         Image scaledImage = rescaleOp.filter(originalImage, (BufferedImage)null);
         File outputFile = new File("output_image.jpg");
         ImageIO.write((BufferedImage)scaledImage, "jpg", outputFile);
         System.out.println("Operación de procesamiento de imágenes completada.");
      } catch (IOException var6) {
         System.err.println("Error de E/S al leer o escribir la imagen.");
         var6.printStackTrace();
      } catch (java.awt.image.ImagingOpException var7) {
         System.err.println("Error: Excepción durante la operación de procesamiento de imágenes.");
         System.err.println("  Razón: " + var7.getMessage());
      }

   }
}
