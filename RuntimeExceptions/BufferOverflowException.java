package Throwable.RuntimeException;

import java.nio.ByteBuffer;

public class BufferOverflowException {
   public static void main(String[] args) {
      try {
         ByteBuffer var1 = ByteBuffer.allocate(5);
      } catch (java.nio.BufferOverflowException var2) {
         System.err.println("Error: Intento de escribir más datos de los que el buffer puede contener.");
         System.err.println("  Razón: " + var2.getMessage());
      }

   }
}
