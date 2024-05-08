package Throwable.Exception;

class DataLoader {
   public void refreshData() throws RefreshFailedException {
      if (!this.updateDataFromExternalSource()) {
         throw new RefreshFailedException("La actualizacion de los datos ha fallado.");
      }
   }

   private boolean updateDataFromExternalSource() {
      return false;
   }
}
