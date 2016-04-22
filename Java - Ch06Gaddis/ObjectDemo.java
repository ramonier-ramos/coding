// This program demonstrates using objects to write random numbers to a file.

import java.util.Scanner;  // To use the Scanner class
import java.util.Random;   // To use the Random class
import java.io.*;          // To use file I/O classes

public class ObjectDemo
{
   public static void main(String[] args) throws IOException
   {
      int maxNumbers;  // To hold the number of random numbers
      int number;      // To hold a random number
      
      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      // Create a Random object to generate random numbers
      Random rand = new Random();
      
      // Create a PrintWriter object to open a file
      PrintWriter outputFile = new PrintWriter("Numbers.txt");
      
      // Get the number of random numbers to write
      System.out.print("How many random numbers should I write? ");
      maxNumbers = keyboard.nextInt();
      
      // Write the random numbers to the file
      for (int count = 0; count < maxNumbers; count++)
      {
         // Generate a random integer
         number = rand.nextInt();
         
         // Write the random integer to the file
         outputFile.println(number);
      }
      
      // Close the file
      outputFile.close();
      System.out.println("Done");
   }
}