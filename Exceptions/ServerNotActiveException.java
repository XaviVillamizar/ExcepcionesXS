package Throwable.Exception;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerNotActiveException {
   public static void main(String[] args) {
      try {
         Registry registry = LocateRegistry.getRegistry();
         String name = "RemoteImpl";
         Throwable.Exception.ServerNotActiveException.RemoteInterface remoteObject = (Throwable.Exception.ServerNotActiveException.RemoteInterface)registry.lookup(name);
         System.out.println("Llamando al método remoto...");
         String message = remoteObject.getMessage();
         System.out.println("Mensaje: " + message);
      } catch (Exception var5) {
         System.err.println("Error: Objeto remoto no enlazado.");
      }

   }
}
