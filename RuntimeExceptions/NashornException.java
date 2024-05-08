package Throwable.RuntimeException;

import javax.script.ScriptEngine;

public class NashornException {
   public static void main(String[] args) {
      try {
         Throwable.RuntimeException.NashornException.NashornScriptEngineFactory factory = new Throwable.RuntimeException.NashornException.NashornScriptEngineFactory();
         ScriptEngine engine = factory.getScriptEngine();
         engine.eval("var x = 'Hello';\nx.someNonExistentFunction();");
      } catch (Exception var3) {
         System.err.println("Error: Excepción relacionada con Nashorn JavaScript Engine.");
         System.err.println("  Mensaje: " + var3.getMessage());
      }

   }
}
