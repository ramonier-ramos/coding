// This class defines a GUI window and has it's own main method.

import javax.swing.*;  // Needed for Swing classes

public class EmbeddedMain extends JFrame
{
   final int WINDOW_WIDTH = 220;  // Window width
   final int WINDOW_HEIGHT = 70;  // Window height
   
   // Constructor  
   public EmbeddedMain()
   {
      // Set window title
      setTitle("A Simple Window");

      // Set window size
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify an action for the close button
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a label to display a message
      JLabel messageLabel = new JLabel("This class has it's own main method.");
      
      // Add the label to the content pane
      add(messageLabel);

      // Display the window
      setVisible(true);
   }
   
   // The main method creates an instance of the EmbeddedMain
   // class, which causes it to display its window.

   public static void main(String[] args)
   {
      EmbeddedMain em = new EmbeddedMain();
   }
}
