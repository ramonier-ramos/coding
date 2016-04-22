// Chapter 7, Programming Challenge 3: ChargeIt class

import javax.swing.JOptionPane;

public class ChargeIt
{
	public static void main(String[] args)
	{
		String input;		 // Keyboard input
		int accountNumber; // Account number to validate
		
		// Create a Validator object
		Validator val = new Validator();
		
		// Get a charge account number
		input = JOptionPane.showInputDialog("Enter your charge account number: ");
		accountNumber = Integer.parseInt(input);
		
		// Call Validator class isValid method to determine whether 
      // the charge account number entered by user is valid
		if (val.isValid(accountNumber))
			JOptionPane.showMessageDialog(null, "That's a valid charge account number.");
		else
			JOptionPane.showMessageDialog(null, "That's an INVALID charge account number.");
			
		System.exit(0);
	}
}