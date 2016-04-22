import java.util.Scanner; // Required for use of Scanner class

public class InputValidation
{
   public static void main(String[] args)
   {
      // Declare variables
      String input;         // User input
      char favColorCode;    // 1-letter code for favorite color selected
      String favColor = ""; // Name of favorite color selected (initialized as empty string)

      // Create a Scanner object to read input from the keyboard
      Scanner keyboard = new Scanner(System.in);

      // Display welcome message
      System.out.println("Welcome to the Favorite Color Survey! \n");

      // Get user input for favorite color
      System.out.println("Enter the letter for your favorite color:");
      System.out.print("B = Blue \n" +
                       "G = Green \n" +
                       "R = Red \n" +
                       "Your selection: ");
      input = keyboard.nextLine();

      System.out.println(""); // Insert blank line in output for neater appearance
               
      // Handle null input (if the user just presses Enter without choosing a color)
      if (input.length() == 0)
      {
         System.out.println("No specification of favorite color was made.");
         System.out.println("Run the program again and select one of the color options.");
         System.exit(0); // NOTE: After Chapter 4, we will be able to repeat request to user instead
      }

      // Use toUpperCase method to convert input to uppercase to ease comparisons in code block below
      // (The charAt(0) method is used to get the first letter of user input only, in case the user
      // mistakenly types in the entire color name instead of just the first letter)
      favColorCode = Character.toUpperCase(input.charAt(0));

      // Handle invalid input (if the user enters in something other than one of the valid choices)
      // NOTE: On the next line, the exclamation point symbol means NOT, and the || symbol means OR
      if (!(favColorCode == 'B' || favColorCode == 'G' || favColorCode == 'R'))
      {
         System.out.println("An invalid specification of favorite color was made.");
         System.out.println("Run the program again and select one of the valid color options.");
         System.exit(0);
      }

      // Set the name of the favorite color selected, based on the code input by the user
      switch(favColorCode) 
      {
         case 'B':
            favColor = "Blue";
            break;
         case 'G':
            favColor = "Green";
            break;
         case 'R':
            favColor = "Red";
            break;
      }

      // Display confirmation of favorite color selected by user
      System.out.println("Your favorite color is " + favColor + ".");
   }
}
