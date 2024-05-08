package Throwable.RuntimeException;

import com.sun.jdi.Bootstrap;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.VirtualMachineManager;
import com.sun.jdi.connect.AttachingConnector;
import com.sun.jdi.connect.Connector;
import java.util.Iterator;

public class VMDisconnectedException {
   public static void main(String[] args) {
      try {
         VirtualMachineManager vmManager = Bootstrap.virtualMachineManager();
         AttachingConnector connector = findSocketAttachingConnector(vmManager);
         VirtualMachine vm = connector.attach(connector.defaultArguments());
         vm.suspend();
         System.out.println("Successfully performed debugging operation");
      } catch (Exception var4) {
         System.err.println("Error: VMDisconnectedException - " + var4.getMessage());
         System.err.println("  Reason: The remote JVM has been terminated.");
      }

   }

   private static AttachingConnector findSocketAttachingConnector(VirtualMachineManager vmManager) {
      Iterator var1 = vmManager.attachingConnectors().iterator();
      if (var1.hasNext()) {
         Connector connector = (Connector)var1.next();
         throw new RuntimeException("Uncompilable code - cannot find symbol\n  symbol:   class SocketAttachingConnector\n  location: class Throwable.RuntimeException.VMDisconnectedException");
      } else {
         throw new RuntimeException("SocketAttachingConnector not found");
      }
   }
}
