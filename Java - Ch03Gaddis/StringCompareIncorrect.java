// This program incorrectly compares two String objects using a relational operator.
// (The program will report that two names, both "Mark", are NOT the same.)

import java.util.Scanner;  // Needed for the Scanner class

public class StringCompareIncorrect
{
   public static void main(String [] args)
   {
      String name1, name2, name3;  // To hold input
		
      // Create a Scanner object to read input
      Scanner keyboard = new Scanner(System.in);

		// Get name1 (enter value of "Mark")
      System.out.print("What is first name? ");
      name1 = keyboard.nextLine();
      
		// Get name2 (enter value of "Mark")
      System.out.print("What is second name? ");
      name2 = keyboard.nextLine();
      
		// Get name3 (enter value of "Mary")
      System.out.print("What is third name? ");
      name3 = keyboard.nextLine();
      
      // Compare "Mark" and "Mark"
      if (name1 == name2)
      {
         System.out.println(name1 + " and " + name2 + " are the same.");
      }
      else
      {
         System.out.println(name1 + " and " + name2 + " are NOT the same.");
      }

      // Compare "Mark" and "Mary"
      if (name1 == name3)
      {
         System.out.println(name1 + " and " + name3 + " are the same.");
      }
      else
      {
         System.out.println(name1 + " and " + name3 + " are NOT the same.");
      }
   }
}
