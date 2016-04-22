// The DateComponent class extracts the month, 
// day, and year from a string containing a date.

import java.util.StringTokenizer;

public class DateComponent
{
   private String month;  // To hold the month
   private String day;    // To hold the day
   private String year;   // To hold the year

   // The constructor accepts a String containing a date in the form MONTH/DAY/YEAR. 
	// It extracts the month, day, and year from the string.
   public DateComponent(String dateStr)
   {
      // Ensure that dateStr is not null
      if (dateStr == null)
      {
         throw new IllegalArgumentException("null reference passed to " +
                                            "DateComponent constructor");
      }
      
      // Create a StringTokenizer object
      StringTokenizer strTokenizer = new StringTokenizer(dateStr, "/");

      // Extract the tokens
      month = strTokenizer.nextToken();
      day = strTokenizer.nextToken();
      year = strTokenizer.nextToken();      
   }

   // This method returns the month field.
   public String getMonth()
   {
      return month;
   }

   // This method returns the day field.
   public String getDay()
   {
      return day;
   }

   // This method returns the year field.
   public String getYear()
   {
      return year;
   }
}
