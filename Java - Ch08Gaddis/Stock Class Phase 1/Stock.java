// The Stock class holds data about a stock.

public class Stock
{
   private String symbol;      // Trading symbol of stock
   private double sharePrice;  // Current price per share

   // Constructor
   public Stock(String sym, double price)
   {
      symbol = sym;
      sharePrice = price;
   }
   
   // This method returns the stock's trading symbol.
   public String getSymbol()
   {
      return symbol;
   }
   
   // This method returns the stock's share price.
   public double getSharePrice()
   {
      return sharePrice;
   }

   // This method returns a string indicating the object's trading symbol and share price.
   public String toString()
   {
      // Create a string describing the stock
      String str = "Trading symbol: " + symbol + "\nShare price: " + sharePrice;
      
      // Return the string
      return str;
   }
}
