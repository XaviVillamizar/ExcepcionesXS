package Throwable.RuntimeException;

import com.sun.jdi.VirtualMachine;
import com.sun.jdi.connect.AttachingConnector;

public class VMMismatchExceptionEx {
   public static void main(String[] args) {
      try {
         AttachingConnector connector = new Throwable.RuntimeException.VMMismatchExceptionEx.DummyAttachingConnector();
         VirtualMachine vm = connector.attach(connector.defaultArguments());
         vm.suspend();
         System.out.println("Operación de depuración realizada con éxito");
      } catch (Exception var3) {
         System.err.println("Error: Excepción de incompatibilidad de versión de la máquina virtual - " + var3.getMessage());
         System.err.println("  Razón: El conector no coincide con la versión de la JVM.");
      }

   }
}
