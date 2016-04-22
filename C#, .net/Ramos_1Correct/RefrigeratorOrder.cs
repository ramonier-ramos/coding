using System;

public class RefrigeratorOrder
{
   // Declare class-level variables (used in multiple methods)
   static string name;               // User's first and last name
   static string street;             // User's street address
   static string city;               // User's city
   static string state;              // User's state
   static string zip;                // User's ZIP code
   static string input;              // Other user input

. . .  Etc. (other class-level variable declarations)
   
   // Method to begin program execution
   public static void Main(string[] args)
   {
      // Call method to display program instructions
      DisplayInstructions();

      // Call methhod to get customer information
      GetCustomerInformation();

      // Call method to get refrigerator brand and size preference
      GetRefrigeratorPreference();

      // Call method to get refrigerator color preference
      GetColorPreference();

      // Call method to calculate order total
      CalculateTotal();

      // Call method to display order summary
      DisplaySummary();

   } // End method Main

   // Method to display initial program instructions
   public static void DisplayInstructions()
   {
      Console.WriteLine("Welcome to the Rapid Refrigerators Order Program");
      Console.WriteLine("------------------------------------------------");
      Console.WriteLine("This program allows you record a refrigerator   ");
      Console.WriteLine("order for a customer. First, you will record the");

. . .  Etc. (other program instructions)

   } // End method DisplayInstructions

   // Method to get customer information
   public static void GetCustomerInformation()
   {
      // Get inputs for customer information
      Console.WriteLine("\nCUSTOMER INFORMATION FOR ORDER:\n");

      Console.Write("Enter customer first and last names: ");
      name = Console.ReadLine();
      Console.Write("Enter customer street address: ");
      street = Console.ReadLine();

. . .  Etc. (other customer information prompts)

   } // End method GetCustomerInformation

   // Method to get customer preference for refrigerator brand and size
   public static void GetRefrigeratorPreference()
   {
      // Declare local constants
      const decimal F_18_PRICE = 549.95M; // Frigidaire 18 cubic ft. price
      const decimal F_20_PRICE = 629.95M; // Frigidaire 20 cubic ft. price
      const decimal F_22_PRICE = 739.95M; // Frigidaire 22 cubic ft. price
      const decimal W_19_PRICE = 599.95M; // Whirlpool 19 cubic ft. price price
      const decimal W_21_PRICE = 759.95M; // Whirlpool 21 cubic ft. price price

      // Declare local variables
      char refrigeratorBrandCode;         // Code for refrigerator brand
      char refrigeratorSizeCode;          // Code for refrigerator size

      // Get refrigerator brand
      Console.WriteLine("\nEnter the letter for the brand of refrigerator desired:");
      Console.Write("F = Frigidaire \n" +
                    "W = Whirlpool \n" +
                    "Your selection: ");
      input = Console.ReadLine();

      // Handle null input
      while (input.Length == 0)
      {
         Console.WriteLine("\nNo specification of refrigerator brand was made.");
         Console.WriteLine("\nEnter the letter for the brand of refrigerator desired:");
         Console.Write("F = Frigidaire \n" +
                       "W = Whirlpool \n" +
                       "Your selection: ");
         input = Console.ReadLine();
      } // End while

      // Convert input to uppercase, to ease comparisons in code blocks below
      input = input.ToUpper();
      // Read first character in input, to handle case where user enters full text
      refrigeratorBrandCode = input[0];

      // Handle invalid input (if user enters in something other than one of the valid choices)
      while (!(refrigeratorBrandCode == 'F' || refrigeratorBrandCode == 'W'))
      {
         Console.WriteLine("\nAn invalid specification of refrigerator brand was made.");
         Console.WriteLine("\nEnter the letter for the brand of refrigerator desired:");
         Console.Write("F = Frigidaire \n" +
                       "W = Whirlpool \n" +
                       "Your selection: ");
         input = Console.ReadLine();

         if (input.Length != 0) // Verify non-null input (or input[0] below will cause error)
         {
            // Convert input to uppercase, to ease comparisons in switch block below
            input = input.ToUpper();
            // Read first character in input, to handle case where user enters full text
            refrigeratorBrandCode = input[0];
         } // End if
      } // End while
      
      // Set the refrigerator brand, based on the codes input by the user
      // (Offer appropriate size choices, based on user's selection of brand)
      switch(refrigeratorBrandCode)  // Set refrigerator brand based on input
      {
         case 'F':
            refrigeratorBrand = "Frigidaire";
            // Get refrigerator size
            Console.WriteLine("\nEnter the letter for the size of refrigerator desired:");
            Console.Write("S = 18 Cubic Ft. ($" + F_18_PRICE + ") \n" +
                          "M = 20 Cubic Ft. ($" + F_20_PRICE + ") \n" +
                          "L = 22 Cubic Ft. ($" + F_22_PRICE + ") \n" +
                          "Your selection: ");
            input = Console.ReadLine();
         
            // Handle null input
            while (input.Length == 0)
            {
               Console.WriteLine("\nNo specification of refrigerator size was made.");
               Console.WriteLine("\nEnter the letter for the size of refrigerator desired:");
               Console.Write("S = 18 Cubic Ft. ($" + F_18_PRICE + ") \n" +
                             "M = 20 Cubic Ft. ($" + F_20_PRICE + ") \n" +
                             "L = 22 Cubic Ft. ($" + F_22_PRICE + ") \n" +
                             "Your selection: ");
               input = Console.ReadLine();
            } // End while
 
            // Convert input to uppercase, to ease comparisons in code blocks below
            input = input.ToUpper();
            // Read first character in input, to handle case where user enters full text
            refrigeratorSizeCode = input[0];

            // Handle invalid input (if user enters in something other than one of the valid choices)
            while (!(refrigeratorSizeCode == 'S' || refrigeratorSizeCode == 'M' || 
                     refrigeratorSizeCode == 'L'))
            {
               Console.WriteLine("\nAn invalid specification of refrigerator size was made.");
               Console.WriteLine("\nEnter the letter for the size of refrigerator desired:");
               Console.Write("S = 18 Cubic Ft. ($" + F_18_PRICE + ") \n" +
                             "M = 20 Cubic Ft. ($" + F_20_PRICE + ") \n" +
                             "L = 22 Cubic Ft. ($" + F_22_PRICE + ") \n" +
                             "Your selection: ");
               input = Console.ReadLine();

               if (input.Length != 0) // Verify non-null input (or input[0] below will cause error)
               {
                  // Convert input to uppercase, to ease comparisons in switch block below
                  input = input.ToUpper();
                  // Read first character in input, to handle case where user enters full text
                  refrigeratorSizeCode = input[0];
               } // End if
            } // End while

            // Set refrigerator size and price based on input
            switch(refrigeratorSizeCode)
            {
               case 'S':
                  refrigeratorSize = "18 Cubic Ft.";
                  refrigeratorPrice = F_18_PRICE;
                  break;
               case 'M':
                  refrigeratorSize = "20 Cubic Ft.";
                  refrigeratorPrice = F_20_PRICE;
                  break;
               case 'L':
                  refrigeratorSize = "22 Cubic Ft.";
                  refrigeratorPrice = F_22_PRICE;
                  break;
            } // End switch
            break;

. . .  Etc. (similar code for handling case 'W')

      } // End switch
   } // End method GetRefrigeratorPreference

   // Method to get customer preference for refrigerator color
   public static void GetColorPreference()
   {
      // Declare local variable
      char refrigeratorColorCode; // Code for refrigerator color

      // Get refrigerator color
      Console.WriteLine("\nEnter the letter for the color of refrigerator desired:");
      Console.Write("A = Almond \n" +
                    "B = Black \n" +
                    "S = Silver \n" +
                    "W = White \n" +
                    "Your selection: ");
      input = Console.ReadLine();

. . .  Etc. (similar code here as was used for handling the brand and size selections above)

   } // End method GetColorPreference

   // Method to calculate order tax and total
   public static void CalculateTotal()
   {
      // Declare local constant
      const decimal TAX_RATE = 0.07M; // Sales tax rate
      
      // Calculate sales tax
      taxAmount = refrigeratorPrice * TAX_RATE;

      // Calculate total price
      orderPrice = refrigeratorPrice + taxAmount;  
   } // End method CalculateTotal

   // Method to display summary of all refrigerator order details
   public static void DisplaySummary()
   {
      Console.WriteLine("\nORDER SUMMARY:\n");

      Console.WriteLine("{0}\n{1}\n{2}, {3} {4}", name, street, city, state, zip);
      Console.WriteLine("{0} {1} {2}", refrigeratorBrand, refrigeratorSize, refrigeratorColor);
      Console.WriteLine("{0} {1:C}\n{2} {3:C}\n{4} {5:C}\n", 
                        "Refrigerator Price:", refrigeratorPrice,
                        "Sales Tax:", taxAmount,
                        "Total Price:", orderPrice);
   } // End method DisplaySummary
} // End class RefrigeratorOrder

