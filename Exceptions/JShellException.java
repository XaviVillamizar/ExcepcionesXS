package Throwable.Exception;

import jdk.jshell.JShell;

public class JShellException {
   public static void main(String[] args) {
      try {
         JShell jshell = JShell.create();
         jshell.eval("int x = 10;");
         jshell.eval("System.out.println(x);");
      } catch (Exception var2) {
         System.err.println("Ocurrio una excepcion en JShell: " + var2.getMessage());
         var2.printStackTrace();
      }

   }
}
