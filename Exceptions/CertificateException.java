package Throwable.Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public class CertificateException {
   public static void main(String[] args) {
      try {
         X509Certificate var1 = loadCertificate("certificado.crt");
      } catch (java.security.cert.CertificateException var2) {
         System.err.println("Se produjo una excepción al cargar el certificado: " + var2.getMessage());
      } catch (FileNotFoundException var3) {
         System.err.println("No se encontro el archivo del certificado.");
      }

   }

   public static X509Certificate loadCertificate(String filePath) throws java.security.cert.CertificateException, FileNotFoundException {
      FileInputStream fis = new FileInputStream(filePath);
      CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
      X509Certificate certificate = (X509Certificate)certificateFactory.generateCertificate(fis);
      return certificate;
   }
}
