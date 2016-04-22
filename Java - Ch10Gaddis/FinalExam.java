// This class determines the grade for a final exam.

public class FinalExam extends GradedActivity
{
   private int numQuestions;   // Number of questions
   private double pointsEach;  // Points for each question
   private int numMissed;      // Questions missed

   // The constructor sets the number of questions on the
   // exam and the number of questions missed.
   public FinalExam(int questions, int missed)
   {
      double numericScore;  // To hold a numeric score

      // Set the numQuestions and numMissed fields
      numQuestions = questions;
      numMissed = missed;

      // Calculate the points for each question and the numeric score for this exam
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);

      // Call the inherited setScore method to set the numeric score
      setScore(numericScore);
   }

   // This method returns the number of points each question is worth.
   public double getPointsEach()
   {
      return pointsEach;
   }

   // This method returns the number of questions missed.
   public int getNumMissed()
   {
      return numMissed;
   }
}
