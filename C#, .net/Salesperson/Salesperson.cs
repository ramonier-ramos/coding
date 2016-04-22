//Ch. 5 practice #2
//Filename: Salesperson.cs
//Description: to Calculate the pay for a salesperson
using System;
public class Salesperson
{
    public static void Main(string[] args)
    {
        // NOTE: In future chapters, we will learn about CONSTANTS
        // and we will see that the product prices would be good
        // candidates to be declared as constants in this program.

        // Declare variables
        int productNumber = 0; // Product number
        int numberSold; // Number sold of a given product
        decimal grossSales = 0; // Total product gross sales
        decimal earnings; // Salesperson earnings

        // Display initial instructions to user (optional)
        Console.WriteLine("Welcome to the Salesperson Compensation Calculator");
        Console.WriteLine("--------------------------------------------------");
        Console.WriteLine("You will enter in how many of each of four products");
        Console.WriteLine("were sold in the past week by a salesperson.  The");
        Console.WriteLine("application will then calculate the total amount of");
        Console.WriteLine("money to be paid to that salesperson for the week.");
        Console.WriteLine("--------------------------------------------------\n");

        // Loop through all four products to obtain sales data
        while (productNumber < 4)
        {
            ++productNumber; // Increment product number by 1 each time through loop

            // Prompt user for number of product sold and obtain input from user
            Console.Write("Enter number sold of product #{0}: ", productNumber);
            numberSold = Convert.ToInt32(Console.ReadLine());

            // Determine gross sales of individual product and add to total
            if (productNumber == 1)
                grossSales += numberSold * 239.99M;
            else if (productNumber == 2)
                grossSales += numberSold * 129.75M;
            else if (productNumber == 3)
                grossSales += numberSold * 99.95M;
            else if (productNumber == 4)
                grossSales += numberSold * 350.89M;
        } // End while

        // Calculate and display salesperson's total weekly earnings
        // (Earnings formula is: $200 plus 9% of gross sales)
        earnings = 200 + (0.09M * grossSales);
        Console.WriteLine("\nSalesperson earnings this week: {0:C}\n", earnings);
    } // End method Main
} // End class 

        
 