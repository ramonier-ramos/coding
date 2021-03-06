// Programmer: Ramonier Ramos
// Filename: TestProcessor.java
// Due Date: 02/20/2015
// Description: Individual Assignment #2 - TestProcessor class file.
import javax.swing.JOptionPane; // Required for message dialog and input dialog boxes
import java.io.*;     // For file I/O classes
import java.util.Scanner; // For Scanner objects
import java.text.DecimalFormat; //needed to format input
public class TestGrader
{ 
   // These are the private class fields
   private int numberQuestions;
   private int numberMissed;
   private double score = 0.0;
   private String grade;
       
   // The constructor method is called each time an instance of the class is created.
   public TestGrader(int questions, int missed)
   {
      numberQuestions = questions;
      numberMissed = missed;
   }
       
   // The calculateScore method stores values in the fields
   public void calculateScore()
   {
      score = numberMissed / numberQuestions;
   }
       
   // The determineGrade method stores a grade in the g field.
   public void determineGrade()
   {
      if (score < 70 )
      {
         grade = "Fail";
      }   
      else if (score >= 70) 
      {
         grade = "Pass";
      }
      else if (score >= 90)
      {
         grade = "Pass Plus";
      }           
   } // End if
      
   // The getNumberQuestions method returns a TestProcessor number of questions
   public int getNumberQuestions()
   {
      return numberQuestions;
   }
       
   // The getNumberMissed method returns a TestProcessor number of missed questions
   public int getNumberMissed()
   {
      return numberMissed;
   }
       
   // The getScore method returns a TestProcessor score
   public double getScore()
   {
      return score;
   }
       
   // The getGrade method returns a TestProcessor grade
   public String getGrade()
   {
      return grade;
   }
   
   // Main method begins program execution
   public static void main(String[] args) throws IOException // Throws clause here
   {
            String input;
           // Prompt the user to enter the number of questions on the test
            input = JOptionPane.showInputDialog("Enter the number of questions on the test:");
            numberOfQuestions = Integer.parseInt(input); // Convert input to integer
                  
            input = JOptionPane.showInputDialog("Employee SSN: " + "\n" 
                                                           "Employee Name: " + 
                                                           "\n" + "Enter the number of test questions missed:");
          
          numberOfMissed = Integer.parseInt(input); //Convert input to integer
          
          
                                                
         
         // Call TestGrader class constructor to create new TestGrader objects
         TestGrader testgrader = new TestGrader(numberOfQuestions, numberOfMissed);
 
         // Call the TestGrader class methods to get score and grade
         JOptionPane.showMessageDialog(null, "Employee: "  +
                                                      "\nTotal Questions: " + testgrader.getNumberQuestions() + 
                                                      "\nNumber Missed: " + testgrader.getNumberMissed() + 
                                                       "\nScore: " + testgrader.getScore() +
                                                      "\nGrade: " + testgrader.getGrade());
                                                  
   }                                            

} // End class TestGrader