package Throwable.Exception;

import javax.sound.sampled.UnsupportedAudioFileException;

public class InvalidTypeException {
   public static void main(String[] args) {
      try {
         throw new UnsupportedAudioFileException("Tipo de archivo de audio no soportado");
      } catch (UnsupportedAudioFileException var2) {
         System.err.println("Ocurrio una excepcion de tipo de archivo de audio no soportado: " + var2.getMessage());
         var2.printStackTrace();
      }
   }
}
