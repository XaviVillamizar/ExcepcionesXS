package Throwable.Exception;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

public class UnsupportedAudioFileException {
   public static void main(String[] args) {
      try {
         File audioFile = new File("audio.wav");
         AudioInputStream var2 = AudioSystem.getAudioInputStream(audioFile);
      } catch (javax.sound.sampled.UnsupportedAudioFileException var3) {
         System.err.println("Error: Archivo de audio no compatible.");
         var3.printStackTrace();
      } catch (IOException var4) {
         System.err.println("Error: Ocurrio un error de E/S al leer el archivo de audio.");
         var4.printStackTrace();
      }

   }
}
