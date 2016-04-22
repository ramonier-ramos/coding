// Programmer: Ramonier Ramos
// Filename: TestProcessor.java
// Due Date: 02/20/2015
// Description: Individual Assignment #2 - TestProcessor class file.
import javax.swing.JOptionPane; // Required for message dialog and input dialog boxes
import java.io.*;     // For file I/O classes
import java.util.Scanner; // For Scanner objects
import java.text.DecimalFormat; //needed to format scores 

public class TestProcessor
{
   // Main method begins program execution
   public static void main(String[] args) throws IOException // Throws clause here
   {
      // Declare constants and variables
      final String INPUT_FILE = "EmployeeList.txt"; // Input file to read from
      final String OUTPUT_FILE = "TestScores.txt"; // Output file to receive data 
      String socialSec;              // The social security number for the employee
      String firstName;                // The first name of the employee
      String lastName;                // The last name of the employee
      String phoneNumber;             // The phone number of the employee
      String emailAddress;             // The email address of the employee
      String date;                        // Date of test
      String input;                        // Input from user
      int numberOfQuestions = 0;    // The number of questions on the test
      int numberOfMissed = 0;           // Number of missed questions on the test
      double averageScore = 0.0;         // Initialize the average score of all the employees
      double totalScore = 0.0;                 // Accumulator for employee test scores
      int counter = 0;                        // Counter for the input file
      int counterFail = 0;                   // Counter for failed grades
      int counterPassPlus = 0;               // Counter for Pass plus grades
      int counterPass = 0;                   // Counter for pass grades
      int passPlusGrades = 0;                // The final count for Pass plus grades
      int passGrades = 0;                    // The final count for pass grades
      int failGrades = 0;                    // The final count for fail grades
            
      
      // To make sure the file exists in the folder      
      File file = new File(INPUT_FILE);
            
      if (!(file.exists()))
      {
         System.out.println("The " + INPUT_FILE + " file cannot be found. \n" +
                                           "Program terminated. ");
         System.exit(0);
      } // End if statement
            
      // Create a Scanner object to enable reading data  input file
      Scanner inputFile = new Scanner(file);
  
      // Create a DecimalFormat object to enable formatting
      DecimalFormat formatter = new DecimalFormat("##0.00");
            
      // Create FileWriter and PrintWriter objects to enable
      // writing (appending not overwriting) data to text file
      FileWriter fwriter = new FileWriter(OUTPUT_FILE, true);
      PrintWriter outputFile = new PrintWriter(fwriter);
           
      // Prompt the user to enter the date of the test
      date = JOptionPane.showInputDialog("Enter the date of the test: ");
            
      // Handle null input for date of test
      while (date.length() == 0)
      {
         date = JOptionPane.showInputDialog("Please enter a date of the test. ");
                  
      }// End while
            
      // Prompt the user to enter the number of questions on the test
      input = JOptionPane.showInputDialog("Enter the number of questions on the test:");
      numberOfQuestions = Integer.parseInt(input); // Convert input to integer
                        
      // Handle null input and make sure the number entered is not less than one
      // I do not know why the null handle is not working *******
      // Program crashes when user presses enter without inputting anything*****
      // I have not tried everything but I have tried everything I know to get around this
      while (input.length() == 0)
      {
         input = JOptionPane.showInputDialog("Please enter the number of questions on the test.");
         numberOfQuestions = Integer.parseInt(input); // Converts input to integer
      } // End while
      
      while (input.length() < 1)
      {
         input = JOptionPane.showInputDialog("Please enter a number greater than 0. ");
         numberOfQuestions = Integer.parseInt(input);
      }
            
      // Read information on all employees from text file, 
      // and call TestGrader class to calculate score and determine grade
      
       outputFile.println("TEST DATE: " + date); // This format looks the same as the output on the assignment but i am on a macbook
       outputFile.println("NUMBER OF QUESTIONS: " + numberOfQuestions);
       outputFile.println();  // Blank line
       outputFile.println();  // Blank line

      while (inputFile.hasNext()) // loop until all employees have been read
      {
         // Read the data for employee
         socialSec = inputFile.nextLine();
         
         // Read the data for the first name of the employee
         firstName = inputFile.nextLine();
         
         // Read the data for the last name of the employee
         lastName = inputFile.nextLine();
         
         // Read the data for the phone number of the employee
         phoneNumber = inputFile.nextLine();
         
         // Read the data for the email address for the employee
         emailAddress = inputFile.nextLine();
         
         // Read the blank line
         inputFile.nextLine();
 
         input = JOptionPane.showInputDialog("Employee SSN: " + socialSec + "\n" +
                                                           "Employee Name: " + firstName + " " + lastName +
                                                           "\n" + "Enter the number of test questions missed:");
                  
         numberOfMissed = Integer.parseInt(input); //Convert input to integer
                  
         // Handle null input and make sure the number missed is between 0 and the
         // number of questions on the test                                             
         while (input.length() == 0) // ****Again the null handle does not work and I don't know why
         {
            input = JOptionPane.showInputDialog("Please enter the number of test questions missed.");
            numberOfMissed = Integer.parseInt(input); // Convert input to integer
                      
            if (input.length() < 0 || input.length() > numberOfQuestions)
            {
               input = JOptionPane.showInputDialog("The number of test questions missed has to be between " + 
                                                                 "\n 0 and the number of questions on the test. ");
               numberOfMissed = Integer.parseInt(input); // Convert input to integer
               
             } // End if 
                           
          } // End while
                             
         // Call TestGrader class constructor to create new TestGrader objects
         TestGrader testgrader = new TestGrader(numberOfQuestions, numberOfMissed);
 
         // Call the TestGrader class methods to get score and grade
         JOptionPane.showMessageDialog(null, "Employee: " + firstName + " " + lastName +
                                                      "\nTotal Questions: " + testgrader.getNumberQuestions() + 
                                                      "\nNumber Missed: " + testgrader.getNumberMissed() + 
                                                       "\nScore: " + formatter.format(testgrader.getScore()) +
                                                      "\nGrade: " + testgrader.getGrade());
          
          // Output data to output file
          outputFile.println("Employee Name: " + lastName + ", " + firstName);
          outputFile.println("Number Missed: " + testgrader.getNumberMissed());
          outputFile.println("Score: " + formatter.format(testgrader.getScore()));
          outputFile.println("Grade: " + testgrader.getGrade());
          outputFile.println(); // Blank line
          outputFile.println(); // Blank line
         
                            
         // Add accumulators to keep track of total score, total pass plus grades,
         // total pass grades, and total fail grades
         totalScore += testgrader.getScore();
         counter++; 
         if (testgrader.getGrade() == "Fail")
         {
            counterFail++;
         }
         else if (testgrader.getGrade() == "Pass")
         {
            counterPass++;
         }
         else if (testgrader.getGrade() == "Pass Plus")
         {
            counterPassPlus++;
         }
         
      } // End while input.hasNext file
      
      // Calculate the average of the test scores
      averageScore = totalScore / counter;
      passPlusGrades = counterPassPlus;
      passGrades = counterPass;
      failGrades = counterFail;
      
      // Display summary message 
      JOptionPane.showMessageDialog(null, "Test Date: " + date +
                                                         "\nAverage Test Score: " + formatter.format(averageScore) +
                                                         "\nTotal Pass Plus Grades: " + passPlusGrades +
                                                         "\nTotal Pass Grades: " + passGrades + 
                                                         "\nTotal Fail Grades: " + failGrades);
        
       // Output data to output files                                                        
       outputFile.println("    AVERAGE TEST SCORE: " + formatter.format(averageScore));
       outputFile.println("TOTAL PASS PLUS GRADES: " + passPlusGrades);
       outputFile.println("     TOTAL PASS GRADES: " + passGrades);
       outputFile.println("     TOTAL FAIL GRADES: " + failGrades);
       outputFile.println();
       outputFile.println();
       
      // Close input and output files     
      inputFile.close();
      outputFile.close();  
                                  
   }//End main method
                
}// End Class TestProcessor