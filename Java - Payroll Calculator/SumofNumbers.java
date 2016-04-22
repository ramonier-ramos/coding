//Ch.4 Programming Practice #1
//Filename: SumofNumbers.java
//Description: Write a program that generates the sum of all integers entered
import java.util.Scanner; // Required to read input from user
public class SumofNumbers
{
      //Main begins program execution
      public static void main(String[] args)
      {
            //Declare variables
            int maxNum; // Holds upper limit specified by user
            int total = 0; // Accumulator to hold sum of numbers
            
            //Create a Scanner object for keyboard input
            Scanner keyboard = new Scanner(System.in);
            
            //Get number from user
            System.out.print(" Please enter a positive non-zero number");
            maxNum = keyboard.nextInt();
            
            //validate number to see if positive and use while loop
            while(maxNum <= 0)
            {
                  System.out.print("Invalid number. Please enter a positive non-zero number: ");
                  maxNum = keyboard.nextInt();
            }
            
            //Accumulate the sum, use a for loop because the number of loops needed is known
            for (int count = 1; count <= maxNum; count++)
            {
                  total += count;
            }
            
            //Display the sum
            System.out.println("The sum of all the integers from 1 through " + maxNum + " is " + total  + ".");
                             
      }//end main
}//end class