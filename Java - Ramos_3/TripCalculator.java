// Programmer: Ramonier Ramos
// Filename: TripCalculator.java
// Due Date: 04/10/2015
// Description: Individual Assignment #3 - To determine driving distance between
//                                                      two cities when average speed is given.

// Import required Java libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TripCalculator extends JFrame
{
   // Set constant for file used to provide input data
   final String INPUT_FILE = "Mileage.txt";
   
   // Set constants for window size
   private final int WIDTH = 320;
   private final int HEIGHT = 200;
   
   // Set constants for array size
   private final int ROWS = 8;
   private final int COLUMNS = 8;
   
   // Delcare 2-dimensional array for holding data from text file
   private String [] [] fileData = new String [ROWS] [COLUMNS];
   
    // Create an array to add speeds to combobox
   String [] speeds = {"50", "60", "70", "80", "90", "100", "110", "120"};
   
   // Create DecimalFormat objects
   DecimalFormat fmt = new DecimalFormat("#0.0");
   DecimalFormat fmtt = new DecimalFormat("###0");
   
   // Declare panel and panel components 
   private JPanel panel;
   private JLabel cityDestination;
   private JLabel cityOrigin;
   private JLabel distance;
   private JLabel averageSpeed;
   private JLabel tripDuration;
   private JRadioButton milesButton; // Radio button to select miles unit
   private JRadioButton kilometersButton; // Radio button to select kilometers unit
   private ButtonGroup radioButtonGroup; // Groups the radio buttons
   private JComboBox<String> cityDestinationBox; // Combobox to hold array of destination cities
   private JComboBox<String> cityOriginBox; // Combobox to hold array of origin cities
   private JTextField distanceText; // Textfield that outputs distance
   private JTextField tripDurationText; // Textfield that outputs trip duration in hours
   private JComboBox averageSpeedBox; // Combobox to hold array of speeds
   private JMenuBar menuBar; 
   private JMenu fileMenu; // Creates file menu at top of app
   private JMenuItem fileExitItem; // inside file menu is the exit item
   private JMenu helpMenu; // Creates the help menu at top of app
   private JMenuItem helpAboutItem; // inside the help is the about item
       
   // Constructor.
   public TripCalculator()
   {
      // Call method to load data from text file
      loadData();

      // Set window attributes 
      setTitle("Trip Calculator");              // Set window title
      setSize(WIDTH, HEIGHT);                // Set window size
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // Set close button behavior
      
      // Call method to build panel
      buildPanel();
      
      // Call method to build menu
      buildMenuBar();
      
      // Add panel to the frame's content pane
      add(panel);
      
      // Display window;
      setVisible(true);
      
      // Set the maximize button to false
      setResizable(false);
    
   }// End constructor TripCalculator
      
   // This method reads data in from a text file and stores it in an array.
   private void loadData()
   {
      // Declare local variables
      File file;
      Scanner input;
      String fileRow;
      String[] rowItems;
      
      // Use a try/ catch statement to verify existence of data file.
      try
      {
         file = new File(INPUT_FILE);
         input = new Scanner(file);
         
         //Read the data from the file and store it in an array by use of the split method
         for (int row = 0; row < ROWS; row++)
         {
            fileRow = input.nextLine();
            rowItems = fileRow.split(",");
            
            for (int col = 0; col < COLUMNS; col++)
            {
               fileData[row] [col] = rowItems[col];
            }
         }
      }// End try
      
      catch (FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null, "Data file not found. ");
         System.exit(0);
         
      }// End catch
           
   }//End loadData
   
   // This method builds a panel.
   private void buildPanel()
   {
      // Create and populate the destination city combo box
      cityDestination = new JLabel ("Destination City: "); 
      cityDestinationBox = new JComboBox<String>();
      for (int index = 1; index < COLUMNS; index++)
       cityDestinationBox.addItem(fileData [0] [index]);
         
      // Register action listener for the destination city combo box
      cityDestinationBox.addActionListener(new JItemListener());
      
      // Create and populate the origin city combo box
      cityOrigin = new JLabel ("Origin City: ");
      cityOriginBox = new JComboBox<String>();
      for (int index = 1; index < ROWS; index++)
       cityOriginBox.addItem(fileData [0] [index]);
         
      // Register action listener for the origin city combo box
      cityOriginBox.addActionListener(new JItemListener());
      
      // Create the miles and kilometers radio buttons
      milesButton = new JRadioButton ("Miles", true);
      kilometersButton = new JRadioButton ("Kilometers");
      
      // Group the radio buttons
      ButtonGroup group = new ButtonGroup();
      group.add(milesButton);
      group.add(kilometersButton);
      
      // Register action listener for the miles and kilometers radio buttons
      milesButton.addActionListener(new JItemListener());
      kilometersButton.addActionListener(new JItemListener());
      milesButton.setToolTipText("Select for miles distance units.");
      kilometersButton.setToolTipText("Select for kilometers distance units.");
      
      // Create the distance in miles read only text field
      distance = new JLabel ("Distance (miles):");
      distanceText = new JTextField(10);
      distanceText.setEditable(false); // Make text field read-only
      distanceText.setFont (new Font("SansSerif", Font.PLAIN, 12));
      distanceText.setText ("0"); // Set startup value
      
      // Create the average speed  (mph) combo box
      averageSpeed = new JLabel("Avg.Speed (mph):");
      averageSpeedBox = new JComboBox(speeds);
      
      // Register an action listener for the average speed combobox
      averageSpeedBox.addActionListener(new JItemListener());
      
      // Create the Trip Duration read only text field
      tripDuration = new JLabel ("Trip Duration (hours): ");
      tripDurationText = new JTextField(10);
      tripDurationText.setEditable(false); // Make text field read-only
      tripDurationText.setFont (new Font("SansSerif", Font.PLAIN, 12));
      tripDurationText.setText("0.0"); // Set startup value
      
      // Create panel and add components to it 
      panel = new JPanel();
      panel.setLayout (new GridLayout (6, 2)); // I used a grid layout because it seemed simpler
      panel.add(cityDestination);
      panel.add(cityDestinationBox);
      panel.add(cityOrigin);
      panel.add(cityOriginBox);
      panel.add(milesButton);
      panel.add(kilometersButton);
      panel.add(distance);
      panel.add(distanceText);
      panel.add(averageSpeed);
      panel.add(averageSpeedBox);
      panel.add(tripDuration);
      panel.add(tripDurationText);
      
   }// End buildPanel
   
   // This method si to build menu bar.
   private void buildMenuBar()
   {
      // Create the menubar
      menuBar = new JMenuBar();
      
      // Create the file and help menus
      buildFileMenu();
      buildHelpMenu();
      
      // Add file and help menus to menu bar.
      menuBar.add(fileMenu);
      menuBar.add(helpMenu);
      
      // Set the windows menu bar
      setJMenuBar(menuBar);
   }
   
   // This method builds a file menu
   private void buildFileMenu()
   {
      // Create file menu
      fileMenu = new JMenu("File");
      fileMenu.setMnemonic (KeyEvent.VK_F);
      
      // Create Exit menu item
      fileExitItem = new JMenuItem("Exit");
      fileExitItem.setMnemonic(KeyEvent.VK_X);
      fileExitItem.addActionListener(new ExitItemListener());
      
      // Add Exit menu item to file menu
      fileMenu.add(fileExitItem);
   }
   
   // This method builds a help menu
   private void buildHelpMenu()
   {
      helpMenu = new JMenu("Help");
      helpMenu.setMnemonic(KeyEvent.VK_H);
      
      // Create an about menu item
      helpAboutItem = new JMenuItem("About");
      helpAboutItem.setMnemonic(KeyEvent.VK_A);
      helpAboutItem.addActionListener(new AboutItemListener());
      
      // Add about item to help menu
      helpMenu.add(helpAboutItem);
   }
   
   // Private inner class to handle selection of file Exit menu item
   private class ExitItemListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0); // Exit program
      }
   }
   
   // Private inner class to handle selection of help about menu item
   private class AboutItemListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         JOptionPane.showMessageDialog(null, "Trip Calculator Application" +
         "\nCopyright 2015 - R.Ramos");
      }     
   }
   
   /**Private inner class to handle event if radio button is selected, or if any of the values
   in the combo boxes are changed*/
   private class JItemListener implements ActionListener
   {   
      public void actionPerformed (ActionEvent e)
      {
         // Declare local variables
         double distanceResult;
         double speed;
         double tripTime;
         double kilos;
         String selection;
         
         // Required to get information needed
         int selectedRow = cityOriginBox.getSelectedIndex();
         int selectedCol = cityDestinationBox.getSelectedIndex();
         distanceText.setText(fileData[selectedRow + 1] [selectedCol + 1]);        
         tripDurationText.setText(fileData[selectedRow + 1] [selectedCol + 1]); 
         int selectedSpeed = averageSpeedBox.getSelectedIndex();      
         selection = (String)averageSpeedBox.getSelectedItem();
         
         // Only runs if the miles radio button is selected
         if (milesButton.isSelected())
         {
            distance.setText("Distance (miles):"); 
            averageSpeed.setText("Avg.Speed (mph):"); 
            distanceResult = Double.parseDouble(distanceText.getText()); // Gets the value from array and converts it to double       
            speed = Double.parseDouble(selection); // Gets the value from the speed array and converts it to double
            tripTime = ( distanceResult / speed); // Calculates the trip duration 
            tripDurationText.setText(fmt.format(tripTime)); // formats the output of the trip duration
         }
         else if (kilometersButton.isSelected()) // runs if the kilometers button is selected
         {
            distance.setText("Distance (kilometers):");
            averageSpeed.setText("Avg.Speed (kph):");  
            distanceResult = Double.parseDouble(distanceText.getText()); // Gets the value from array and converts it to double
            kilos = MetricConverter.milesToKilometers(distanceResult); // Calls the MetricConverter method to convert miles to kilometers
            speed = Double.parseDouble(selection); // Gets the value from the speed array and converts it to double
            tripTime = kilos / speed; // Calculates the trip duration
            tripDurationText.setText(fmt.format(tripTime)); // formats the output of the trip duration
            distanceText.setText(fmtt.format(kilos));  // formats the output of the distance in kilometers output         
         }       
       }
   }// End JItemListener

   // Main method to create an instance of the class.
   public static void main (String[] args)
   {
      TripCalculator tC = new TripCalculator();
   }
   
}// End class TripCalculator