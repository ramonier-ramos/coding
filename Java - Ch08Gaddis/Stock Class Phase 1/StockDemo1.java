//  This program demonstrates the Stock class's toString method.

public class StockDemo1
{
   public static void main(String[] args)
   {
      // Create a Stock object for the XYZ Company with a trading symbol of XYZ 
		// and a current price per share of $9.62
      Stock xyzCompany = new Stock ("XYZ", 9.62);
      
      // Display the object's values
      System.out.println(xyzCompany);
   }
}
