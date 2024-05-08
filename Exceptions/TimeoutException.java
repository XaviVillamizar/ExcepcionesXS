package Throwable.Exception;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class TimeoutException {
   public static void main(String[] args) {
      try {
         Socket socket = new Socket("localhost", 8080);

         try {
            socket.setSoTimeout(1000);
            socket.getOutputStream().write("cliente".getBytes());
            byte[] buffer = new byte[1024];
            int bytesRecibidos = socket.getInputStream().read(buffer);
            PrintStream var10000 = System.out;
            String var10001 = new String(buffer, 0, bytesRecibidos);
            var10000.println("Datos recibidos: " + var10001);
         } catch (Throwable var5) {
            try {
               socket.close();
            } catch (Throwable var4) {
               var5.addSuppressed(var4);
            }

            throw var5;
         }

         socket.close();
      } catch (SocketTimeoutException var6) {
         System.err.println("Error: La operacion de socket ha superado el tiempo de espera.");
         var6.printStackTrace();
      } catch (IOException var7) {
         System.err.println("Error: Excepcion de E/S durante la comunicacion por socket.");
         var7.printStackTrace();
      }

   }
}
