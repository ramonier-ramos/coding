//Lab 1 Exercise 10
// Filename: Test Average.java
import java.util.Scanner; // required to read input from keyboard
import javax.swing.JOptionPane;
public class TestAverage
{
   public static void main(String[] args)
   {
      //Declare variables
      double test1;
      double test2;
      double test3;
      double average;
      
      //Create scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //Get first test score
      System.out.print("Enter test score #1: ");
      test1 = keyboard.nextDouble();
      
      //Get second test score
      System.out.print("Enter test score #2: ");
      test2 = keyboard.nextDouble();
      
      //Get third test score
      System.out.print("Enter test score #3: ");
      test3 = keyboard.nextDouble();
      
      //Calculate average of test scores
      average = (test1 + test2 + test3) / 3.0;
      
      //Display results of test scores and average of test scores
      System.out.println("Test score for #1: " + test1);
      System.out.println("Test score for #2: " + test2);
      System.out.println("Test score for #3: " + test3);
      System.out.println("The average for all test scores : " + average);
      
      if (average > 95)
         JOptionPane.showMessageDialog("That's a great score!");
         
         
      } //end java
  } //end class