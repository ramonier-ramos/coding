// This program displays the coffee descriptions and their prices.

import java.sql.*;  // Needed for JDBC classes

public class ShowDescriptionsAndPrices
{
   public static void main(String[] args)
   {
      // Create a named constant for the URL (specific for Java DB)
      final String DB_URL = "jdbc:derby:CoffeeDB";
      
      try
      {
         // Create a connection to the database
         Connection conn = DriverManager.getConnection(DB_URL);
         
         // Create a Statement object
         Statement stmt = conn.createStatement();
         
         // Create a string with a SELECT statement
         String sqlStatement = "SELECT Description, Price FROM Coffee";
         
         // Send the statement to the DBMS
         ResultSet result = stmt.executeQuery(sqlStatement);
         
         // Display the contents of the result set (which will have two columns)
         while (result.next())
         {
    			// Display a row from the result set, formatted using the printf method
				// (Note: We did NOT cover the printf method; see pp. 162-173 if you are interested) 
				System.out.printf("%25s %.2f\n", result.getString("Description"), result.getDouble("Price"));
         }
         
         // Close the connection
         conn.close();
      }
      catch(Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   }
}