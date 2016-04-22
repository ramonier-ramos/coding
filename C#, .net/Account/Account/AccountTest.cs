// Programming Problem 4_2
// Filename: AccountTest.cs
// Demonstrates Account class's capabilities.
using System;

public class AccountTest
{
    // Main method begins program execution
    public static void Main(string[] args)
    {
        // Declare variables to hold amounts entered by user
        decimal depositAmount;
        decimal withdrawalAmount;

        // Call Account class to create instances of that class (objects)
        Account account1 = new Account(50.00M); // Create first Account object
        Account account2 = new Account(-7.53M); // create second Account object

        // Display initial balance of each object
        Console.WriteLine("account1 balance: {0:C}", account1.Balance);
        Console.WriteLine("account2 balance: {0:C}\n", account2.Balance);

        // First, test the Credit method of the Account class

        // Prompt and obtain user input
        Console.Write("Enter deposit amount for account1: ");
        depositAmount = Convert.ToDecimal(Console.ReadLine());
        Console.WriteLine("\nAdding {0:C} to account1 balance\n", depositAmount);
        account1.Credit(depositAmount); // Add to account1 balance

        // Display account balances
        Console.WriteLine("account1 balance: {0:C}", account1.Balance);
        Console.WriteLine("account2 balance: {0:C}\n", account2.Balance);

        // Prompt and obtain user input
        Console.Write("Enter deposit amount for account2: ");
        depositAmount = Convert.ToDecimal(Console.ReadLine());
        Console.WriteLine("\nAdding {0:C} to account2 balance\n", depositAmount);
        account2.Credit(depositAmount); // Add to account2 balance

        // Display account balances
        Console.WriteLine("account1 balance: {0:C}", account1.Balance);
        Console.WriteLine("account2 balance: {0:C}\n", account2.Balance);

        // Second, test the Debit method of the Account class

        // Prompt and obtain user input
        Console.Write("Enter withdrawal amount for account1: ");
        withdrawalAmount = Convert.ToDecimal(Console.ReadLine());
        Console.WriteLine("\nSubtracting {0:C} from account1 balance\n",
           withdrawalAmount);
        account1.Debit(withdrawalAmount); // Subtract amount from account1

        // Display account balances
        Console.WriteLine("account1 balance: {0:C}", account1.Balance);
        Console.WriteLine("account2 balance: {0:C}\n", account2.Balance);

        // Prompt and obtain user input
        Console.Write("Enter withdrawal amount for account2: ");
        withdrawalAmount = Convert.ToDecimal(Console.ReadLine());
        Console.WriteLine("\nSubtracting {0:C} from account2 balance\n",
           withdrawalAmount);
        account2.Debit(withdrawalAmount); // Subtract amount from account2

        // Display account balances
        Console.WriteLine("account1 balance: {0:C}", account1.Balance);
        Console.WriteLine("account2 balance: {0:C}", account2.Balance);
    } // End method Main
} // End class AccountTest

