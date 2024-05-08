package Throwable.Exception;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;
import java.io.IOException;

public class AgentLoadException {
   public static void main(String[] args) throws com.sun.tools.attach.AgentLoadException, AgentInitializationException, IOException, AttachNotSupportedException {
      String agentJarPath = "/path/to/agent.jar";
      VirtualMachine vm = VirtualMachine.attach("pid");
      vm.loadAgent(agentJarPath);
      System.out.println("Agente cargado exitosamente!");
   }
}
