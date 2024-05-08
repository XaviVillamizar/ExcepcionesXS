package Throwable.Exception;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ScriptException {
   public static void main(String[] args) {
      try {
         ScriptEngineManager manager = new ScriptEngineManager();
         ScriptEngine engine = manager.getEngineByName("JavaScript");
         String invalidScript = "function x() { ; } // Falta parentesis de cierre";
         engine.eval(invalidScript);
      } catch (Exception var4) {
         System.err.println("Error: Fallo en la evaluacion del script.");
         System.err.println("  Razon: " + var4.getMessage());
      }

   }
}
