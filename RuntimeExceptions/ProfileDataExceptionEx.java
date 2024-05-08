package Throwable.RuntimeException;

public class ProfileDataExceptionEx {
   public static void main(String[] args) {
      try {
         new UserProfile("", 25, "invalidemail");
      } catch (ProfileDataException var2) {
         System.err.println("Error al crear el perfil:");
         System.err.println("  Razón: " + var2.getMessage());
      }

   }
}
