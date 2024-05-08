package Throwable.Error;

import java.lang.reflect.Method;

public class AnnotationFormatError {
   public static void main(String[] args) {
      try {
         Class<?> clazz = Class.forName("Throwable.Error.MyClass");
         Method method = clazz.getMethod("myMethod");
         MyAnnotation annotation = (MyAnnotation)method.getAnnotation(MyAnnotation.class);
         System.out.println("Valor de la anotacion: " + annotation.value());
      } catch (ClassNotFoundException var4) {
         System.err.println("Clase no encontrada: " + var4.getMessage());
      } catch (NoSuchMethodException var5) {
         System.err.println("Metodo no encontrado: " + var5.getMessage());
      }

   }
}
