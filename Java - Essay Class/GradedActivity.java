// Chapter 10, Programming Challenge 4: GradedActivity class

public class GradedActivity
{
   private double score; // Numeric score

   // The setScore method sets the score.
   public void setScore(double s)
   {
      score = s;
   }

   // The getScore method returns the score.
   public double getScore()
   {
      return score;
   }

   // The getGrade method returns a letter grade determined from the score.
   public char getGrade()
   {
      char letterGrade;

      if (score >= 90)
         letterGrade = 'A';
      else if (score >= 80)
         letterGrade = 'B';
      else if (score >= 70)
         letterGrade = 'C';
      else if (score >= 60)
         letterGrade = 'D';
      else
         letterGrade = 'F';

      return letterGrade;
   }
}