package Throwable.Exception;

import java.io.File;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;

public class TransformerException {
   public static void main(String[] args) {
      try {
         StreamSource xslt = new StreamSource(new File("transform.xslt"));
         TransformerFactory factory = TransformerFactory.newInstance();
         factory.newTransformer(xslt);
         throw new javax.xml.transform.TransformerException("Error durante la transformación XML.");
      } catch (TransformerConfigurationException var4) {
         System.err.println("Error: Configuracion incorrecta del Transformer.");
         var4.printStackTrace();
      } catch (javax.xml.transform.TransformerException var5) {
         System.err.println("Error: Excepcion durante la transformacion.");
         var5.printStackTrace();
      }

   }
}
