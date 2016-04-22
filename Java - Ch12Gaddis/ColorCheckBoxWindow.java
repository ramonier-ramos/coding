// The ColorCheckBoxWindow class demonstrates how check boxes can be used.

import javax.swing.*;     // Needed for Swing classes
import java.awt.*;        // Needed for Color class and FlowLayout class
import java.awt.event.*;  // Needed for event listener interface

public class ColorCheckBoxWindow extends JFrame
{
   private JLabel messageLabel;            // A message to the user
   private JCheckBox yellowCheckBox;       // To select yellow background
   private JCheckBox redCheckBox;          // To select red foreground
   private final int WINDOW_WIDTH = 300;   // Window width
   private final int WINDOW_HEIGHT = 100;  // Window height

   // Constructor
   public ColorCheckBoxWindow()
   {
      // Set window text
      setTitle("Color Check Boxes");

      // Set window size
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify an action for the close button
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a label
      messageLabel = new JLabel("Select the check " +
                          "boxes to change colors.");

      // Create two check boxes
      yellowCheckBox = new JCheckBox("Yellow background");
      redCheckBox = new JCheckBox("Red foreground");

      // Add an item listener to each of the check boxes
      yellowCheckBox.addItemListener(new CheckBoxListener());
      redCheckBox.addItemListener(new CheckBoxListener());

      // Add a FlowLayout manager to the content pane
      setLayout(new FlowLayout());

      // Add the label and check boxes to the content pane
      add(messageLabel);
      add(yellowCheckBox);
      add(redCheckBox);

      // Display the window
      setVisible(true);
   }

   // Private inner class that handles the event when
   // the user clicks one of the check boxes.
   private class CheckBoxListener implements ItemListener
   {
      public void itemStateChanged(ItemEvent e)
      {
         // Determine which check box was clicked
         if (e.getSource() == yellowCheckBox)
         {
            // Is the yellow check box selected? If so, we
            // want to set the background color to yellow.
            if (yellowCheckBox.isSelected())
            {
               // The yellow check box was selected. Set
               // the background color for the content
               // pane and the two check boxes to yellow.
               getContentPane().setBackground(Color.YELLOW);
               yellowCheckBox.setBackground(Color.YELLOW);
               redCheckBox.setBackground(Color.YELLOW);
            }
            else
            {
               // The yellow check box was deselected. Set
               // the background color for the content
               // pane and the two check boxes to light gray.
               getContentPane().setBackground(Color.LIGHT_GRAY);
               yellowCheckBox.setBackground(Color.LIGHT_GRAY);
               redCheckBox.setBackground(Color.LIGHT_GRAY);
            }
         }
         else if (e.getSource() == redCheckBox)
         {
            // Is the red check box selected? If so, we want
            // to set the forground color to red.
            if (redCheckBox.isSelected())
            {
               // The red check box was selected. Set the
               // foreground color for the label and the
               // two check boxes to red.
               messageLabel.setForeground(Color.RED);
               yellowCheckBox.setForeground(Color.RED);
               redCheckBox.setForeground(Color.RED);
            }
            else
            {
               // The red check box was deselected. Set the
               // foreground color for the label and the
               // two check boxes to black.
               messageLabel.setForeground(Color.BLACK);
               yellowCheckBox.setForeground(Color.BLACK);
               redCheckBox.setForeground(Color.BLACK);
            }
         }
      }
   }
   
   // The main method creates an instance of the
   // ColorCheckBoxWindow class, displaying its window.
   
   public static void main(String[] args)
   {
      new ColorCheckBoxWindow();
   }
}
