//Lab 1 Problem # 9
//Miles per Gallon exercise
import javax.swing.JOptionPane; //required for dialog boxes

public class MilesPerGallon
{
   public static void main (String[] args)
   {
      //declare variables needed
      double milesdriven; //number of miles driven
      double gallonsofgas; //number of gallons used
      double MPG; //miles per gallon
      String input; //keyboard input
      
      // Get miles driven
      input = JOptionPane. showInputDialog("Enter the miles driven: ") ;
      milesdriven = Double.parseDouble (input);
      
      //Get number of gallons of fuel used
      input = JOptionPane.showInputDialog("Enter the gallons of fuel used: ") ;
      gallonsofgas = Double.parseDouble(input);
      
      //Calculate miles-per-gallon
      MPG = milesdriven / gallonsofgas;
      
      //Display miles per gallon
      JOptionPane.showMessageDialog(null, " The miles per gallon is: " + MPG);
      
      //End program
      System.exit(0) ;
      }
  }
     
      
