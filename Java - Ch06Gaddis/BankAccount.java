// The BankAccount class simulates a bank account.

public class BankAccount
{
   private double balance;  // Account balance

   // This constructor sets the starting balance at 0.0.
   public BankAccount()
   {
      balance = 0.0;
   }
   
   // This constructor sets the starting balance to the value passed as an argument.
   public BankAccount(double startBalance)  // double argument
   {
      balance = startBalance;
   }

   // This constructor sets the starting balance to the value in the String argument.
   public BankAccount(String str)  // String argument
   {
      balance = Double.parseDouble(str);
   }

   // The deposit method makes a deposit into the account.
   public void deposit(double amount)  // double argument
   {
      balance += amount;
   }

   // The deposit method makes a deposit into the account.
   public void deposit(String str)  // String argument
   {
      balance += Double.parseDouble(str);
   }

   // The withdraw method withdraws an amount from the account.
   public void withdraw(double amount)  // double argument
   {
      balance -= amount;
   }

   // The withdraw method withdraws an amount from the account.
   public void withdraw(String str)  // String argument
   {
      balance -= Double.parseDouble(str);
   }

   // The setBalance method sets the account balance.
   public void setBalance(double b)  // double argument
   {
      balance = b;
   }

   // The setBalance method sets the account balance.
   public void setBalance(String str)  // String argument
   {
      balance = Double.parseDouble(str);
   }
   
   // The getBalance method returns the account balance.
   public double getBalance()
   {
      return balance;
   }
}
