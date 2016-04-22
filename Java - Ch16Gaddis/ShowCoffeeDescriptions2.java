// This program demonstrates how to issue an SQL SELECT statement to a database using JDBC.

import java.sql.*;  // Needed for JDBC classes

public class ShowCoffeeDescriptions2
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
         String sqlStatement = "SELECT * FROM Coffee WHERE Description = 'French Roast Dark'";
         
         // Send the statement to the DBMS
         ResultSet result = stmt.executeQuery(sqlStatement);
         
         // Display a header for the listing
         System.out.println("Coffees Found in the Database");
         System.out.println("-----------------------------");
         
         // Display the contents of the result set (which will have one column)
         while (result.next())
         {
            System.out.println(result.getString("Description"));
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