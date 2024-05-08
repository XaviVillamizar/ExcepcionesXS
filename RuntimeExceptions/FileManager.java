package Throwable.RuntimeException;

import java.util.ArrayList;
import java.util.List;

class FileManager {
   private List<CloudStorageProvider> providers = new ArrayList();

   public FileManager() {
      this.providers.add(new CloudStorageProvider("Google Drive"));
      this.providers.add(new CloudStorageProvider("Dropbox"));
      this.providers.add(new CloudStorageProvider("OneDrive"));
   }

   public void accessFile(String filename) throws ProviderNotFoundException {
      throw new RuntimeException("Uncompilable code - constructor ProviderNotFoundException in class Throwable.RuntimeException.ProviderNotFoundException cannot be applied to given types;\n  required: no arguments\n  found:    java.lang.String\n  reason: actual and formal argument lists differ in length");
   }

   static {
      throw new RuntimeException("Uncompilable code - incompatible types: Throwable.RuntimeException.ProviderNotFoundException cannot be converted to java.lang.Throwable");
   }
}
