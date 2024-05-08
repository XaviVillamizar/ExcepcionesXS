package Throwable.Exception;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class UnsupportedLookAndFeelException {
   public static void main(String[] args) {
      try {
         UIManager.setLookAndFeel("com.sun.java.plaf.motif.MotifLookAndFeel");
         JFrame frame = new JFrame("Unsupported Look and Feel");
         frame.setDefaultCloseOperation(3);
         frame.pack();
         frame.setVisible(true);
      } catch (Exception var2) {
         System.err.println("Error: Look and Feel not supported.");
         System.err.println("  Reason: " + var2.getMessage());
      }

   }
}
