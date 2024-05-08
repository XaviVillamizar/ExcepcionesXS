package Throwable.Exception;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AlreadyBoundException {
   public static void main(String[] args) {
      try {
         Registry registry = LocateRegistry.createRegistry(1099);
         String nombreObjeto = "MiObjeto";
         ObjetoRemoto objeto = new ObjetoRemoto();
         registry.bind(nombreObjeto, objeto);
         registry.bind(nombreObjeto, objeto);
      } catch (Exception var4) {
         System.err.println("Error: " + var4.getMessage());
      }

   }
}
