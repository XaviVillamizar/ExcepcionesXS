package Throwable.Error;

public class CoderMalfunctionError {
   public static int dividir(int dividendo, int divisor) throws CoderMalfunctionErrorEx {
      if (divisor == 0) {
         throw new CoderMalfunctionErrorEx("Division por cero no valida");
      } else {
         return dividendo / divisor;
      }
   }

   public static void main(String[] args) {
      int dividendo = 10;
      byte divisor = 0;

      try {
         int resultado = dividir(dividendo, divisor);
         System.out.println("El resultado de la division es: " + resultado);
      } catch (CoderMalfunctionErrorEx var4) {
         System.err.println("Se produjo un error: " + var4.getMessage());
      }

   }
}
