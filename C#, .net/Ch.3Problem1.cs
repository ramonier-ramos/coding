//Ch. 3 Programming Problem #1
using System;

public class Addition
{
    //Main method begins C# app
    public static void Main(string[] args) 
    {
        int number1; //first number to add
        int number2; //second number to add
        int sum; //sum of numbers
        int difference; //subtraction of numbers
        int product; //multiplication of numbers
        int quotient; //division of numbers

        Console .Write ("Enter first Integer: "); //prompt user to enter first number
        //read first number from user
        number1 = Convert.ToInt32 (Console .ReadLine ()); 

        Console .Write ("Enter second Integer: "); //prompt user to enter second number
        //read second number from user
        number2 = Convert.ToInt32 (Console .ReadLine ());

        sum = number1 + number2; //add the numbers
        difference = number1 - number2;//subtraction of numbers
        product = number1 * number2; // multiply numbers
        quotient = number1 / number2; //divide the numbers

        Console.WriteLine ("Sum is {0} ", sum);
        Console.WriteLine("Difference is {0} ", difference);
        Console .WriteLine("Product is {0} ", product);
        Console .WriteLine("Quotient is {0} ", quotient);


         
    }//end main



}//end class addition


