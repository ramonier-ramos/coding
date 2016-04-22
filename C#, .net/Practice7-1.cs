// Practice problem 7-1
// Description: Calculates charges for parking.
using System;
public class Problem_7_1
{
    public static void Main(string[] args)
    {
        // Declare variables
        double hours; // hours for current customer
        decimal charge; // charge for current customer
        decimal totalReceipts = 0.00M; // total receipts for all customers for the day

        // Display initial instructions to user (optional)
        Console.WriteLine("Welcome to the Parking Charges Calculator");
        Console.WriteLine("-----------------------------------------");
        Console.WriteLine("For each customer, you will enter in the");
        Console.WriteLine("number of hours of parking used. The program");
        Console.WriteLine("will then calculate the parking charge for");
        Console.WriteLine("that customer.  Also calculated will be a");
        Console.WriteLine("running total of all charges for the day.");
        Console.WriteLine("-----------------------------------------\n");

        // Read in first customer's hours
        Console.Write("Enter the number of hours (Enter -1 to quit): ");
        hours = Convert.ToDouble(Console.ReadLine());

        while (hours != -1) // Loop until sentinel value is entered
        {
            // Calculate and display the charges
            charge = CalculateCharges(hours); // Call CalculateCharges method
            totalReceipts += charge; // Increment accumulator
            
            // output charge for current customer, and running total of receipts
            Console.WriteLine("Current charge: {0:C}. Total Receipts: {1:C}\n",
                charge, totalReceipts);

            // Read in the next customers hours
            Console.Write("Enter the number of hours (Enter -1 to quit): ");
            hours = Convert.ToDouble(Console.ReadLine());
      
         }// end while

    }// end main method

    // Determine customer parking charges, based on time parked
    public static decimal CalculateCharges(double hoursParked)
    {
        // Declare constants 
        const decimal MINIMUM_FEE = 2.00M; // Minimum fee
        const decimal MAXIMUM_FEE = 10.00M; // Maximum fee
        const decimal HOURLY_FEE = 0.50M; // hourly fee 
        const double MIN_HOURS = 3.0; // minimum number of hours to park

        // Declare variables
        decimal fee = MINIMUM_FEE; // Set initial value of fee to minimum

        // add fees for extra hours as applicable
        if (hoursParked > MIN_HOURS)
            fee += HOURLY_FEE * (decimal)(Math.Ceiling(hoursParked - MIN_HOURS));

        // Apply maximum fee (if applicable)
        if (fee > MAXIMUM_FEE)
            fee = MAXIMUM_FEE;

        return fee;
    }//end method CalculateCharges

}// end class
