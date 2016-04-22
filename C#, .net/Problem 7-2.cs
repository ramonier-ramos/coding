// Practice Problem 7_2
// Description: Calculate the radius of a circle
using System;
public class Problem_7_2
{
    public static void Main(string[] args)
    {
        // Declare variable
        double radius;

        // Display initial instructions to user (optional)
        Console.WriteLine("Welcome to the Area of a Circle Calculator");
        Console.WriteLine("------------------------------------------");
        Console.WriteLine("You will enter the radius of a circle and");
        Console.WriteLine("the program will calculate and display the");
        Console.WriteLine("corresponding area of that circle.");
        Console.WriteLine("-----------------------------------------\n");

        // Prompt user to enter the radius
        Console.Write("Enter the radius of the circle (Enter -1 to quit): ");
        radius = Convert.ToDouble(Console.ReadLine());

        // Loop to handle multiple circles per program
        while (radius != -1)
        {
            // Call custom method, then display result
            Console.WriteLine("The circle's area is: {0} ", CalculateCircleArea(radius));

            // Prompt user for radius of the next circle, and read input
            Console.Write("\nEnter the radius for the next circle (Enter -1 to quit): ");
            radius = Convert.ToDouble(Console.ReadLine());
        }// end while

    }// end main method

    // Create method to calculate radius of a circle
    public static double CalculateCircleArea(double circleRadius)
    {
        // A circle's area is equal to Pi times its radius squared
        return Math.PI * circleRadius * circleRadius;
    }// end method CalculateCircleArea

}// end class
