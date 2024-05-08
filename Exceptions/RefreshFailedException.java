package Throwable.Exception;

import Throwable.Exception.RefreshFailedException.1;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;

public class RefreshFailedException {
   public static void main(String[] args) {
      Frame frame = new Frame("RefreshFailedException Example");
      Button button = new Button("Actualizar");
      TextArea textArea = new TextArea();
      button.addActionListener(new 1(textArea));
      frame.add(textArea, "Center");
      frame.add(button, "South");
      frame.setSize(400, 300);
      frame.setVisible(true);
   }
}
