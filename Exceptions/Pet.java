package Throwable.Exception;

class Pet {
   public String name;
   public String currentOwner;

   public Pet(String name) {
      this.name = name;
      this.currentOwner = null;
   }

   public void changeOwner(String newOwner) throws LastOwnerException {
      if (newOwner.equals(this.currentOwner)) {
         throw new LastOwnerException("El nuevo dueño no puede ser el mismo");
      } else {
         this.currentOwner = newOwner;
      }
   }
}
