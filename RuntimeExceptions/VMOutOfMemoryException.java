package Throwable.RuntimeException;

public class VMOutOfMemoryException extends Exception {
   public VMOutOfMemoryException(String message) {
      super(message);
   }

   public static void main(String[] args) {
      try {
         connectToVirtualMachine("example_vm");
      } catch (Exception var2) {
         System.err.println("Error: Virtual Machine Not Found - " + var2.getMessage());
         System.err.println("  Reason: The specified virtual machine could not be found.");
      }

   }

   public static void connectToVirtualMachine(String vmName) throws Throwable.RuntimeException.VMOutOfMemoryException.VMNotFoundException {
      throw new Throwable.RuntimeException.VMOutOfMemoryException.VMNotFoundException("Virtual machine '" + vmName + "' not found");
   }
}
