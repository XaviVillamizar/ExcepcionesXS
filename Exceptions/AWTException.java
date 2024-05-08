package Throwable.Exception;

import java.awt.Robot;

public class AWTException {
   public static void main(String[] args) throws java.awt.AWTException {
      try {
         Robot robot = new Robot();
         robot.mouseMove(50, 50);
      } catch (Exception var2) {
         System.err.println("Error: " + var2.getMessage());
      }

   }
}
