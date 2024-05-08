package Throwable.Exception;

public class BadBinaryOpValueExpException {
   public static void main(String[] args) {
      BinaryOpValueExp exp = new BinaryOpValueExp();

      try {
         exp.setRightValue(20L);
         exp.setOperator('>');
         Object result = exp.apply((Object)null);
         System.out.println("El resultado de la expresión es: " + String.valueOf(result));
      } catch (Exception var3) {
         System.err.println("Error al evaluar la expresion binaria de valor: " + var3.getMessage());
      }

   }
}
