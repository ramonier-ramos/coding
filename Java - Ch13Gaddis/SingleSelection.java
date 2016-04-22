// This class demonstrates the List Component in 
// single selection mode.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SingleSelection extends JFrame
{
   private JPanel monthPanel;          // To hold components
   private JPanel selectedMonthPanel;  // To hold components
   private JPanel buttonPanel;         // To hold the button

   private JList monthList;            // To hold months
   private JList selectedMonthList;    // Selected months

   private JScrollPane scrollPane1;    // Scroll pane - first list
   private JScrollPane scrollPane2;    // Scroll pane - second list

   private JButton button;             // A button

   // The following array holds the values that will be displayed 
	// in the monthList list component
   private String[] months = {"January", "February", "March", "April", 
	                           "May", "June", "July", "August", "September", 
										"October", "November", "December"};

   // Constructor.
   public SingleSelection()
   {
      // Set the title
      setTitle("List Demo");

      // Specify an action for the close button
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Add a BorderLayout manager
      setLayout(new BorderLayout());

      // Build the panels
      buildMonthPanel();
      buildSelectedMonthsPanel();
      buildButtonPanel();

      // Add the panels to the content pane
      add(monthPanel, BorderLayout.NORTH);
      add(selectedMonthPanel,BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);

      // Pack and display the window
      pack();
      setVisible(true);
   }

   // This method adds a list containing the names of the months 
	// to a panel.
   private void buildMonthPanel()
   {
      // Create a panel to hold the list
      monthPanel = new JPanel();

      // Create the list
      monthList = new JList(months);

      // Set the selection mode to single interval selection
      monthList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

      // Set the number of visible rows to 6
      monthList.setVisibleRowCount(6);

      // Add the list to a scroll pane
      scrollPane1 = new JScrollPane(monthList);

      // Add the scroll pane to the panel
      monthPanel.add(scrollPane1);
   }

   // This method adds a list to a panel. This will hold the 
	// selected months.
   private void buildSelectedMonthsPanel()
   {
      // Create a panel to hold the list
      selectedMonthPanel = new JPanel();

      // Create the list
      selectedMonthList = new JList();

      // Set the number of visible rows to 6
      selectedMonthList.setVisibleRowCount(6);

      // Add the list to a scroll pane
      scrollPane2 = new JScrollPane(selectedMonthList);

      // Add the scroll pane to the panel
      selectedMonthPanel.add(scrollPane2);
   }

   // This method adds a button to a panel.
   private void buildButtonPanel()
   {
      // Create a panel to hold the list
      buttonPanel = new JPanel();

      // Create the button
      button = new JButton("Get Selections");

      // Add an action listener to the button
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
         // Get the selected values
         Object[] selections = monthList.getSelectedValues();

         // Store the selected items in selectedMonthList
         selectedMonthList.setListData(selections);
      }
   }

   // The main method creates an instance of the class.
   public static void main(String[] args)
   {
      new SingleSelection();
   }
}
