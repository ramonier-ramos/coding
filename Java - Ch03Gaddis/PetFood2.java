// This program modifies the PetFood.java program (line 21) to demonstrate an alternative
// way to handle user character input for a switch statement that may be in either upper 
// or lower case letters (note that only upper case letters need to be checked for now).

import java.util.Scanner;  // Needed for the Scanner class

public class PetFood2
{
   public static void main(String[] args)
   {
      String input;    // To hold input
      char foodGrade;  // Grade of pet food

      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      // Prompt the user for a grade of pet food
      System.out.println("Our pet food is available in three grades:");
      System.out.print("A, B, and C. Which do you want pricing for? ");
      input = keyboard.nextLine();
      foodGrade = Character.toUpperCase(input.charAt(0));  // Convert input to upper case

      // Display pricing for the selected grade
      switch(foodGrade)
      {
         case 'A':
            System.out.println("30 cents per lb.");
            break;
         case 'B':
            System.out.println("20 cents per lb.");
            break;
         case 'C':
            System.out.println("15 cents per lb.");
            break;
         default:
            System.out.println("Invalid choice.");
      }
   }
}
