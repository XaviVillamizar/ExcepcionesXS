package Throwable.RuntimeException;

import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.undo.UndoManager;

public class CannotUndoException {
   public static void main(String[] args) {
      StyleContext sc = new StyleContext();
      StyledDocument doc = new DefaultStyledDocument(sc);
      UndoManager undoManager = new UndoManager();
      doc.addUndoableEditListener(undoManager);

      try {
         doc.insertString(0, "Hola, mundo!", (AttributeSet)null);
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      try {
         undoManager.undo();
      } catch (javax.swing.undo.CannotUndoException var5) {
         System.err.println("Error: No se puede deshacer la última acción.");
         System.err.println("  Razon: " + var5.getMessage());
      }

   }
}
