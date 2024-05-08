package Throwable.RuntimeException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NoSuchElementException {
   public static void main(String[] args) {
      List<Integer> listaNumeros = new ArrayList();
      listaNumeros.add(1);
      listaNumeros.add(2);
      listaNumeros.add(3);
      Iterator iterador = listaNumeros.iterator();

      try {
         while(iterador.hasNext()) {
            Integer numero = (Integer)iterador.next();
            System.out.println("Elemento: " + numero);
         }

         throw new java.util.NoSuchElementException("No hay más elementos en la lista");
      } catch (java.util.NoSuchElementException var4) {
         System.err.println("Error: " + var4.getMessage());
      }
   }
}
