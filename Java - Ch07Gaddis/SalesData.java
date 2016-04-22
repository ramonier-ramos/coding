// This class keeps the sales figures for a number of days in an
// array and provides methods for getting the total and average 
// sales, and the highest and lowest amounts of sales.

public class SalesData
{
   private double[] sales;  // The sales data

   // The constructor copies the elements in an array
	// to the sales array.
   public SalesData(double[] s)
   {
      // Create an array as large as s
      sales = new double[s.length];
      
      // Copy the elements from s to sales
      for (int index = 0; index < s.length; index++)
         sales[index] = s[index];
   }

   // Method to return the total of the elements in the sales array.
   public double getTotal()
   {
      double total = 0.0;  // Accumulator

      // Accumulate the sum of the elements in the sales array
      for (int index = 0; index < sales.length; index++)
         total += sales[index];

      // Return the total
      return total;
   }

   // Method to return the average of the elements in the sales array.
   public double getAverage()
   {
      return getTotal() / sales.length;
   }

   // Method to return the highest value stored in the sales array.
   public double getHighest()
   {
      double highest = sales[0];

      for (int index = 1; index < sales.length; index++)
      {
         if (sales[index] > highest)
            highest = sales[index];
      }

      return highest;
   }

   // Method to return the lowest value stored in the sales array.
   public double getLowest()
   {
      double lowest = sales[0];

      for (int index = 1; index < sales.length; index++)
      {
         if (sales[index] < lowest)
            lowest = sales[index];
      }

      return lowest;
   }
}
