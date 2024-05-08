package Throwable.RuntimeException;

public class IncompleteAnnotationException {
   public static void main(String[] args) {
      try {
         MyAnnotation annotation = (MyAnnotation)MyClass.class.getAnnotation(MyAnnotation.class);
         System.out.println("Annotation value: " + annotation.value());
      } catch (Exception var2) {
         throw new RuntimeException("Uncompilable code - cannot find symbol\n  symbol:   method annotationType()\n  location: variable e of type java.lang.Exception");
      }
   }
}
