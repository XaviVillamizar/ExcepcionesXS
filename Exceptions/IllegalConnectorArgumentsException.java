package Throwable.Exception;

import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.util.HashMap;
import java.util.Map;
import javax.management.MBeanServer;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import javax.management.remote.rmi.RMIConnectorServer;

public class IllegalConnectorArgumentsException {
   public static void main(String[] args) {
      try {
         LocateRegistry.createRegistry(1099);
         JMXServiceURL url = new JMXServiceURL("service:jmx:rmi:///jndi/rmi://localhost:1099/server");
         Map<String, Object> env = new HashMap();
         env.put("jmx.remote.jndi.rebind", "true");
         RMIConnectorServer connectorServer = new RMIConnectorServer(url, env, (MBeanServer)null);
         connectorServer.start();
         JMXConnector connector = JMXConnectorFactory.connect(url);
         connector.connect();
         System.out.println("Connected to MBean server successfully.");
         connector.close();
      } catch (IOException var5) {
         System.err.println("IOException: " + var5.getMessage());
      } catch (Exception var6) {
         System.err.println("IllegalConnectorArgumentsException: " + var6.getMessage());
      }

   }
}
