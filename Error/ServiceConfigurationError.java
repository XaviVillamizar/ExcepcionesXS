package Throwable.Error;

import java.util.Iterator;
import java.util.ServiceLoader;

public class ServiceConfigurationError {
   public static void main(String[] args) {
      ServiceLoader serviceLoader = ServiceLoader.load(StringProcessor.class);

      try {
         Iterator var2 = serviceLoader.iterator();

         while(var2.hasNext()) {
            StringProcessor processor = (StringProcessor)var2.next();
            processor.process("excepcion");
         }
      } catch (IllegalArgumentException var4) {
         System.err.println("error en el proceso: " + var4.getMessage());
      }

   }
}
