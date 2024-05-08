package Throwable.Exception;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

public class LastOwnerException {
   public static void main(String[] args) throws MalformedObjectNameException, MBeanRegistrationException, NotCompliantMBeanException {
      MBeanServer mBeanServer = MBeanServerFactory.createMBeanServer();

      try {
         ObjectName objectName = new ObjectName("com.example:type=MyMBean");
         mBeanServer.registerMBean(new MyMBean(), objectName);
         mBeanServer.registerMBean(new MyMBean(), objectName);
      } catch (InstanceAlreadyExistsException var3) {
         System.err.println("InstanceAlreadyExistsException: " + var3.getMessage());
      }

   }
}
