// Chapter 16 Programming Challenge 3: Unpaid Order Sum

import java.sql.*;               // Needed for JDBC classes
import java.text.DecimalFormat;  // Needed for currency formatting

 public class UnpaidOrderSum
 {
   public static void main(String[] args)
   {
      // Create a named constant for the URL (specific for Java DB)
      final String DB_URL = "jdbc:derby:CoffeeDB";

      // Create a DecimalFormat object for the dollar amount
      DecimalFormat dollar = new DecimalFormat("#,##0.00");

      try
      {
         // Create a connection to the database
         Connection conn = DriverManager.getConnection(DB_URL);

         // Create a Statement object
         Statement stmt = conn.createStatement();

         // Create the query
         String query = "SELECT SUM(Cost) FROM UnpaidOrder";

         // Send the query to the DBMS and store the result
         ResultSet result = stmt.executeQuery(query);

         // Move to the first (only) row in the result set
         result.next();

         // Get the sum of unpaid orders
         double unpaid = result.getDouble(1);

         // Close the statement and the connection
         stmt.close();
         conn.close();

         // Display the sum of unpaid orders (e.g., $392.45)
         System.out.println("Total amount owed in unpaid orders: $" + dollar.format(unpaid));
      }
      catch(Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   }
 }