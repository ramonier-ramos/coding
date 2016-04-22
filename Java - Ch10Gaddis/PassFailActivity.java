// This class holds a numeric score and determines whether the score is passing or failing.

public class PassFailActivity extends GradedActivity
{
   private double minPassingScore;  // Minimum passing score

   // The constructor sets the minimum passing score.
   public PassFailActivity(double mps)
   {
      minPassingScore = mps;
   }

   // This method returns a letter grade determined from the score field. 
	// This method overrides the superclass method.
   public char getGrade()
   {
      char letterGrade;

      if (super.getScore() >= minPassingScore)
         letterGrade = 'P';
      else
         letterGrade = 'F';

      return letterGrade;
   }
}
