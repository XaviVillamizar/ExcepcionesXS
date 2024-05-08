package Throwable.RuntimeException;

import com.sun.jdi.VirtualMachine;
import com.sun.jdi.connect.AttachingConnector;

public class VMMismatchException {
   public static void main(String[] args) {
      try {
         AttachingConnector connector = new Throwable.RuntimeException.VMMismatchException.DummyAttachingConnector();
         VirtualMachine vm = connector.attach(connector.defaultArguments());
         vm.suspend();
         System.out.println("Successfully performed debugging operation");
      } catch (Exception var3) {
         System.err.println("Error: VMMismatchException - " + var3.getMessage());
         System.err.println("  Reason: The connector does not match the JVM version.");
      }

   }

   static {
      throw new RuntimeException("Uncompilable code - class VMMismatchException is public, should be declared in a file named VMMismatchException.java");
   }
}
