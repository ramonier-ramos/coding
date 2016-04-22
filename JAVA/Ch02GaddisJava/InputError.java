// This code includes the error described on pages 88-91 in the textbook.

import java.util.Scanner;  // Needed for the Scanner class

public class InputError
{
   public static void main(String[] args)
   {
      // Declare variables
      int number;   // To hold any integer number value
      String word;  // To hold any String value
            
      // Create a Scanner object to read input
      Scanner keyboard = new Scanner(System.in);
      
      // Prompt user to enter any integer value
      System.out.print("Enter any integer: ");
      number = keyboard.nextInt();
      
      // Prompt user to enter any String value
      System.out.print("Enter any word: ");
      word = keyboard.nextLine();
      
      // Display the information back to the user.
      System.out.println("Your integer was " + number + 
                         " and your word was " + word);
   }
}
