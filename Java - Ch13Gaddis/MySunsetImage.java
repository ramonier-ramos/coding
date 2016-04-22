// This class demonstrates how to use an ImageIcon and a JLabel to 
// display an image.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MySunsetImage extends JFrame
{
   private JPanel imagePanel;   // To hold the label
   private JPanel buttonPanel;  // To hold a button
   private JLabel imageLabel;   // To show an image
   private JButton button;      // To get an image


   // Constructor.
   public MySunsetImage()
   {
      // Set the title
      setTitle("Cruise Sunset");

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

   // This method adds a label to a panel
   private void buildImagePanel()
   {
      // Create a panel
      imagePanel = new JPanel();

      // Create a label
      imageLabel = new JLabel("Click the button to see an image " + 
		                        "of a sunset.");
      
      // Add the label to the panel
      imagePanel.add(imageLabel);
   }

   // This method adds a button to a panel
   private void buildButtonPanel()
   {
      ImageIcon smileyImage;

      // Create a panel
      buttonPanel = new JPanel();

      // Get the smiley face image
      smileyImage = new ImageIcon("Smiley.gif");

      // Create a button
      button = new JButton("Get Image");
      button.setIcon(smileyImage);

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
         // Read the image file into an ImageIcon object
         ImageIcon sunsetImage = new ImageIcon("Sunset.jpg");

         // Display the image in the label
         imageLabel.setIcon(sunsetImage);

         // Remove the text from the label
         imageLabel.setText(null);

         // Pack the frame again for the new size of the label
         pack();
      }
   }
   
   // The main method creates an instance of the class.
   public static void main(String[] args)
   {
      new MySunsetImage();
   }
}
