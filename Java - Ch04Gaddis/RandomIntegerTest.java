// This program generates random integers.

import java.util.Random;  // To use random number generator

public class RandomIntegerTest
{
   public static void main(String[] args)
   {
		// Declare constant
      final int ROUNDS = 10; // Number of random integers to generate
	   // Declare variables
      int count = 0;      // Number of random integers generated
      int randomInteger;  // Value of the random number generated
		
		// Create a random number object for use in the for loop below
      Random generator = new Random();

		// Loop through 100 simulated dice throws
      for(count = 0; count < ROUNDS; count++)
      {
		   // Return an integer from 1 through 6
         randomInteger = generator.nextInt(6) + 1 ;
         System.out.println ("The random number was: " + 
			                    randomInteger);
      }
   }
}