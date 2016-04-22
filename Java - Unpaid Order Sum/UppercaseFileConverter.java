// Chapter 4 Programming Challenge 15: Uppercase File Converter

import java.util.Scanner; // Required for Scanner class
import java.io.*;         // Required for File and PrintWriter classes

public class UppercaseFileConverter
{
   public static void main(String[] args) throws IOException
   {
      String inputFile;  // Name of the input file
      String outputFile; // Name of the output file
      String input;      // To hold file input
      String output;     // To hold file output

      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
             
      // Get the input file name
      System.out.print("Enter the input file name: ");
      inputFile = keyboard.nextLine();

      // Get the output file name
      System.out.print("Enter the output file name: ");
      outputFile = keyboard.nextLine();
      
      // Open the input file
      File file = new File(inputFile);
      Scanner inFile = new Scanner(file);
            
      // Open the output file
      PrintWriter outFile = new PrintWriter(outputFile);

      // Process the files
      while (inFile.hasNext()) // Process input file until no more lines exist
      {
         input = inFile.nextLine();    // Read next line of input file
         output = input.toUpperCase(); // Convert text to upper case
         outFile.println(output);      // Write converted text to output file
      }
      
      // Confirmation message (OPTIONAL)
      System.out.println("*** Successful conversion. ***");
      
      // Close the files
      inFile.close();
      outFile.close();
   }
}