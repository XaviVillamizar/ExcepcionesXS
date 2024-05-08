package Throwable.Error;

import Throwable.Error.AWTError.1;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextField;

public class AWTError {
   public static void main(String[] args) {
      Frame frame = new Frame("AWT Error Example");
      TextField textField = new TextField("Texto de ejemplo");
      textField.addActionListener(new 1(frame, textField));
      frame.add(textField);
      frame.setSize(300, 100);
      frame.setVisible(true);
      frame.setLocationRelativeTo((Component)null);
   }
}
