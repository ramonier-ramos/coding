// The BorderDemonstration class demonstrates adding a border to a panel.
// Note: This is for demonstrating the code necessary to create a border only
// -- you would not usually place a border around an entire frame like this.
// Instead, you would use borders to help set off groups of related controls.

import javax.swing.*;  // Needed for Swing classes
import java.awt.*;     // Needed for FlowLayout class

public class BorderDemonstration extends JFrame
{
   private JPanel panel;                   // A holding panel
   private JCheckBox treePollenCheckBox;   // For selecting tree pollen allergy
   private JCheckBox petFurCheckBox;       // For selecting pet fur allergy
   private JCheckBox penicillinCheckBox;   // For selecting penicillin allergy
   private final int WINDOW_WIDTH = 175;   // Window width
   private final int WINDOW_HEIGHT = 160;  // Window height

   // Constructor
   public BorderDemonstration()
   {
      // Set window title
      setTitle("Demo");

      // Set window size
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify an action for the close button
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Build the panel and add it to the frame
      buildPanel();

      // Add the panel to the frame's content pane
      add(panel);

      // Display the window
      setVisible(true);
   }

   // The buildPanel method adds three check boxes to a panel.
   private void buildPanel()
   {
      // Create the three check boxes
      treePollenCheckBox = new JCheckBox("Tree Pollen");
      petFurCheckBox = new JCheckBox("Pet Fur");
      penicillinCheckBox = new JCheckBox("Penicillin");

      // Create a panel and add the components to it
      panel = new JPanel();
      panel.add(treePollenCheckBox);
      panel.add(petFurCheckBox);
      panel.add(penicillinCheckBox);
      panel.setLayout(new FlowLayout(FlowLayout.LEFT)); // Left-align check boxes
      // ADD A TITLED BORDER AROUND PANEL
      panel.setBorder(BorderFactory.createTitledBorder("Specify Allergies"));
   }

   // The main method creates an instance of the
   // BorderDemonstration class, displaying its window.
   public static void main(String[] args)
   {
      new BorderDemonstration();
   }
}
