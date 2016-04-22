// This class demonstrates how to use a File Chooser object 
// to select an image file to display.

import java.awt.*;
import java.awt.event.*;  
import javax.swing.*;
import java.io.*;  // Needed for File Chooser

public class FileChooserDemo extends JFrame
{
   private JPanel imagePanel;     // To hold a label
   private JPanel buttonPanel;    // To hold a button
   private JLabel imageLabel;     // To show an image
   private JButton selectButton;  // To select an image

   // Constructor.
   public FileChooserDemo()
   {
      // Set the title
      setTitle("File Chooser Demo");

      // Specify an action for the close button
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a BorderLayout manager
      setLayout(new BorderLayout());

      // Build the panels
      buildImagePanel();
      buildButtonPanel();

      // Add the panels to the content pane
      add(imagePanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);

      // Pack and display the window
      pack();
      setVisible(true);
   }

   // This method adds a label to a panel.
   private void buildImagePanel()
   {
      // Create a panel
      imagePanel = new JPanel();

      // Create a label
      imageLabel = new JLabel("Click the button to select an image file to display.");
      
      // Add the label to the panel
      imagePanel.add(imageLabel);
   }

   // This method adds a button to a panel.
   private void buildButtonPanel()
   {
       // Create a panel
      buttonPanel = new JPanel();

      // Create a button
      selectButton = new JButton("Select Image File");

      // Register an action listener with the button
      selectButton.addActionListener(new ButtonListener());

      // Add the button to the panel
      buttonPanel.add(selectButton);
   }

   // This private inner class handles the event when the user clicks the button.
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
			String filename = "";  // To hold name of file selected
			
			// Create File Chooser object
			// (The "." argument sets the current directory as the default)
			JFileChooser fileChooser = new JFileChooser(".");

			// Determine status of user selection in File Chooser dialog box
			int status = fileChooser.showOpenDialog(null);
			
			// If user has clicked OK button, process the selection
			if (status == JFileChooser.APPROVE_OPTION)
			{
   			File selectedFile = fileChooser.getSelectedFile();
   			filename = selectedFile.getPath();  // Get name of file selected

         	// Read the image file into an ImageIcon object
         	ImageIcon selectedImage = new ImageIcon(filename);

         	// Display the image in the label
         	imageLabel.setIcon(selectedImage);

         	// Remove the text from the label
         	imageLabel.setText(null);

         	// Pack the frame again for the new size of the label
         	pack();
			}
      }
   }
   
   // The main method creates an instance of the class.
   public static void main(String[] args)
   {
      new FileChooserDemo();
   }
}