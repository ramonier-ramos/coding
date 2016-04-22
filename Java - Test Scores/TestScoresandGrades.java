//Ch.3 Programming Practice #4
//Filename: TestScoresandGrades.java
//Description: ask the user to input 3 grades, find average, output letter grade
import java.util.Scanner; // needed to read input from user

public class TestScoresandGrades
{
      // Main begins program execution
      public static void main(String[] args)
      {
            //Declare variables
            int TestScore1;
            int TestScore2;
            int TestScore3;
            int average;
            char grade;
            
            //Create Scanner object to read input from user
            Scanner keyboard = new Scanner(System.in);
            
            // have the user input the test scores
            System.out.println("Enter your first test score");
            TestScore1 = keyboard.nextInt();
            
            System.out.println("Enter your second test score");
            TestScore2 = keyboard.nextInt();
            
            System.out.println("Enter your third test score");
            TestScore3 = keyboard.nextInt();
            
            // Find the average for the test grades
            average = (TestScore1 + TestScore2 + TestScore3 ) / 3;
            
            // Display the average and the grade
            System.out.println("The average of your test scores is: " + average);
            
            if (average >= 90)
                  grade = 'A';
            else if (average >= 80)
                  grade = 'B';
            else if (average >= 70)
                  grade = 'C';
            else if (average >= 60)
                  grade = 'D';
            else if (average < 60)
                  grade = 'F';
             else
              {
                  grade = ' ';
                  System.out.println("Your grade is unknown");
              }
              
              //display the users grade
              System.out.println(" Your grade is " + grade);
           } //end main
     }// end class TestScoresandGrades
            
            
            