package Throwable.RuntimeException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateTimeException {
   public static void main(String[] args) {
      try {
         String dateTimeString = "2023-05-32T15:30:00";
         LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
         System.out.println("Fecha y hora parseadas correctamente: " + String.valueOf(dateTime));
      } catch (DateTimeParseException var3) {
         System.err.println("Error: No se pudo analizar la fecha y hora.");
         System.err.println("  Razón: La cadena de fecha y hora no coincide con el formato esperado.");
         System.err.println("  Mensaje: " + var3.getMessage());
      }

   }
}
