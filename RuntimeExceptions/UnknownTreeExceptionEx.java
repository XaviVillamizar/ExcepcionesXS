package Throwable.RuntimeException;

public class UnknownTreeExceptionEx {
   public static void main(String[] args) {
      TreeManager treeManager = new TreeManager();

      try {
         Tree tree = treeManager.getTree("Oak");
         System.out.println("Tree name: " + tree.getName());
      } catch (UnknownTreeException var3) {
         System.err.println("Error: Unknown tree encountered.");
         System.err.println("  Message: " + var3.getMessage());
      }

   }
}
