package Throwable.Exception;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

public class UnsupportedFlavorException {
   public static void main(String[] args) {
      try {
         Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
         Transferable transferable = clipboard.getContents((Object)null);
         String textData = (String)transferable.getTransferData(DataFlavor.stringFlavor);
         System.out.println("Datos del portapapeles: " + textData);
      } catch (Exception var4) {
         System.err.println("Error: Ocurrió un error al obtener datos del portapapeles.");
         var4.printStackTrace();
      }

   }
}
