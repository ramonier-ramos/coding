// This program improves the LoanQualifier.java program by only asking the
// user for the second input (years) if the first input (salary) qualifies.
// (Note the new location for the prompt used for the second input (years).)

import javax.swing.JOptionPane;  // Needed for JOptionPane class

public class LoanQualifier2
{
   public static void main(String[] args)
   {
      double salary;      // Annual salary
      double yearsOnJob;  // Years at current job
      String input;       // To hold string input

      // Get the user's annual salary
      input = JOptionPane.showInputDialog("Enter your annual salary.");
      salary = Double.parseDouble(input);

      // Determine whether the user qualifies for the loan
      if (salary >= 30000)
      {
	      // Get the number of years at the current job
	      input = JOptionPane.showInputDialog("Enter number of years at your current job.");
	      yearsOnJob = Double.parseDouble(input);
		
         if (yearsOnJob >= 2)
         {
            JOptionPane.showMessageDialog(null, "You qualify for the loan.");
         }
         else
         {
            JOptionPane.showMessageDialog(null, "You must have been on your current " + 
                                          "job for at least two years to qualify.");
         }
      }
      else
      {
            JOptionPane.showMessageDialog(null, "You must earn at least $30,000 " +
				                              "per year to qualify.");
      }
      
      System.exit(0);
   }
}
