package Throwable.Exception;

public class InvalidMidiDataException {
   public static void main(String[] args) {
      try {
         throw new javax.sound.midi.InvalidMidiDataException("Datos MIDI invalidos");
      } catch (javax.sound.midi.InvalidMidiDataException var2) {
         System.err.println("Ocurrio una excepcion de datos MIDI invalidos: " + var2.getMessage());
         var2.printStackTrace();
      }
   }
}
