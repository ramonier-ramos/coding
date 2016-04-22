//Ch.3 Programming Problem #1
//Filename: Roman Numerals.java
//Description: enter a number between 1-10, return it back in roman numeral version
import java.util.Scanner;// needed to read input from user

public class RomanNumerals
{
   public static void main(String[] args)
   {
      //Declare variable
      int number; // To hold input number
      
      // Declare a Scanner object to read input from keyboard
      Scanner keyboard = new Scanner(System.in);
      
      // Get number from user
      System.out.println("Enter a number between 1 and 10 ");
      number = keyboard.nextInt();
      
      // Display the roman numeral for that number
      switch (number)
        {
             case 1:
               System.out.println("I");
               break;
             case 2:
               System.out.println("II");
               break;
             case 3:
               System.out.println("III");
               break;
             case 4:
                  System.out.println("IV");
                  break;
             case 5: 
                  System.out.println("V");
                  break;
             case 6:
                  System.out.println("VI");
                  break;
             case 7:
                  System.out.println("VII");
                  break;
             case 8:
                  System.out.println("VIII");
                  break;
             case 9:
                  System.out.println("IX");
                  break;
             case 10:
                  System.out.println("X");
                  break;
             default:
                  System.out.println("Number is invalid");
      } 
      }//end main 
} // end class RomanNumerals
                                    
      