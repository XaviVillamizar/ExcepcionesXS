package Throwable.RuntimeException;

class CloudStorageProvider {
   private String name;

   public CloudStorageProvider(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public boolean fileExists(String filename) {
      return false;
   }
}
