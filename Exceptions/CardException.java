package Throwable.Exception;

import javax.smartcardio.CardTerminal;
import javax.smartcardio.TerminalFactory;

public class CardException {
   public static void main(String[] args) {
      try {
         CardTerminal terminal = (CardTerminal)TerminalFactory.getDefault().terminals().list().get(0);
         terminal.connect("T=0");
      } catch (javax.smartcardio.CardException var2) {
         System.err.println("Se produjo una excepcion al manipular la tarjeta: " + var2.getMessage());
      } catch (Exception var3) {
         System.err.println("Ocurrio una excepcion inesperada: " + var3.getMessage());
      }

   }
}
