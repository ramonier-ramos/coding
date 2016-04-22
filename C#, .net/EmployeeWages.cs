// Ch.5 Practice #3
// Filename: EmployeeWages.cs
// Calculates employee wages.
using System;

public class EmployeeWages
{
    // Main method begins program execution
    public static void Main(string[] args)
    {
        // Declare variables
        int numEmployees; // Number of employees
        int count = 1; // Loop counter
        decimal hourlyRate; // Hourly pay rate for employee
        decimal hoursWorked; // Hours worked by employee
        decimal grossPay; // Gross pay for employee
        decimal totalGrossPay = 0; // Total gross pay for all employees

        // Display initial instructions to user (optional)
        Console.WriteLine("Welcome to the Employee Gross Pay Calculator");
        Console.WriteLine("--------------------------------------------");
        Console.WriteLine("You will enter in how many employees are to be");
        Console.WriteLine("processed.  Then, for each employee, you will");
        Console.WriteLine("enter in the employee's hourly pay rate and the");
        Console.WriteLine("number of hours that the employee worked in the");
        Console.WriteLine("past week.  Then, the application will calculate");
        Console.WriteLine("and display the employee's gross pay.  After all");
        Console.WriteLine("employees have been processed, the total gross");
        Console.WriteLine("pay of all employees together will be displayed.");
        Console.WriteLine("---------------------------------------------\n");

        Console.Write("Enter number of employees: ");
        numEmployees = Convert.ToInt32(Console.ReadLine());

        // Repeat calculation for number of employees
        while (count <= numEmployees)
        {
            // Prompt user and read hourly rate
            Console.Write("\nEnter hourly rate for employee #{0}: ", count);
            hourlyRate = Convert.ToDecimal(Console.ReadLine());

            // Prompt user and read hours worked
            Console.Write("Enter hours worked for employee #{0}: ", count);
            hoursWorked = Convert.ToDecimal(Console.ReadLine());

            // Calculate gross pay
            if (hoursWorked <= 40) // If straight time only
                grossPay = hoursWorked * hourlyRate;
            else // If overtime (overtime hours are paid at time and a half rate)
                grossPay = (40 * hourlyRate) + ((hoursWorked - 40) * (hourlyRate * 1.5M));

            // Add employee's gross pay to overall total gross pay
            totalGrossPay += grossPay;

            // Display gross pay for current employee
            Console.WriteLine("Gross pay for employee #{0} is {1:C}", count, grossPay);

            ++count; // Increment count of employees
        } // End while

        // Display total gross pay amount for all employeees
        Console.WriteLine("\nTotal gross pay for all {0} employees is {1:C}\n",
           count - 1, totalGrossPay);
    } // End method Main
} // End class Employee Wages


