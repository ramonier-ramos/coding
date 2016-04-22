import javax.swing.*;
import java.awt.event.*;

public class TempConverterWindow extends JApplet
{
   private JPanel panel;                  // To reference a panel
   private JLabel messageLabel;           // To reference a label
   private JTextField tempTextField;      // To reference a text field
   private JButton convertButton;         // To reference a button
  
   public void init()
   {
      // Build the panel by calling the method below
      buildPanel();
      
      // Add the panel to the frame's content pane
      add(panel);
      
   }
   
   // Build a panel and add a label, text field, and button to the panel
   private void buildPanel()
   {
      // Create a label to display instructions
      messageLabel = new JLabel("Enter a temperature in degrees Fahrenheit: ");
      // Create a text field 3 characters wide
      tempTextField = new JTextField(3);
      // Create a button
      convertButton = new JButton("Convert");
      // Add an action listener to the button
      convertButton.addActionListener(new ConvertButtonListener());
      // Create a JPanel object and let the panel field reference it
      panel = new JPanel();
      // Add the label, text field, and button components to the panel
      panel.add(messageLabel);
      panel.add(tempTextField);
      panel.add(convertButton);
   }
   
   
   // Create an action listener private inner class for the Convert button
   private class ConvertButtonListener implements ActionListener
   {
      // The following method executes when the user clicks on the Convert button
      public void actionPerformed(ActionEvent e)
      {
         // Declare variables
         String input;   // User's input
         double celsius; // Converted temperature
         // Get the text entered by the user into the text field
         input = tempTextField.getText();
         // Convert the Fahrenheit input to Celsius
         celsius = (Double.parseDouble(input) - 32) * 5/9;
         // Display the result
         JOptionPane.showMessageDialog(null, input + " degrees Fahrenheit is " + 
                                       celsius + " degrees Celsius.");
      }
   }
}

   
            















