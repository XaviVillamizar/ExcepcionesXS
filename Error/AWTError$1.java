package Throwable.Error;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AWTError$1 implements ActionListener {
   // $FF: synthetic field
   final Frame val$frame;
   // $FF: synthetic field
   final TextField val$textField;

   AWTError$1(final Frame val$frame, final TextField val$textField) {
      this.val$frame = var1;
      this.val$textField = var2;
   }

   public void actionPerformed(ActionEvent e) {
      this.val$frame.remove(this.val$textField);
   }
}
