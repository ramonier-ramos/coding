// Ch.3 Programming Practice #8
// Filename: SoftwareSales.java
// Description: To calculate discount depending on quantity purchased
import java.util.Scanner;// needed to read input from user
import java.text.DecimalFormat; //needed to format input
public class SoftwareSales
{
      public static void main(String[] args)
      {
            //Declare constants
            final double PACKAGE = 99.0; 
            
            //Declare variables
            int quantity;
            double discount;
            double discPercent;
            double cost;
                      
            // Create Scanner object to read from user
            Scanner keyboard = new Scanner(System.in);
            
            // Create a decimal format object to format output
            DecimalFormat dollar = new DecimalFormat ("#,##0.00");
            
           //Get the quantity sold
           System.out.println(" Enter the amount of packages sold: ");
           quantity = keyboard.nextInt();
           
           //Determine the discount percentage
           if (quantity >= 100)
                 discPercent = .50; // 50 % discount
           else if (quantity >= 50)
                 discPercent = .40; // 40% discount
           else if (quantity >= 20)
                 discPercent = .30; // 30% discount
           else if (quantity >= 10)
                 discPercent = .20; // 20% discount
           else 
                 discPercent = 0.00; // No discount
                 
           //Calculate the discount amount
           discount = (quantity * PACKAGE) * discPercent;
           
           //Calculate Total Cost
           cost = (quantity * PACKAGE) - discount;
           
           //display total amount of discount and total amount of purchase after the discount
           System.out.println("Quantity of packages sold: " + quantity);
           System.out.println("The total discount is: $" + dollar.format(discount));
           System.out.println("The total amount of the purchase is: $" + dollar.format(cost));
        } //end main
        
            
   }//end class     
                    
