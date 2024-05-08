package Throwable.Exception;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

public class MidiUnavailableException {
   public static void main(String[] args) {
      try {
         Synthesizer synthesizer = MidiSystem.getSynthesizer();
         if (synthesizer != null && synthesizer instanceof Synthesizer) {
            System.out.println("Sintetizador MIDI encontrado");
         } else {
            System.err.println("Error: No se encontró el sintetizador MIDI externo.");
         }
      } catch (Exception var2) {
         System.err.println("Error: Sintetizador MIDI no disponible.");
      }

   }
}
