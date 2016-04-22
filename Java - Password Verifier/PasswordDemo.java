// Chapter 9 Programming Challenge 5: PasswordDemo class

import javax.swing.JOptionPane;

public class PasswordDemo
{
   public static void main(String[] args)
   {
      String input; // To hold keyboard input
      
      // Prompt user to input a password string meeting required criteria
      input = JOptionPane.showInputDialog("All passwords must contain at least six " + 
                                          "characters and have at least one\n" +
                                          "uppercase letter, at least one lowercase " +
                                          "letter, and at least one numerical digit.\n" +
                                          "\nEnter your password:");
      
      // Trap null entry to avoid program crash
      // (Not included in problem requirements)
      if (input.length() == 0)
      {
         JOptionPane.showMessageDialog(null, "No password was entered.");
         System.exit(0);
      }

      // Determine whether the password is valid or not
      // (Call isValid static method of PasswordVerifier class)
      if (PasswordVerifier.isValid(input))
         JOptionPane.showMessageDialog(null, "Valid password.");
      else
         JOptionPane.showMessageDialog(null, "Invalid password.");

      System.exit(0); // End program
   }
}