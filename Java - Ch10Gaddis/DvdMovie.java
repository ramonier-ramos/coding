// DvdMovie class.

public class DvdMovie implements RetailItem
{
   private String title;        // The DVD's title
   private int runningTime;     // Running time in minutes
   private double retailPrice;  // The DVD's retail price
   
   // Constructor.
   public DvdMovie(String dvdTitle, int runTime, double dvdPrice)
   {
      title = dvdTitle;
      runningTime = runTime;
      retailPrice = dvdPrice;
   }
   
   // This method returns the DVD's title.
   public String getTitle()
   {
      return title;
   }
   
   // This method returns the running time in minutes.
   public int getRunningTime()
   {
      return runningTime;
   }

   // This method (required by the RetailItem interface) returns the retail price of the DVD.
   public double getRetailPrice()
   {
      return retailPrice;
   }
}
