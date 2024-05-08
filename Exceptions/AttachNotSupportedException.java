package Throwable.Exception;

import com.sun.tools.attach.VirtualMachine;

public class AttachNotSupportedException {
   public static void main(String[] args) {
      String pid = "1234";

      try {
         VirtualMachine vm = VirtualMachine.attach(pid);
         System.out.println("Adjunto a la VM con PID " + pid);
         vm.detach();
      } catch (Exception var3) {
         System.err.println("Error: " + var3.getMessage());
      }

   }
}
