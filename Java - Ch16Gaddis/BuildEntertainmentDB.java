// This program shows how to create a new database using Java DB.
 
import java.sql.*;  // Needed for JDBC classes

public class BuildEntertainmentDB
{
   public static void main(String[] args) throws Exception
   {
      // Create a named constant for the URL (specific for Java DB)
		final String DB_URL = "jdbc:derby:EntertainmentDB;create=true";
            
      try
      {    
         // Create a connection to the database
         Connection conn = DriverManager.getConnection(DB_URL);
            
         // Create a Statement object
         Statement stmt = conn.createStatement();
            
         // Create the Dvd table
			stmt.execute("CREATE TABLE Dvd " +
                      "(Title CHAR(25), " +
                      " Minutes INTEGER, " +
                      " Price DOUBLE)");
 
         System.out.println("Dvd table created.");
			     
         // Close the resources
         stmt.close();     
         conn.close();
         System.out.println("Done.");
      }
      catch(Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   } 
}