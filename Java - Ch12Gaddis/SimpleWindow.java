// This class extends the JFrame class. Its constructor displays
// a simple window with a title. The application exits when the
// user clicks the close button.

import javax.swing.*;  // Needed for Swing classes

public class SimpleWindow extends JFrame  // Extends JFrame class
{
   // Constructor   
   public SimpleWindow()
   {
      final int WINDOW_WIDTH = 350;   // Window width in pixels
      final int WINDOW_HEIGHT = 250;  // Window height in pixels

      // Set window title
      setTitle("A Simple Window");

      // Set window size
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Display the window
      setVisible(true);
   }
}
