//Programmer: Ramonier Ramos
//Filename: GrossPay2.java
//Date: 01/15/2015
//Description: To ask the user the hours worked and rate
import java.util.Scanner;//required for input from keyboard

public class GrossPay2
{
   public static void main(String[] args)
   {
      //Declare and assign some variables
      double hours; // hours worked
      double rate; // hourly rate paid
      double pay; // gross pay
      
      //Create scanner object to read input from keyboard
      Scanner keyboard = new Scanner(System.in);
      
      //Display prompt to user
      System.out.println("How many hours did you work? ");
      hours = keyboard.nextDouble();
      System.out.println("What is your hourly rate? ");
      rate = keyboard.nextDouble();
      
      //Calculate pay based on hours and rate
      pay = hours * rate;
      
      //Display results
      System.out.println("You earned $" + pay);
      }
  }