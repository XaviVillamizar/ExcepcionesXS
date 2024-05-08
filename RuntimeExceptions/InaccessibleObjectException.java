package Throwable.RuntimeException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InaccessibleObjectException {
   public static void main(String[] args) {
      try {
         Class<?> targetClass = MyClass.class;
         Field privateField = targetClass.getDeclaredField("privateField");
         privateField.setAccessible(true);
         System.out.println("Valor del campo privado: " + String.valueOf(privateField.get((Object)null)));
         Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
         privateMethod.setAccessible(true);
         privateMethod.invoke((Object)null);
      } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | NoSuchFieldException var4) {
         System.err.println("Error: No se puede acceder al miembro privado de la clase.");
         System.err.println("  Razón: " + var4.getMessage());
      }

   }
}
