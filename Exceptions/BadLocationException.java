package Throwable.Exception;

import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyledDocument;

public class BadLocationException {
   public static void main(String[] args) {
      try {
         StyledDocument doc = new DefaultStyledDocument();
         doc.insertString(0, "Hello, world!", new SimpleAttributeSet());
         doc.insertString(-1, "Extra text", new SimpleAttributeSet());
      } catch (Exception var2) {
         System.err.println("Error: Posicion de insercion invalida");
      }

   }
}
