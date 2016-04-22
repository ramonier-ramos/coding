// This program simulates rolling a 6-sided die and a 20-sided die.
// It utilizes the Die class to create two objects, one for each die.

public class DieArgument
{
   public static void main(String[] args)
   {
      // Use Die class to create a 6-sided die object and a 20-sided die object
      Die sixDie = new Die(6);
      Die twentyDie = new Die(20);
      
      // Call rollDie method to roll each die (passing in Die object as argument)
      rollDie(sixDie);
      rollDie(twentyDie);
   }
   
   // This method simulates a die roll, displaying the die's number of sides and value.
	// (Three methods from the Die class are called for each die object.)
   public static void rollDie(Die d)
   {
      // Display the number of sides
      System.out.println("Rolling a " + d.getSides() + " sided die.");

      // Roll the die
      d.roll();

      // Display the die's value
      System.out.println("The die's value: " + d.getValue());
   }
}