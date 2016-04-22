//Programmer: Ramonier Ramos
//Filename: GrossPay3.java
//Date: 01/15/2015
//Description: To ask the user the hours worked and rate
import javax.swing.JOptionPane;//required for dialog boxes

public class GrossPay3
{
   public static void main(String[] args)
   {
      //Declare and assign some variables
      double hours; // hours worked
      double rate; // hourly rate paid
      double pay; // gross pay
      String inputString; //Input dialog box contents
      
      //Display prompt and get input for hours worked
      inputString = JOptionPane.showInputDialog("How many hours did your work? ");
      hours = Double.parseDouble(inputString);
      
      //Display prompt and get rate from user
      inputString = JOptionPane.showInputDialog("What is your hourly rate? ");
     rate = Double.parseDouble(inputString);
      
      //Calculate pay based on hours and rate
      pay = hours * rate;
      
      //Display results
     JOptionPane.showMessageDialog(null, "You earned $" + pay);
      //End program
      System.exit(0);
      }
  }