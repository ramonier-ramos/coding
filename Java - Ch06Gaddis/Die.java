// The Die class provides a simulation of a multi-sided die.

import java.util.Random;  // To use the Random class

public class Die
{
   private int sides;  // Number of sides on die
   private int value;  // Value of die roll
   
   // The constructor creates a die object of the specified number of sides.
   public Die(int numSides)
   {
      sides = numSides;
   }
   
   // The roll method simulates the rolling of the die.
   public void roll()
   {
      // Create a Random object
      Random rand = new Random();

      // Get a random value for the die
      value = rand.nextInt(sides) + 1;
   }
   
   // The getSides method returns the number of sides on the die.
   public int getSides()
   {
      return sides;
   }
   
   // The getValue method returns the value of the die.
   public int getValue()
   {
      return value;
   }
}