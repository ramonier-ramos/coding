// Chapter 8, Programming Challenge 4: LandTract class

public class LandTract
{
   private double length; // Length of the tract
   private double width;  // Width of the tract
   
   // Constructor.
   public LandTract(double len, double w)
   {
      length = len;
      width = w;
   }

   // The getArea method returns the area of the tract.
   public double getArea()
   {
      return length * width;
   }
   
   // The equals method compares two LandTract objects.
   // NOTE: This method was written with the intent to compare 
   // the lengths and widths of two tracts.  An alternative could
   // be to write an equals method that compares the areas instead.
   public boolean equals(LandTract tract2)
   {
      boolean status; // Flag for comparison status
      
      // If the 2nd tract's length and width are the same as this tract's
      // length and width, then the two objects are considered to be equal
      if (tract2.length == this.length && tract2.width == this.width)
            status = true;
      else // Otherwise, not equal
            status = false;
      
      // Return the comparison status
      return status;
   }
   
   // The toString method returns a string describing the tract.
   public String toString()
   {
      String str = "Length = " + length +
                   "\nWidth = " + width +
                   "\nArea = " + getArea();
      return str;
   }
}