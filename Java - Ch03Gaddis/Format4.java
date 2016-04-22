// This program demonstrates the DecimalFormat class.

import java.text.DecimalFormat;

public class Format4
{
   public static void main(String[] args)
   {
      double number1 = 0.12;
      double number2 = 0.05;
      double number3 = 0.075;
             
      // Create a DecimalFormat object.
      DecimalFormat formatter = new DecimalFormat("#0.0%");

      // Display the formatted variable contents.
      System.out.println(formatter.format(number1));
      System.out.println(formatter.format(number2));
      System.out.println(formatter.format(number3));
   }
}
