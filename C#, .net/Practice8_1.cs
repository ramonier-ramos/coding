//Ch 8-1 practice
// Description: use a one-dimensional array to write a console application that prompts
// the user to input five number
using System;
public class Problem_8_1
{
    public static void Main(string[] args)
    {
        // Declare local variables
        int[] numbersArray = new int[5]; // array to hold values
        int count = 0; // number of values read

        // Loop until 5 valid values have been read
        while (count < 5)
        {
            // Prompt the user for value, and read input from user
            Console.WriteLine("Enter a whole number between 1 and 100");
            int number = Convert.ToInt32 (Console.ReadLine());

            // Validate input
            if(number >= 1 && number <= 100)
            {
                // Declare block-level variable
                bool duplicate = false; // Flags whether number already exists

                // Compare input number to numbers already in array
                for (int element = 0; element < count; element++)
                {
                    // if new number is a duplicate, set the flag
                    if (number == numbersArray[element])
                        duplicate = true;
                } // end for loop

                if (!duplicate)
                {
                    numbersArray[count] = number;
                    ++count; // increment count
                } // end if
                else
                {
                    Console.WriteLine("{0} has already been entered! \n", number);
                } // end else
            } // end if
            else
                Console.WriteLine("Number must be between 1 and 100! \n");
        } // end while

        // Display elements in array
        Console.Write("\nThe elements in the array are: ");
        foreach (int item in numbersArray)
            Console.Write("{0} ", item);
        Console.WriteLine(); // Blank line

    } // end method Main

}// End class problem 8-1

            








   
