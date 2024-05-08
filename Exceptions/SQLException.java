package Throwable.Exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SQLException {
   public static void main(String[] args) {
      Connection connection = null;
      Statement statement = null;

      try {
         String url = "jdbc:mysql://localhost:3306/your_database";
         String usuario = "tu_usuario";
         String contrasena = "tu_contrasena";
         connection = DriverManager.getConnection(url, usuario, contrasena);
         statement = connection.createStatement();
         String sql = "INSERT INTO usuarios (id, nombre, correo) VALUES (1, 'Juan Perez', 'juanperez@example.com')";
         statement.executeUpdate(sql);
         System.out.println("Registro insertado exitosamente.");
      } catch (java.sql.SQLException var19) {
         System.err.println("Error: Operacion de la base de datos fallida.");
         System.err.println("  Estado SQL: " + var19.getSQLState());
         System.err.println("  Codigo de Vendedor: " + var19.getErrorCode());
         System.err.println("  Mensaje: " + var19.getMessage());
      } finally {
         if (statement != null) {
            try {
               statement.close();
            } catch (java.sql.SQLException var18) {
               System.err.println("Error: Fallo al cerrar la declaracion.");
               var18.printStackTrace();
            }
         }

         if (connection != null) {
            try {
               connection.close();
            } catch (java.sql.SQLException var17) {
               System.err.println("Error: Fallo al cerrar la conexion.");
               var17.printStackTrace();
            }
         }

      }

   }

   SQLException(String database_error_during_prepare_phase) {
      throw new UnsupportedOperationException("Not supported yet.");
   }
}
