// Programmer: Ramonier Ramos
// Filename: RefrigeratorOrder.cs
// Due Date: 02/13/15
// Description: Individual Assignment #1 - RefrigeratorOrder class file.
//              Accepts and processes a customer refrigerator order.
using System;

public class RefrigeratorOrder
{
    // Main method begins program execution
    public static void Main(string[] args)
    {
        // Declare constants
        //const double SALES_TAX_RATE = 0.07; // Sales tax rate for Rapid Refrigerators
        const string FRIGIDAIRE_SMALL = "18 Cubic Ft. ";
        const string FRIGIDAIRE_MEDIUM = "20 Cubic Ft. ";
        const string FRIGIDAIRE_LARGE = "22 Cubic Ft. ";
        const string WHIRLPOOL_SMALL = "19 Cubic Ft. ";
        const string WHIRLPOOL_MEDIUM = "21 Cubic Ft. ";
        const decimal FRIG_SMALL = 549.95M;
        const decimal FRIG_MEDIUM = 629.95M;
        const decimal FRIG_LARGE = 739.95M;
        const decimal WHIRL_SMALL = 599.95M;
        const decimal WHIRL_MEDIUM = 759.95M;


        // Get program instructions and welcome message
        DisplayInstructions();

        // Get the customer's name
        CustomerName();

        // Get the customer's address
        CustomerAddress();

        // Get the customer's city of residence
        CustomerCity();

        // Get the customer's state of residence
        CustomerState();

        // Get the customer's zip code
        CustomerZip();

        // Get the customer's choice of manufacturer
        CustomerBrand();

        

    }

    // Display program instructions method
    public static void DisplayInstructions()
    {
        Console.WriteLine("Welcome to the Rapid Refrigerators information system!");
        Console.WriteLine("You will enter the customer's name, address and ");
        Console.WriteLine("the type of refrigerator the customer wishes to receive. ");

    }

    // Prompt the user to get the customer's name (first and last)
    public static void CustomerName()
        
    {
        Console.WriteLine("Enter the customer's first and last name: ");
        string customerName = Console.ReadLine(); 
    }

    // Prompt the user to get the customer's address(only the street)
    public static void CustomerAddress()
    {
        Console.WriteLine("Enter the customer's street address: ");
        String customerAddress = Console.ReadLine();
    }

    // Prompt the user to get the customer's city of residence
    public static void CustomerCity()
    {
        Console.WriteLine("Enter the customer's city of residence: ");
        string customerCity = Console.ReadLine();
    }

    // Prompt the user to get the customer's state of residence
    // using a two letter abbreviation
    public static void CustomerState()
    {
        Console.WriteLine("Enter the customer's state of residence, \nplease use the two-letter state abbreviation. ");
        string customerAddress = Console.ReadLine();
    }

    // Prompt the user to get the customer's 5 digit zip code
    public static void CustomerZip()
    {
        Console.WriteLine("Enter the customer's zip code, \nplease use the five-digit code. ");
        string customerZip = Console.ReadLine();
    }

    // Prompt the user to get the customer's choice of refrigerator
    // brand and size. 
    public static void CustomerBrand()
    {
        Console.WriteLine("Type a letter of the manufacturer of the refrigerator chosen ");
        Console.WriteLine("\nby the customer. F = Frigidaire or W = Whirlpool. ");
        string customerBrand = Console.ReadLine();

        while (customerBrand.Length == 0) // Handles null input for customer brand
        {
            Console.WriteLine("No specification for manufacturer was made.");
            Console.WriteLine("\nEnter the letter for the customer's brand request:");
            Console.WriteLine("\nF = Frigidaire or W = Whirlpool");
            customerBrand = Console.ReadLine(); // Read employee input
        } // End while

        customerBrand = customerBrand.ToUpper(); // Converts the user input to uppercase

        // Declare local variable
        char cBrand;
        cBrand = customerBrand[0];

        while (!(cBrand == 'F' || cBrand == 'W')) // Handles invalid input 
        {
            Console.WriteLine("An invalid specification for manufacturer was made.");
            Console.WriteLine("\nEnter the letter for your customer's brand choice:");
            Console.WriteLine("\nF = Frigidaire or W = Whirlpool ");

            customerBrand = Console.ReadLine(); // Read employee input

            if (customerBrand.Length != 0) // Verify non-null input (or input[0] below will cause error)
            {
                // Convert frigBrand to uppercase
                customerBrand = customerBrand.ToUpper();

                // Read first character in input, to handle case where user enters full text
                cBrand = customerBrand[0];

            } // End customerBrand if block
        }// End customerBrand while block

        // Prompt the user to type a character indicating the size of the refrigerator.
        Console.Write("Enter a character for the customer's refrigerator size request. ");
        Console.WriteLine("\nPlease enter S = Small, M = Medium, or L = Large. ");
        string customerSize = Console.ReadLine();
        //Convert.ToChar(customerSize); // To convert the user input to char character

        while (customerSize.Length == 0) // Handles null input from user
        {
            Console.WriteLine("No specification for refrigerator size was made.");
            Console.WriteLine("\nEnter the letter for the customer's refrigerator size request:");
            Console.WriteLine("\nS = Small, M = Medium, or L = Large");
            customerBrand = Console.ReadLine(); // Read employee input
        }// End while customerSize

        customerSize = customerSize.ToUpper(); // Convert to upper case
        char cSize = customerSize[0];

        while (!(cSize == 'F' || cSize == 'W')) // Handles invalid input from user
        {
            Console.WriteLine("An invalid specification for refrigerator size was made.");
            Console.WriteLine("\nEnter the letter for your customer's refriferator size request:");
            Console.WriteLine("\nS = Small, M = Medium, or L = Large. ");

            customerSize = Console.ReadLine(); // Read employee input

            if (customerSize.Length != 0) // Verify non-null input (or input[0] below will cause error)
            {
                // Convert frigBrand to uppercase
                customerSize = customerSize.ToUpper();

                // Read first character in input, to handle case where user enters full text
                cSize = customerSize[0];

            } // End customerSize if block
        }// End customerSize while block

        switch(cBrand)
        {
            case 'F':
                customerBrand = "Frigidaire";

                switch(cSize)
                {
                    case 'S':
                        customerSize = FRIGIDAIRE_SMALL;
                        break;
                    case 'M':
                        customerSize = FRIGIDAIRE_MEDIUM;
                        break;
                    case 'L':
                        customerSize = FRIGIDAIRE_MEDIUM;
                        break;
                }// End switch for customer Size
                break;
            case 'W':

        

            

    }







}    
    

 