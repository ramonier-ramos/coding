// This class determines a passing or failing grade for an exam.

public class PassFailExam extends PassFailActivity
{
   private int numQuestions;   // Number of questions
   private double pointsEach;  // Points for each question
   private int numMissed;      // Number of questions missed

   // The constructor sets the number of questions, the number
   // of questions missed, and the minimum passing score.
   public PassFailExam(int questions, int missed, double minPassing)
   {
      // Call the superclass constructor
      super(minPassing);

      // Declare a local variable for the score
      double numericScore;

      // Set the numQuestions and numMissed fields
      numQuestions = questions;
      numMissed = missed;

      // Calculate the points for each question and the numeric score for this exam
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);

      // Call the superclass's setScore method to set the numeric score
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
