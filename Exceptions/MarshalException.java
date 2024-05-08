package Throwable.Exception;

public class MarshalException {
   public static void main(String[] args) {
      try {
         throw new Throwable.Exception.MarshalException.MarshallingException("Error en la operacion de marshal");
      } catch (Exception var2) {
         System.err.println("Ocurrio una excepcion en la operacion de marshal: " + var2.getMessage());
         System.err.println("Taking some action to handle the exception...");
      }
   }
}
