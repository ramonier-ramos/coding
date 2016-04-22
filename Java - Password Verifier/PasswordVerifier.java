// Chapter 9 Programming Challenge 5: PasswordVerifier class

public class PasswordVerifier
{
   // Declare constant for minimum password length
   private static final int MIN_PASSWORD_LENGTH = 6;
   
   // The isValid method determines whether a password is valid or not.
   // (This method calls the other three custom (private) methods in this class.)
   public static boolean isValid(String str)
   {
      boolean status; // Flag for valid status
      
      if (str.length() >= MIN_PASSWORD_LENGTH && hasUpperCase(str)  
         && hasLowerCase(str) && hasDigit(str))
         status = true;
      else
         status = false;
         
      return status;
   }

   // The hasUpperCase method determines whether a string
   // has at least one uppercase character.
   private static boolean hasUpperCase(String str)
   {
      boolean status = false; // Declare flag variable for valid status
      int i = 0;              // Declare counter variable for loop
      
      // Loop until an uppercase character is found in string
      while (!status && i < str.length())
      {
         if (Character.isUpperCase(str.charAt(i)))
            status = true;
         i++;
      }
      
      return status; // Return true only if uppercase character found
   }

   // The hasLowerCase method determines whether a string
   // has at least one lowercase character.
   private static boolean hasLowerCase(String str)
   {
      boolean status = false; // Declare flag variable for valid status
      int i = 0;              // Declare counter variable for loop
      
      // Loop until a lowercase character is found in string
      while (!status && i < str.length())
      {
         if (Character.isLowerCase(str.charAt(i)))
            status = true;
         i++;
      }
      
      return status; // Return true only if lowercase character found
   }

   // The hasDigit method determines whether a string
   // has at least one numeric digit.
   private static boolean hasDigit(String str)
   {
      boolean status = false; // Declare flag variable for valid status
      int i = 0;              // Declare counter variable for loop
      
      // Loop until a digit is found in string
      while (!status && i < str.length())
      {
         if (Character.isDigit(str.charAt(i)))
            status = true;
         i++;
      }
      
      return status; // Return true only if digit found
   }
}