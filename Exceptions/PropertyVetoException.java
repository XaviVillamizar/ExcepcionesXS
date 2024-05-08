package Throwable.Exception;

import Throwable.Exception.PropertyVetoException.1MyVetoListener;
import java.beans.PropertyChangeEvent;

public class PropertyVetoException {
   public static void main(String[] args) {
      PropertyChangeEvent evt = new PropertyChangeEvent(new Object(), "color", "verde", "rojo");
      1MyVetoListener listener = new 1MyVetoListener();

      try {
         listener.vetoableChange(evt);
         System.out.println("cambiado a rojo.");
      } catch (java.beans.PropertyVetoException var4) {
         System.err.println("Error: vetoed.");
         System.err.println("  razon: " + var4.getMessage());
      }

   }
}
