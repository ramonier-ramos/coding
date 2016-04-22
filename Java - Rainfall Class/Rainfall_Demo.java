// Ch.7 problem 1 demo
// Wriite a RainfallDemo. Class that stores the total rainfall for each of the
// 12 months into an array of double s

public class Rainfall_Demo
{
   public static void main(String[] args)
   {
      // Create an array of rainfall figures
      double[] thisYear = {1.6, 2.1, 1.7, 3.5, 2.6, 3.7,
                                   3.9, 2.6, 2.9, 4.3, 2.4, 3.7};
      
      int high; // the high month
      int low; // the low month
      
      // Create a RainFall object to hold the figures
      RainFall rainFall = new RainFall(thisYear)
      
      // Display the statistics
      
      