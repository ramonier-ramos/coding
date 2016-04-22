//Ch.3 Practice Problem 4
//Ask the user to enter 3 digits then display the digits with 3 spaces between them
using System;
public class IntegerSpacing

{
    //Main method begins C# app
    public static void Main(string[] args)
        
        {
        //Declare variables
        int number; //number input by user
        int digit1; //first digit
        int digit2; //second digit
        int digit3; //third digit

        //ask the user to enter three digit integer
        Console.WriteLine("Enter a three digit integer: ");
        number = Convert .ToInt32 (Console .ReadLine ()); //read user input   
     
        //determine the three digits
        digit1 = number / 100; // integer division
        digit2 = number % 100 / 10; // remainder operation and integer division
        digit3 = number % 10; // remainder operation
      
        //display results
        Console.WriteLine("Digits in {0} are : {1}   {2}   {3}", number, digit1, digit2, digit3);

        }//end main method

}//end class IntegerSpacing
