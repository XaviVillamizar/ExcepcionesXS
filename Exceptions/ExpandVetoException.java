package Throwable.Exception;

import Throwable.Exception.ExpandVetoException.1;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExpandVetoException {
   public static void main(String[] args) {
      JFrame frame = new JFrame("Ejemplo de ExpandVetoException");
      frame.setDefaultCloseOperation(3);
      JPanel panel = new JPanel(new BorderLayout());
      frame.add(panel);
      JButton button = new JButton("Haz clic para expandir");
      panel.add(button, "Center");
      frame.addComponentListener(new 1(frame));
      frame.setSize(300, 200);
      frame.setLocationRelativeTo((Component)null);
      frame.setVisible(true);
   }
}
