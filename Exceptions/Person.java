package Throwable.Exception;

class Person implements Cloneable {
   String name;

   public Person(String name) {
      this.name = name;
   }

   public Object clone() throws CloneNotSupportedException {
      return this.clone();
   }

   static {
      throw new RuntimeException("Uncompilable code - clone() in Throwable.Exception.Person cannot override clone() in java.lang.Object\n  overridden method does not throw Throwable.Exception.CloneNotSupportedException");
   }
}
