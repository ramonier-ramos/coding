// Programmer: Ramonier Ramos
// Filename: TestGrader.java
// Due Date: 02/20/2015
// Description: Individual Assignment #2 - TestProcessor class file.

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
       
   // The calculateScore method calls the getScore method to calculate score.
   public void calculateScore()
   {
      getScore();
   }
       
   // The determineGrade method calls the getGrade method to determine grade.
   public void determineGrade()
   {
      getGrade();        
   } 
      
   // The getNumberQuestions method returns a value for the number of questions
   public int getNumberQuestions()
   {
      return numberQuestions;
   }
       
   // The getNumberMissed method returns a value for the number of missed questions
   public int getNumberMissed()
   {
      return numberMissed;
   }
       
   // The getScore method calculates the score
   public double getScore()
   {
      score = (((double)numberQuestions - numberMissed) / numberQuestions) * 100.0;
      return score;
   }
       
   // The getGrade method determines the grade
   public String getGrade()
   {      
      if (score < 70 )
      {
         grade = "Fail";
      }   
      else if (score >= 90) 
      {
         grade = "Pass Plus";
      }
      else if (score >= 70)
      {
         grade = "Pass";
      }   
      return grade;        
   }
   
} // End class TestGrader