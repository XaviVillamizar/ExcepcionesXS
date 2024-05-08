package Throwable.Exception;

public class AgentInitializationException {
   public static void main(String[] args) {
      Throwable.Exception.AgentInitializationException.DummyInstrumentation inst = new Throwable.Exception.AgentInitializationException.DummyInstrumentation();

      try {
         inst.addTransformer(new Throwable.Exception.AgentInitializationException.MyClassFileTransformer());
      } catch (Exception var3) {
         System.err.println("Error durante la inicializacion del agente: " + var3.getMessage());
      }

   }
}
