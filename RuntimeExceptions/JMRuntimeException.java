package Throwable.RuntimeException;

import java.lang.management.ManagementFactory;
import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

public class JMRuntimeException {
   public static void main(String[] args) {
      try {
         MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
         ObjectName name = new ObjectName("com.example:type=Hello");
         Hello mbean = new Hello();
         mbs.registerMBean(mbean, name);
      } catch (InstanceAlreadyExistsException | MBeanRegistrationException | NotCompliantMBeanException | MalformedObjectNameException var4) {
         System.err.println("Error: Fallo al registrar el MBean.");
         System.err.println("  Razón: " + var4.getMessage());
      }

   }
}
