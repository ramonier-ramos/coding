// Chapter 11, Programming Challenge 1: TestScoresDemo Class

public class TestScoresDemo
{
   public static void main(String[] args)
   {
      // Declare and populate an array with test scores
      // (Note that the element at array index 3 contains an invalid score)
      double[] badScores = {97.5, 66.7, 88.0, 101.0, 99.0 };

      // Declare and populate another array with test scores
      // (Note that all of these scores are good)
      double[] goodScores = {97.5, 66.7, 88.0, 100.0, 99.0 };
      
      // Create an instance of the TestScores class, initialized with badScores
      try
      {
         TestScores tBad = new TestScores(badScores);
         // The following statement should not execute, due to the exception thrown
			// in the TestScores class because of the presence of bad data in the array
         System.out.println("The average of the bad scores is: " + tBad.getAverage());
      }
      catch (IllegalArgumentException e)
      {
         System.out.println("Invalid score found!\n" + e.getMessage());
      }
   
      // Create an instance of the TestScores class, initialized with goodScores
      try
      {
         TestScores tGood = new TestScores(goodScores);
         System.out.println("The average of the good scores is: " + tGood.getAverage());
      }
      catch (IllegalArgumentException e)
      {
         System.out.println("Invalid score found!\n" + e.getMessage());
      }
   }
}