package Throwable.Exception;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class IntrospectionException {
   public static void main(String[] args) {
      try {
         PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(MyBean.class).getPropertyDescriptors();
         PropertyDescriptor[] var2 = propertyDescriptors;
         int var3 = propertyDescriptors.length;

         for(int var4 = 0; var4 < var3; ++var4) {
            PropertyDescriptor descriptor = var2[var4];
            System.out.println("Propiedad: " + descriptor.getName());
         }
      } catch (Exception var6) {
         System.err.println("Error de introspeccion: " + var6.getMessage());
         var6.printStackTrace();
      }

   }
}
