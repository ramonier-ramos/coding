//Ch.5 Programming Practice #1
//Filename: GasMileage.cs
//Description: To track the gas mileage of a users care
using System;

public class GasMileage

{
        //Main method begins C# app
    public static void Main(string[] args)
    {
        //Declare variables
        int miles;
        double gallons;
        double milespergallons;
        int totalMiles = 0;
        double totalGallons = 0;
        double avgMilesPerGallons;

        //Prompt user to input miles and obtain data from user
        Console.WriteLine("Please enter the miles driven for first tankful of gas (-1 to quit): ");
        miles = Convert.ToInt32(Console.ReadLine());

        //Exit if user inputs -1
        while (miles != -1)
        {
            //Prompt user to input gallons and obtain input for user
            Console.WriteLine("Please enter gallons used for distance traveled");
            gallons = Convert.ToDouble(Console.ReadLine());

            //Add gallons to miles for this tank to totals
            totalMiles += miles;
            totalGallons += gallons;

            //Calculate miles per gallon for the current tank
            if (gallons != 0)
            {
                //Casting is not necessary below because gallons is double type
                milespergallons = miles / gallons;

                Console.WriteLine("MPG for this tankful: {0:F}", milespergallons);
            }//end if

            //Calculate miles per gallons for entire trip
            if (totalGallons != 0)
            {
                //Casting is not necessary because total Gallons is double type
                avgMilesPerGallons = totalMiles / totalGallons;

                Console.WriteLine("Average MPG for entire trip: {0:F}", avgMilesPerGallons);

            }//end if

            //Prompt user for mileage for next tankgul and obtain input from user
            Console.WriteLine("Please enter miles travelled on next tankful of gas (-1 to quit): ");
            miles = Convert.ToInt32(Console.ReadLine ());
        }//end while
     
    }//end main
}//end class GasMileage

