package Throwable.RuntimeException;

import java.awt.Color;
import java.awt.color.ColorSpace;
import java.awt.color.ICC_ColorSpace;
import java.awt.color.ICC_Profile;

public class CMMException {
   public static void main(String[] args) {
      try {
         Color colorSRGB = Color.RED;
         ColorSpace espacioColorInvalido = new ICC_ColorSpace(ICC_Profile.getInstance("EspacioColorInvalido"));
         new Color(espacioColorInvalido, colorSRGB.getColorComponents((float[])null), 1.0F);
      } catch (Exception var4) {
         System.err.println("Error: Fallo la conversion de color.");
         System.err.println("  Razon: Se especifico un espacio de color invalido.");
      }

   }
}
