package Throwable.RuntimeException;

class Debugger {
   public void debug() throws InvalidStackFrameException {
      throw new InvalidStackFrameException("El marco de pila actual es inválido");
   }
}
