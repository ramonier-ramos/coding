//Ch. 3 Programming Problem #3
using System;

public class LargeValue
{
    //Main method begins C# app

    public static void Main(string[] args)
    {
        int number1; //first number
        int number2; //second number
        int number3; //third number
        int largest; //largest number
        int smallest; //smallest number

        Console.WriteLine("Enter your first number: "); //Ask user to input first number
        //read first number from user
        number1 = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Enter your second number: "); // ask user to input second number
        //read second number from user
        number2 = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine("Enter your third number; "); //ask user to input third number
        //read third number from user
        number3 = Convert.ToInt32(Console.ReadLine());

        //determine which number is largest and smallest
        largest = number1; //assume number1 is largest

        if (number2 > largest)//determine whether number2 is largest
            largest = number2;

        if (number3 > largest) //determine whether number3 is largest
            largest = number3;

        //determine which number is smallest
        smallest = number1;//assume number1 is smallest

        if (number2 < smallest) //determine whether number2 is smallest
            smallest = number2;

        if (number3 < smallest) //determine whether number3 is smallest
            smallest = number3;

        Console.WriteLine(" The largest number and the smallest number is {0} and {1}" , largest, smallest);
    }//end main

}//end class largestsmallest
