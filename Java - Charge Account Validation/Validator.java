// Chapter 7, Programming Challenge 3: Validator class

public class Validator
{
	// Declare field as array of valid charge account numbers
   // NOTE: It would also be possible to write this program
   //       using a String array rather than an int array
	private int[] valid = { 5658845, 4520125, 7895122, 8777541, 
	                        8451277, 1302850, 8080152, 4562555,
									5552012, 5050552, 7825877, 1250255,
                           1005231, 6545231, 3852085, 7576651,
									7881200, 4581002 };
	
   //	The isValid method uses a sequential search to determine whether
   // a number appears in the array of valid charge account numbers.
	public boolean isValid(int number)
	{
		boolean found = false; // Flag
		int index = 0;			  // Array index
		
		// Loop until 
      while (!found && index < valid.length)
		{
			if (valid[index] == number)
				found = true;
			else
				index++;
		}
		
		return found;
	}
}