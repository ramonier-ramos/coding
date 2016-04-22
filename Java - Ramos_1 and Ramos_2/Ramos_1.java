// Programmer: Ramonier Ramos
// Filename: Ramos_1.java
// Due Date: 02/06/2015
// Description: Individual Assignment #1
import java.util.Scanner; // Required to read input from user
import java.text.DecimalFormat; // Required to format currency
public class Ramos_1
{
      //Main method begins program execution
      public static void main(String[] args)
      {
            // Declare Constants
            final double BEEF_DISH = 9.95; // Regular Price for Beef entree
            final double FISH_DISH = 8.95; // Regular Price for Fish entree
            final double VEGETARIAN_DISH = 7.50; // Regular price for vegetarian dish
            final double SALES_TAX_RATE = 0.065; // Sales tax rate applied to total before tip is added
            
            //Declare all variables needed for program to run successfully
            double total = 0; // Price before tax
            double salesTax = 0; // Sales tax of order
            String employeeID;  // Employee ID for customer
            double tip = 0; // tip from customer
            //String finalTip = Double.toString(tip);
            //String finalTip = "0" ;
            //double tip = Double.parseDouble(finalTip);  
            //(commented out to run with adding tip)
            String firstName; // Customers first name
            String lastName; // Customer last name
            char entreeDish; // Entree desired by customer
            String entree = "Beef"; // Default entree
            char prepMethod; // Preparation method desired by customer
            String prep = ""; // Default prep  method
            double mealPrice = 0; // Default meal price
            String input; // variable needed for string input
                       
            // Create Scanner object for keyboard input
            Scanner keyboard = new Scanner(System.in);
            
            // Create Decimal Format object to format currency
            DecimalFormat dollar = new DecimalFormat("##0.00");
            
            
            // Welcome message to customers of Lunch Stop 
            System.out.println("Welcome to Lunch Stop! \n");
              
            // Prompt the user to enter their Employee ID
            System.out.println("Please enter your Employee ID: ");
            employeeID = keyboard.nextLine(); 
            
            System.out.println("");
            
            //Handle null input (if user enters any characters other than 6)
            if (employeeID.length() != 6)
            {
                  System.out.println("Your Employee ID is unrecognizable");
                  System.out.println("The program will now close and you will need to restart");
                  System.exit(0);
            }
            
            // Prompt the user to enter their first name
            System.out.println("Enter your first name: ");
            firstName = keyboard.nextLine();
            
            System.out.println("");
            
            // Handle null input ( if user does not enter anything and presses enter)
            if (firstName.length() == 0)
            {
                  System.out.println("Your first name is required. ");
                  System.out.println("Program will end now and you will have to restart. Sorry. ");
                  System.exit(0);
            }
            
            // Prompt the user to enter their last name
            System.out.println("Enter your last name: ");
            lastName = keyboard.nextLine();
            
            System.out.println(""); // To make it easier to read on the user
            
            // Handle null input ( if user does not enter anything and presses enter)
            if (lastName.length() == 0)
            {
                  System.out.println("Your last name is required. ");
                  System.out.println("Program will end now and you will have to restart. Sorry. ");
                  System.exit(0);
            }
            
            //Display message for user
            System.out.println(" Ok, " + firstName + ", please select one of the entree choices below. ");
            System.out.println(""); // To make it easier for the user to read
            
            //Prompt user to enter the letter indication entree desired
            System.out.println("Which entree do you desire today? ");
            System.out.print("B = Beef ($" + dollar.format(BEEF_DISH) + "), F = Fish ($" + dollar.format(FISH_DISH) + "), or ");
            System.out.print("V = Vegetarian ($" + dollar.format(VEGETARIAN_DISH) + ") (enter B, F, or V) : ");
                    
            input = keyboard.nextLine();
            System.out.println("");
                       
            entreeDish = Character.toUpperCase (input.charAt(0)); // Convert to upper case
  
            // Set user's entree dish 
            
            switch (entreeDish)
            {
                  case 'B':
                        entree = "Beef";
                                            
                        // Get preparation method from customer
                        System.out.println("How do you want it prepared?: ");                       
                        System.out.print("R = Rare \n" +
                                                "M = Medium \n" +
                                                "W = Well done \n" +
                                                "Your Selection: ");
                        
                        input = keyboard.nextLine();
                        System.out.println("");                      
                        // Set desired Beef preparation method base on input from customer
                        // Convert to upper case
                         prepMethod = Character.toUpperCase (input.charAt(0));
                         
                        switch (prepMethod)
                        {
                              case 'R':                               
                                    prep = "Rare";
                                    break;                        
                               case 'M':                              
                                    prep = "Medium";
                                    break;
                               case 'W':                              
                                     prep = "Well done";
                                     break;
                               default:
                                      System.out.println("That was not one of the choices, you have to start the order over.");
                                      System.exit(0);
                          }
                        
                          break;
                        
                        case 'F':                       
                              entree = "Fish";
                              
                              // Get preparation method from customer
                              System.out.println("How do you want it prepared?: ");
                              System.out.print("B = Broiled \n" +
                                                      "F = Fried \n" +
                                                      "Your Selection: ");
                             
                                                      
                              input = keyboard.nextLine();
                              System.out.println("");
                              
                              // Set desired fish preparation method for customer
                              // Convert to upper case                           
                              prepMethod = Character.toUpperCase (input.charAt(0));
                              
                              switch (prepMethod)
                              {
                                    case 'B':                                    
                                          prep = "Broiled";
                                          break;
                                    case 'F':                                
                                          prep = "Fried";
                                          break;
                                    default:
                                      System.out.println("That was not one of the choices, you have to start the order over.");
                                      System.exit(0);
                               }
                              break;
                              
                        case 'V':                      
                  
                              break;
                                    
                        // Null handle is user presses enter without making a choice and if the user presses 
                       // other than the displayed choices      
                       default:                   
                            System.out.println("That is not a valid entry. Program will now close");
                            System.exit(0); 
                            
                            
                        input = keyboard.nextLine();  
                                                                                                                                               
             }// End switch for entreeDish
                   
             // Prompt the user to enter the amount that they wish to tip if any
             System.out.println("How much do you wish to tip Lunch Stop service personnel?");
             System.out.println("Type in the amount as ex. \"2.50\"(no dollar sign required), or press enter to withdraw from this option.");
             
             input = keyboard.nextLine();
             
             if (input.length() == 0)
            
                   tip = 0.0;
            
            
             else 
                  tip = Double.parseDouble(input);
              
            
                         System.out.println("");
                         
                         
             
             // Calculate Sales tax
             if (entreeDish == 'B')
                  salesTax = BEEF_DISH * SALES_TAX_RATE;
                  
             else if (entreeDish == 'F')
                  salesTax = FISH_DISH * SALES_TAX_RATE;
                  
             else if (entreeDish == 'V')
                  salesTax = VEGETARIAN_DISH * SALES_TAX_RATE;
                  
             // Calculate meal price
             if (entreeDish == 'B')
                  mealPrice = BEEF_DISH;
                  
             else if (entreeDish == 'F')
                  mealPrice = FISH_DISH;
               
             else if (entreeDish == 'V')
                  mealPrice = VEGETARIAN_DISH;
             
             // Calculate total with tax and tip
             // I tried converting tip back to double so that it could be added but that did not work
              if (entreeDish == 'B')            
                  total = (BEEF_DISH + (BEEF_DISH * SALES_TAX_RATE)) + tip; //or finalTip, error: String cannot be converted to double
                                                                                                       // I also tried inputting yTip but it still did not add to the final price
              else if (entreeDish == 'F')
                  total = (FISH_DISH + (FISH_DISH * SALES_TAX_RATE)) + tip;
                  
              else if (entreeDish == 'V')
                  total = (VEGETARIAN_DISH + (VEGETARIAN_DISH * SALES_TAX_RATE)) + tip;
              
              //FINALLY Display results 
              System.out.println("MEAL ORDER SUMMARY: " +
                                      "\n------------------------------" +
                                       "\nEmployee ID:  " + employeeID +
                                       "\nName:  " + firstName + " " + lastName +
                                       "\nEntree:  " + entree + " " + prep +
                                       "\nMeal Price:  $" + dollar.format(mealPrice) +
                                       "\nSales Tax:  $" + dollar.format(salesTax) +
                                       "\nTip Amount:  $" + dollar.format(tip) +
                                       "\nTotal Price:  $" + dollar.format(total));                                                       
                            
     }//end Main method
}//End class Ramos_1                            
                              
             
             
             
             
            
             

            
            
            
            
            
            
      
 
