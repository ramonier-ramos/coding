//Programmer:Ramonier Ramos
//FileName: PrecisionTest.cs
//Description: Test double and decimal types
using System;



public class PrecisionTest
{
   
    public static void Main(string[] args)
    {
        //declare variables as double types
        double number1 = 4.3333;
        double number2 = 2.3333;
        double sum1;

        sum1 = number1 + number2;

        if (sum1 == 6.6666)
            Console .WriteLine("Sum1 equals 6.6666.");
        if (sum1 != 6.6666)
            Console.WriteLine ("Sum1 does not equal 6.6666.");

        //declare variables as decimal types
        decimal number3 = 4.3333m;
        decimal number4 = 2.3333m;
        decimal sum2;

        sum2 = number3 + number4 ;

        if ( sum2 == 6.6666m)
            Console .WriteLine ("Sum2 equals 6.6666");
        if (sum2 != 6.6666m)
            Console.WriteLine("Sum2 does not equal 6.6666");

    }
}
