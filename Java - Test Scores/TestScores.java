// Chapter 11, Programming Challenge 1: TestScores Class

public class TestScores
{
	// Declare field to reference an array holding test scores
	private double[] scores;
	
	// The constructor initializes an object with an array of scores.  If the array contains
	//	an invalid value (less than 0 or greater than 100) an exception is thrown.
	// (Note the throws clause in the following method header.  See p.722 in the textbook.)
	public TestScores(double[] scoreArray) throws IllegalArgumentException
	{
		// Create an array to hold the scores passed as an argument
		scores = new double[scoreArray.length];
		
		// Copy the scores passed as an argument into the new array
		// Check for illegal values as they are copied
		for (int i = 0; i < scoreArray.length; i++)
		{
			if (scoreArray[i] < 0 || scoreArray[i] > 100) // Test for invalid value
			{
				throw new IllegalArgumentException("Array Index: " + i + " Score: " + scoreArray[i]);
			}
			else // Handle valid value
			{
				scores[i] = scoreArray[i];
			}
		}
	}
	
	//	The getAverage method returns the average	of the object's test scores.
	public double getAverage()
	{
		double total = 0.0;	// Declare and initialize accumulator
		
		// Accumulate the sum of the scores
		for (int i = 0; i < scores.length; i++)
		{
			total += scores[i];
		}
		
		// Return the average of the scores
		return (total / scores.length);
	}
}