package Throwable.RuntimeException;

class EntityManager {
   public Entity getEntity(String name) throws UnknownEntityException {
      if (name.equals("player")) {
         return new Entity("Player");
      } else if (name.equals("enemy")) {
         return new Entity("Enemy");
      } else {
         throw new UnknownEntityException("Entity with name '" + name + "' does not exist.");
      }
   }
}
