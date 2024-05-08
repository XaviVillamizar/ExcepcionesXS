package Throwable.Exception;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.util.EventListener;

class PropertyVetoException$1MyVetoListener implements EventListener {
   public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
      if (evt.getPropertyName().equals("color") && evt.getNewValue().equals("red")) {
         throw new PropertyVetoException("Color rojo no permitido.", evt);
      }
   }
}
