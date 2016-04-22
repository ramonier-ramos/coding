// This program gathers sales amounts for the week.
// It uses the SalesData class to display the total,
// average, highest, and lowest sales amounts.

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Sales
{
   public static void main(String[] args)
   {
      final int ONE_WEEK = 7;  // Number of elements

      // Create an array to hold sales amounts for a week
      double[] sales = new double[ONE_WEEK];

      // Get the week's sales figures
      getValues(sales);

      // Create a SalesData object, initialized
      // with the week's sales figures
      SalesData week = new SalesData(sales);

      // Create a DecimalFormat object
      DecimalFormat dollar = new DecimalFormat("#,##0.00");

      // Display the total, average, highest, and lowest
      // sales amounts for the week
      JOptionPane.showMessageDialog(null, "The total sales were $" +
                                    dollar.format(week.getTotal()) +
                                    "\nThe average sales were $" +
                                    dollar.format(week.getAverage()) +
                                    "\nThe highest sales were $" +
                                    dollar.format(week.getHighest()) +
                                    "\nThe lowest sales were $" +
                                    dollar.format(week.getLowest()));

      System.exit(0);
   }

   // Method to ask the user to enter sales
   // amounts for each element of an array.
   private static void getValues(double[] array)
   {
      String input;  // To hold user input

      // Get sales for each day of the week
      for (int i = 0; i < array.length; i++)
      {
         input = JOptionPane.showInputDialog("Enter " +
                             "the sales for day " + (i + 1) + ".");
         array[i] = Double.parseDouble(input);
      }
   }
}
