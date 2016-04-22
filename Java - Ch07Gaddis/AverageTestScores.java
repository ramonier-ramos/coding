// This program adds to the DisplayTestScores.java program.

import java.util.Scanner;  // Needed for Scanner class

public class AverageTestScores
{
   public static void main(String[] args)
   {
      int numTests;   // The number of tests
      int[] tests;    // Array of test scores
      
      int total = 0;  // Total (sum) of all test scores (accumulator)
      int average;    // Average test score

      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);

      // Get the number of test scores
      System.out.print("How many tests do you have? ");
      numTests = keyboard.nextInt();

      // Create an array to hold that number of scores
      tests = new int[numTests];

      // Get the individual test scores
      for (int index = 0; index < tests.length; index++)
      {
         System.out.print("Enter test score " + (index + 1) + ": ");
         tests[index] = keyboard.nextInt();
         
         // Keep a running total of the test scores
         total += tests[index];
      }

      // Display the test scores
      System.out.println();
      System.out.println("Here are the scores you entered:");
      for (int index = 0; index < tests.length; index++)
         System.out.print(tests[index] + " ");
      
      // Calculate and display average test score
      average = total / numTests;
      System.out.println("\nThe average test score was: " + average);

   }
}