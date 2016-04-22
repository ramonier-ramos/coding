// This program demonstrates how variables may be declared throughout a method.
// (However, usually you declare all local variables at the beginning of a method.)

import javax.swing.JOptionPane;  // Needed for JOptionPane

public class VariableScope
{
   public static void main(String[] args)
   {
      // Get the user's first name
      String firstName;
      firstName = JOptionPane.showInputDialog("Enter your first name.");

      // Get the user's last name
      String lastName;
      lastName = JOptionPane.showInputDialog("Enter your last name.");

      // Display a message.
      JOptionPane.showMessageDialog(null, "Hello, " + firstName + " " + lastName + ".");

      System.exit(0);
   }
}
