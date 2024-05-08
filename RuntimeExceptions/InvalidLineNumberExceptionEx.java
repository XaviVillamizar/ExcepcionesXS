package Throwable.RuntimeException;

public class InvalidLineNumberExceptionEx {
   public static void main(String[] args) {
      SourceCodeHandler handler = new SourceCodeHandler();
      String sourceCode = "public class Main {\n\tpublic static void main(String[] args) {\n\t\tSystem.out.println(\"Hello, world!\");\n\t}\n}";
      byte lineNumber = 5;

      try {
         handler.processSourceCode(sourceCode, lineNumber);
      } catch (InvalidLineNumberException var5) {
         System.err.println("Error: Invalid source code processing.");
         System.err.println("  Reason: " + var5.getMessage());
      }

   }

   static {
      throw new RuntimeException("Uncompilable code - class InvalidLineNumberExceptionEx is public, should be declared in a file named InvalidLineNumberExceptionEx.java");
   }
}
