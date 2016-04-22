// Java Lab IV (modified from Ch. 10, Programming Challenge 9, p. 696):
// Demo program for the SavingsAccount class.

import java.text.DecimalFormat;

public class SavingsDemo
{
   public static void main(String[] args)
   {
      // Create a Decimalformat object for formatting output
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      // Create a SavingsAccount object with a $100 balance, 
      // 3% interest rate, and a monthly service charge of $2.50
      SavingsAccount savings = new SavingsAccount(100.0, 0.03, 2.50);
      
      // Display what we have
      System.out.println("Balance: $" + dollar.format(savings.getBalance()));
      System.out.println("Number of deposits: " + savings.getNumDeposits());
      System.out.println("Number of withdrawals: " + savings.getNumWithdrawals());
      System.out.println();
      
      // Make some deposits
      savings.deposit(25.00);
      savings.deposit(10.00);
      savings.deposit(35.00);
      
      // Display what we've done so far
      System.out.println("Balance: $" + dollar.format(savings.getBalance()));
      System.out.println("Number of deposits: " + savings.getNumDeposits());
      System.out.println("Number of withdrawals: " + savings.getNumWithdrawals());
      System.out.println();
      
      // Make some withdrawals
      savings.withdraw(100.00);
      savings.withdraw(50.00);
      savings.withdraw(10.00);  // NOTE: This withdrawal and the next two will be disallowed
      savings.withdraw(1.00);   // Recall that withdrawals are not allowed from an inactive
      savings.withdraw(1.00);   // account (an account with a balance below $25)
      
      // Display what we've done so far
      System.out.println("Balance: $" + dollar.format(savings.getBalance()));
      System.out.println("Number of deposits: " + savings.getNumDeposits());
      System.out.println("Number of withdrawals: " + savings.getNumWithdrawals());
      System.out.println();

      // Do the monthly processing (adds interest and deducts service charges)
      savings.monthlyProcess(); // In this example, the interest earned is $0.04
   
      // Display what we've done so far
      System.out.println("Balance: $" + dollar.format(savings.getBalance()));
      System.out.println("Number of deposits: " + savings.getNumDeposits());
      System.out.println("Number of withdrawals: " + savings.getNumWithdrawals());
   }
}
