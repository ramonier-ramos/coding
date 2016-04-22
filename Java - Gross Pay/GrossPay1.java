//Programmer: Ramonier Ramos
//Filename: GrossPay1.java
//Date: 01/15/2015
//Description: Calculates an employees gross pay for a pay period

public class GrossPay1
{
   public static void main(String[] args)
   {
      //Declare and assign some variables
      double hours; // hours worked
      double rate; // hourly rate paid
      double pay; // gross pay
      
     
      rate = 9.75;
      hours = 40;
      
      //Calculate pay based on hours and rate
      pay = hours * rate;
      
      //Display results
      System.out.println("You earned $" + pay);
      }
  }
      
      
      

