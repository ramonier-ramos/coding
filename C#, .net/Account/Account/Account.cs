// Programming Problem 4_2
// Filename: Account.cs
// Account class with a Credit method that deposits money into the account
// and a Debit method that withdraws money from the account.
using System;

public class Account
{
    // Declare instance variable to store account balance
    private decimal balance;

    // Property to get and set balance
    public decimal Balance
    {
        get
        {
            return balance;
        } // End get
        set
        {
            // Validate that value is greater than or equal to 0; 
            // if it is not, balance is left unchanged
            if (value >= 0)
                balance = value;
        } // End set
    } // End property Balance

    // Constructor  
    public Account(decimal initialBalance)
    {
        Balance = initialBalance; // Set balance using property
    } // End constructor Account

    // Credits (adds) an amount to the account balance
    public void Credit(decimal amount)
    {
        Balance = Balance + amount; // Add amount to balance 
    } // End method Credit

    // Debits (subtracts) an amount from the account balance
    public void Debit(decimal amount)
    {
        if (amount > Balance)
            Console.WriteLine("Debit amount exceeded account balance.\n");

        Balance = Balance - amount; // Subtract amount from balance 
    } // End method Debit
} // End class Account
