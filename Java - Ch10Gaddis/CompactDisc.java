// Compact Disc class.

public class CompactDisc implements RetailItem
{
   private String title;        // The CD's title
   private String artist;       // The CD's artist
   private double retailPrice;  // The CD's retail price
   
   // Constructor.
   public CompactDisc(String cdTitle, String cdArtist, double cdPrice)
   {
      title = cdTitle;
      artist = cdArtist;
      retailPrice = cdPrice;
   }
   
   // This method returns the CD's title.
   public String getTitle()
   {
      return title;
   }
   
   // This method returns the name of the artist.
   public String getArtist()
   {
      return artist;
   }

   // This method (required by the RetailItem interface) returns the retail price of the CD.
   public double getRetailPrice()
   {
      return retailPrice;
   }
}
