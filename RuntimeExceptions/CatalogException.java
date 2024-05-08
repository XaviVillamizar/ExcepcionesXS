package Throwable.RuntimeException;

public class CatalogException {
   public static void main(String[] args) {
      try {
         throw new javax.xml.catalog.CatalogException("Error de catalogo: no se puede procesar el catalogo XML");
      } catch (javax.xml.catalog.CatalogException var2) {
         System.err.println("Error: Excepcion en el catalogo XML.");
         System.err.println("  Razon: " + var2.getMessage());
      }
   }
}
