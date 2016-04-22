//Ch.3 Programming Problem #2
using System;

public class OddorEven

{
    //Main method begins C# app
    public static void Main(string[] args)
    {
        int number; //number to evaluate

        Console .Write ("Enter an integer: ");//ask the user to input number
        number = Convert.ToInt32 (Console .ReadLine ());// Read number
        
        //Determine if number is even
        if (number % 2 == 0)
            Console .WriteLine("\nNumber is even. ");

        if (number % 2 != 0)
            Console .WriteLine ("\nNumber is odd. ");


        
       
    } //end Main       
}//End class OddorEven
