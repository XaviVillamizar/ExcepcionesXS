package Throwable.RuntimeException;

public class UnknownEntityExceptionEx {
   public static void main(String[] args) {
      EntityManager entityManager = new EntityManager();

      try {
         Entity entity = entityManager.getEntity("obstacle");
         System.out.println("Entity name: " + entity.getName());
      } catch (UnknownEntityException var3) {
         System.err.println("Error: Unknown entity encountered.");
         System.err.println("  Message: " + var3.getMessage());
      }

   }
}
