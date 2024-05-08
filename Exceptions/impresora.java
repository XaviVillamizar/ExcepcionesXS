package Throwable.Exception;

class impresora {
   public boolean online;

   public impresora(boolean online) {
      this.online = online;
   }

   public void printDocument() throws LineUnavailableException {
      if (!this.online) {
         throw new LineUnavailableException("La impresora esta desconectada");
      }
   }
}
