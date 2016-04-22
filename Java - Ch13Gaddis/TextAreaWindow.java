// This class demonstrates how to use a JTextArea to 
// display text and accept text input.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
import java.io.*;

public class TextAreaWindow extends JFrame
{
	// GUI components for frame
   private JPanel textPanel;        // To hold a text area
   private JPanel buttonPanel;      // To hold a button
   private JTextArea textTextArea;  // To display and accept text
	private JScrollPane scrollPane;  // To provide text area scroll bar
   private JButton button;          // To save text to file

   // Constructor.
   public TextAreaWindow() throws IOException
   {
      // Set the title
      setTitle("Text Area Demonstration");

      // Specify an action for the close button
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a BorderLayout manager
      setLayout(new BorderLayout());

      // Build the panels
      buildTextPanel();
      buildButtonPanel();

      // Add the panels to the content pane
      add(textPanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);

      // Pack and display the window
      pack();
      setVisible(true);
   }

   // This method adds a label to a panel
   private void buildTextPanel() throws IOException
   {
      // Create a panel
      textPanel = new JPanel();

		// Read contents of text file into a string for display in text 
		// area (after making sure that the input file exists)
      File file = new File("MyTextFile.txt");
      if (!file.exists())
      {
         JOptionPane.showMessageDialog(null, "The MyTextFile.txt " + 
			                              "file cannot be found. \n" +
                                       "Program terminated.");
         System.exit(0);
      }
		Scanner inputFile = new Scanner(file);
		String input = "";           // To hold text read from the file
		while (inputFile.hasNext())  // Loop until end of input file
		{
			input += inputFile.nextLine() + "\n";  // Concatenate file lines
		}
		inputFile.close();

      // Create a text area and display the file contents
      textTextArea = new JTextArea(input, 10, 30);
		
		// Turn on line wrapping for text area, 
		// and set to word wrap style
		textTextArea.setLineWrap(true);
		textTextArea.setWrapStyleWord(true);
		
		// Add the text area to the scroll pane 
		// and set scroll bar preferences
		scrollPane = new JScrollPane(textTextArea);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
      // Add the scroll pane to the panel
      textPanel.add(scrollPane);
   }

   // This method adds a button to a panel
   private void buildButtonPanel()
   {
      // Create a panel
      buttonPanel = new JPanel();

      // Create a button
      button = new JButton("Save");

      // Register an action listener with the button
      button.addActionListener(new ButtonListener());

      // Add the button to the panel
      buttonPanel.add(button);
   }

   // This private inner class handles the event when the user 
	// clicks the button.
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
			// Read the contents of the text area to string
			String output = textTextArea.getText();

			// Use exception handling for potential IOException
			// (covered in Chapter 12 of textbook)
	      try
	      {
			   // Create FileWriter and PrintWriter objects to enable
 			   // writing (overwriting) data to text file
  				FileWriter fwriter = new FileWriter("MyTextFile.txt");
    		 	PrintWriter outputFile = new PrintWriter(fwriter);

				// Write string (with text area contents) to text file
				outputFile.println(output);
	         JOptionPane.showMessageDialog(null, "Data successfully " +
				                              "saved to MyTextFile.txt.");
				outputFile.close();
			}
	  		catch (IOException f)
	      {
	         JOptionPane.showMessageDialog(null, "Output file not found." +
				                         "\n Data NOT successfully saved.");
	      }
      }
   }
   
   // The main method creates an instance of the class.
   public static void main(String[] args) throws IOException
   {
      new TextAreaWindow();
   }
}
