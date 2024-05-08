package Throwable.Error;

public class AssertionError {
   private int hour;

   public void setHour(int hour) {
      assert hour >= 0 && hour <= 23 : "Error: La hora debe estar en el rango de 0 a 23";

      this.hour = hour;
   }

   public int getHour() {
      return this.hour;
   }

   public static void main(String[] args) {
      AssertionError clock = new AssertionError();
      clock.setHour(15);
      System.out.println("Hora: " + clock.getHour());
      clock.setHour(25);
      System.out.println("Hora: " + clock.getHour());
   }
}
