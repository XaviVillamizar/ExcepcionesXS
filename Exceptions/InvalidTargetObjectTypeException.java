package Throwable.Exception;

public class InvalidTargetObjectTypeException extends Exception {
   public InvalidTargetObjectTypeException(String message) {
      super(message);
   }

   public static void main(String[] args) {
      try {
         throw new InvalidTargetObjectTypeException("Tipo de objeto de destino invalido");
      } catch (InvalidTargetObjectTypeException var2) {
         System.err.println("Ocurrio una excepcion de tipo de objeto de destino invalido: " + var2.getMessage());
         var2.printStackTrace();
      }
   }
}
