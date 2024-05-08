package Throwable.Exception;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvocationException {
   public static void main(String[] args) {
      try {
         Class<?> clazz = MyClass.class;
         Method method = clazz.getMethod("myMethod");
         method.invoke(clazz.newInstance());
      } catch (IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException var3) {
         System.err.println("Ocurrio una excepcion al invocar el metodo: " + var3.getMessage());
         var3.printStackTrace();
      }

   }
}
