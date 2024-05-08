package Throwable.Exception;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Line;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;

public class LineUnavailableException {
   public static void main(String[] args) {
      try {
         Info[] mixerInfos = AudioSystem.getMixerInfo();
         Mixer mixer = AudioSystem.getMixer(mixerInfos[0]);
         javax.sound.sampled.Line.Info lineInfo = new javax.sound.sampled.Line.Info(SourceDataLine.class);
         Line line = mixer.getLine(lineInfo);
         line.open();
         line.close();
      } catch (Exception var5) {
         System.err.println("Error: La línea de audio no está disponible.");
         var5.printStackTrace();
      }

   }
}
