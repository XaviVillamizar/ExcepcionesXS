package Throwable.RuntimeException;

import com.sun.jdi.InvalidCodeIndexException;

class BytecodeManipulator {
   public void modifyInstruction(byte[] bytecode, int index, byte newInstruction) throws InvalidCodeIndexException {
      if (index >= 0 && index < bytecode.length) {
         bytecode[index] = newInstruction;
      } else {
         throw new InvalidCodeIndexException("Invalid instruction index.");
      }
   }
}
