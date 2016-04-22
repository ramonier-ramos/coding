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

   // This method compares two Stock objects.
   public boolean equals(Stock object2)
   {
      boolean status;
      
      // Determine whether this object's symbol and sharePrice fields are 
		// equal to object2's symbol and sharePrice fields.
      if (symbol.equals(object2.symbol) && sharePrice == object2.sharePrice)
         status = true;   // Yes, the objects are equal
      else
         status = false;  // No, the objects are not equal
      
      // Return the value in status
      return status;
   }

   // This method makes a copy of a Stock object.
   public Stock copy()
   {
      // Create a new Stock object and initialize it
      // with the same data held by the calling object
      Stock copyObject = new Stock(symbol, sharePrice);
      
      // Return a reference to the new object
      return copyObject;
   }
}
