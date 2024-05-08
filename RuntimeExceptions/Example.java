package Throwable.RuntimeException;

class Example {
   public void doSomething() throws CheckedException {
      throw new CheckedException("Checked Exception occurred in doSomething() method");
   }
}
