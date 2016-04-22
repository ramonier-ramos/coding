// This program demonstrates that an interface type may be used 
// to create a polymorphic reference.

import java.text.DecimalFormat;

public class PolymorphicInterfaceDemo
{
   public static void main(String[] args)
   {
      // Create a CompactDisc object
      CompactDisc cd = new CompactDisc("Greatest Hits", "Joe Looney Band", 18.95);

      // Create a DvdMovie object
      DvdMovie movie = new DvdMovie("Wheels of Fury", 137, 12.95);

      // Display the CD's title
      System.out.println("Item #1: " + cd.getTitle());
                         
      // Display the CD's price
      showPrice(cd);
      
      // Display the DVD's title
      System.out.println("Item #2: " +  movie.getTitle());
                         
      // Display the DVD's price
      showPrice(movie);
   }

   // This method displays the price of a RetailItem object.
   private static void showPrice(RetailItem item)
   {
      DecimalFormat dollar = new DecimalFormat("#,##.00");
    
      System.out.println("Price: $" + dollar.format(item.getRetailPrice()));
   }
}
