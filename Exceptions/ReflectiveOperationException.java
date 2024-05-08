package Throwable.Exception;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectiveOperationException {
   public static void main(String[] args) {
      try {
         Class<?> currentClass = ReflectiveOperationException.class;
         Method method = currentClass.getMethod("printMessage");
         method.invoke((Object)null);
      } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException var3) {
         System.err.println("Error: Operacion reflexiva fallida.");
         System.err.println("  Razon: " + var3.getMessage());
      }

   }
}
