// The BankAccount class simulates a bank account.

public class BankAccount
{
   private double balance;  // Account balance

   // This constructor sets the starting balance at 0.0.
   public BankAccount()
   {
      balance = 0.0;
   }
   
   // This constructor sets the starting balance
   // to the value passed as a double argument.
   public BankAccount(double startBalance) throws NegativeStartingBalance
   {
      if (startBalance < 0)
         throw new NegativeStartingBalance(startBalance);
         
      balance = startBalance;
   }

   // This constructor sets the starting balance
   // to the value passed as a String argument.
   public BankAccount(String str)
   {
      balance = Double.parseDouble(str);
   }

   // This method makes a deposit into the account equal
	// to the value passed as a double argument.
   public void deposit(double amount)
   {
      balance += amount;
   }

   // This method makes a deposit into the account equal
   // to the value passed as a String argument.
   public void deposit(String str)
   {
      balance += Double.parseDouble(str);
   }

   // This method withdraws an amount from the account equal
	// to the value passed as a double argument.
   public void withdraw(double amount)
   {
      balance -= amount;
   }

   // This method withdraws an amount from the account equal
   // to the value passed as a String argument.
   public void withdraw(String str)
   {
      balance -= Double.parseDouble(str);
   }

   // This method sets the account balance
	// to the value passed as a double argument.
   public void setBalance(double b)
   {
      balance = b;
   }

   // This method sets the account balance
   // to the value passed as a String argument.
   public void setBalance(String str)
   {
      balance = Double.parseDouble(str);
   }
   
   // This method returns the account balance.
   public double getBalance()
   {
      return balance;
   }
}
