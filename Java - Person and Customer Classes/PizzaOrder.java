// Programmer: Your Name
// Filename: PizzaOrder.java (Starter file for second part of Java Lab II.)
// Date: 99/99/9999
// Description: Accepts pizza order specifications and calculates price.

import java.util.Scanner; // To read keyboard input
// TASK #5 CREATE AN import STATEMENT TO USE THE DecimalFormat CLASS

public class PizzaOrder
{
   public static void main (String [] args)
   {
      // Declare constants
      final double TAX_RATE = 0.08;             // Sales tax rate
      final double TOPPING_PRICE = 1.25;        // Price per topping
      final double TEN_INCH_PRICE = 10.99;      // Price for 10-inch pizza
      final double TWELVE_INCH_PRICE = 12.99;   // Price for 12-inch pizza
      final double FOURTEEN_INCH_PRICE = 14.99; // Price for 14-inch pizza
      final double SIXTEEN_INCH_PRICE = 16.99;  // Price for 16-inch pizza
      final double DISCOUNT_AMOUNT= 2.00;       // Discount amount allowed
      // Declare variables
      String firstName;                         // User's first name
      boolean discount = false;                 // Flag, true if eligible for discount
      int inches;                               // Size of the pizza
      char crustType;                           // Code for type of crust
      String crust = "Hand-tossed";             // Name of crust
      double cost = TWELVE_INCH_PRICE;          // Cost of the pizza
      double tax;                               // Amount of tax
      char choice;                              // User's choice
      String input;                             // User's input
      String toppings = "Cheese ";              // List of toppings   
      int numberOfToppings = 0;                 // Number of toppings
      
      // TASK #5 CREATE A DecimalFormat OBJECT WITH TWO DECIMAL PLACES
            
      // Create a Scanner object to read input from the keyboard
      Scanner keyboard = new Scanner (System.in);

      // Display prompt and get input for first name
      System.out.println("Welcome to Mike and Diane's Pizza");
      System.out.print("Enter your first name: ");
      firstName = keyboard.nextLine();
      
      // Determine if user is eligible for discount by virtue 
      // of having the same first name as one of the owners
      // ADD LINES FOR TASK #1 HERE (USE AN if STATEMENT TO SET FLAG VALUE)
      
      // Display prompt and get input for pizza size choice
      System.out.println("Pizza Size (inches)   Cost");
      System.out.println("        10           $" + TEN_INCH_PRICE);
      System.out.println("        12           $" + TWELVE_INCH_PRICE);
      System.out.println("        14           $" + FOURTEEN_INCH_PRICE);
      System.out.println("        16           $" + SIXTEEN_INCH_PRICE);
      System.out.println("What size pizza would you like?"); 
      System.out.print("10, 12, 14, or 16 (enter the number only): ");
      inches = keyboard.nextInt();
      
      // Set price and size of pizza ordered
      // ADD LINES FOR TASK #2 HERE (USE AN if-else-if STATEMENT)
            
      // Consume the remaining newline character
      keyboard.nextLine(); // (Explained on pp. 88-91 in textbook)
      
      // Display prompt and get input for crust choice
      System.out.println("What type of crust do you want? ");
      System.out.print("(H) Hand-tossed, (T) Thin-crust, or " +
                       "(D) Deep-dish (enter H, T, or D): ");
      input = keyboard.nextLine();
      crustType = input.charAt(0);
   
      // Set user's crust choice on pizza ordered
      // ADD LINES FOR TASK #3 HERE (USE A switch STATEMENT)
                        
      // Display prompts and get inputs for topping choices, one at a time 
      // If topping is desired, add to topping list and number of toppings
      System.out.println("All pizzas come with cheese."); 
      System.out.println("Additional toppings are $" + TOPPING_PRICE + " each.");
      System.out.println("Choose from: Pepperoni, Sausage, Onion, Mushroom");
   
      System.out.print("Do you want Pepperoni?  (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Pepperoni ";
      }

      System.out.print("Do you want Sausage?  (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Sausage ";
      }

      System.out.print("Do you want Onions?  (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Onions ";
      }

      System.out.print("Do you want Mushrooms?  (Y/N): ");
      input = keyboard.nextLine();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Mushrooms ";
      }

      // Add additional toppings cost to cost of pizza
      cost = cost + (numberOfToppings * TOPPING_PRICE);
      
      // Display order confirmation
      System.out.println();
      System.out.println(firstName + ", your order is as follows: ");
      System.out.println(inches + " inch pizza");
      System.out.println(crust + " crust");
      System.out.println(toppings);    
      
      // Apply discount if user is eligible, based on his/her name
      // ADD LINES FOR TASK #4 HERE (USE AN if STATEMENT TO TEST FLAG VALUE)
      
      // TASK #5 EDIT PROGRAM SO ALL MONEY OUTPUT APPEARS WITH TWO DECIMAL PLACES
      System.out.println("The cost of your order is: $" + cost);
         
      // Calculate and display tax and total cost
      tax = cost * TAX_RATE;
      System.out.println("The tax is:  $" + tax);
      System.out.println("The total due is:  $" + (tax + cost));
      System.out.println("Your order will be ready for pickup in 30 minutes.");
   }  
}