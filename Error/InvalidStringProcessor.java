package Throwable.Error;

class InvalidStringProcessor implements StringProcessor {
   public void process(String input) {
      throw new IllegalArgumentException("invalido: " + input);
   }
}
