//Ch.2 Programming Problem #8
//to input from keyboard
import java.util.Scanner; //to read from keyboard
public class SalesTax
{ 
   public static void main(String[] args)
      {
         //Declare constants and assign values
         final double STATE_RATE = 0.04; //State sales tax rate
         final double COUNTY_RATE = 0.02; //County sales tax rate
         
         //declare variables
         double purchase; //amount of purchase
         double statetax; //amount of state tax applied
         double countytax; //amount of county tax applied
         double totaltax; //total sales tax
         double totalcost; //total of purchase
         
         // Create scanner object for keyboard input
         Scanner keyboard = new Scanner (System.in);
         
         // Get amount of the purchase
         System.out.print("Enter the purchase amount: ");
         purchase = keyboard.nextDouble() ;
         
         // Calculate State tax
         statetax = purchase * STATE_RATE;
         
         // Calculate county tax
         countytax = purchase * COUNTY_RATE;
         
         // Calculate Total tax
         totaltax = statetax + countytax;
         
         // Calculate total cost
         totalcost = purchase + totaltax;
         
         // Display results
         System.out.println("Purchase amount: $" + purchase);
         System.out.println("State tax amount: $" + statetax);
         System.out.println("Count tax amount: $" + countytax);
         System.out.println("Total tax amount: $" + totaltax);
         System.out.println("Total cost amount: $" + totalcost);
         
         }//end main
         
}//end class
         
         