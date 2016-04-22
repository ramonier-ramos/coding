// Chapter 7, Programming Challenge 1: RainfallDemo class

public class RainfallDemo
{
   public static void main(String[] args)
   {
      // Create an array of rainfall figures
      double[] thisYear = {1.6, 2.1, 1.7, 3.5, 2.6, 3.7,
                           3.9, 2.6, 2.9, 4.3, 2.4, 3.7 };

      int high; // The high month
      int low;  // The low month
      
      // Create a RainFall object initialized with figures stored in thisYear array
      Rainfall r = new Rainfall(thisYear);
      
      // Display the statistics
      System.out.println("The total rainfall for this year is " + 
                         r.getTotalRainFall() + " inches.");

      System.out.println("The average rainfall for this year is " + 
                         r.getAverageRainFall() + " inches per month.");
      // NOTE: Consider using DecimalFormat format to set number of decimal places.

      high = r.getHighestMonth();
      System.out.println("The month with the highest amount of rain is month " +
                         (high + 1) + " with " + r.getRainAt(high) + " inches.");

      low = r.getLowestMonth();
      System.out.println("The month with the lowest amount of rain is month " +
                         (low + 1) + " with " + r.getRainAt(low) + " inches.");
   }
}