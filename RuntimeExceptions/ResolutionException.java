package Throwable.RuntimeException;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ResolutionException {
   public static void main(String[] args) {
      try {
         InetAddress address = InetAddress.getByName("invalid_hostname");
         System.out.println("Dirección IP: " + address.getHostAddress());
      } catch (UnknownHostException var2) {
         System.err.println("Error: No se pudo resolver el nombre de host.");
         System.err.println("  Razón: " + var2.getMessage());
      }

   }
}
