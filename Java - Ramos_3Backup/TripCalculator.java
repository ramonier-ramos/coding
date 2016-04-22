// Programmer: Ramonier Ramos
// Filename: TripCalculator.java
// Due Date: 04/10/2015
// Description: Individual Assignment #3 - 

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
   
   // Create a DecimalFormat object.
   DecimalFormat fmt = new DecimalFormat("#0.0");
   DecimalFormat fmtt = new DecimalFormat("###0");
   
   // Declare panel and panel components 
   private JPanel panel;
   private JLabel cityDestination;
   private JLabel cityOrigin;
   private JLabel distance;
   private JLabel averageSpeed;
   private JLabel tripDuration;
   private JRadioButton milesButton;
   private JRadioButton kilometersButton;
   private ButtonGroup radioButtonGroup;
   private JComboBox<String> cityDestinationBox;
   private JComboBox<String> cityOriginBox;
   private JTextField distanceText;
   private JTextField tripDurationText;
   private JComboBox averageSpeedBox;
   private JMenuBar menuBar;
   private JMenu fileMenu;
   private JMenuItem fileExitItem;
   private JMenu helpMenu;
   private JMenuItem helpAboutItem;

   // Create an array to add speeds to combobox
   String [] speeds = {"50", "60", "70", "80", "90", "100", "110", "120"};
   //averageSpeedBox = speeds;
       
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
      
      // Create the distance in miles read only text field
      distance = new JLabel ("Distance (miles):");
      distanceText = new JTextField(10);
      distanceText.setEditable(false); // Make text field read-only
      distanceText.setFont (new Font("SansSerif", Font.BOLD, 12));
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
      tripDurationText.setFont (new Font("SansSerif", Font.BOLD, 12));
      tripDurationText.setText("0.0"); // Set startup value
      
      // Create panel and add components to it 
      panel = new JPanel();
      panel.setLayout (new GridLayout (6, 2));
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
   
   // Private inner class to handle event of item being selected in either combo box.
   private class JItemListener implements ActionListener
   {   
      public void actionPerformed (ActionEvent e)
      {
         // Declare local variables
         double distanceResult;
         double speed;
         double tripTime;
         double kilos;
         double myMiles;
         String getMiles;
         String selection;
  
         int selectedRow = cityOriginBox.getSelectedIndex();
         int selectedCol = cityDestinationBox.getSelectedIndex();
         distanceText.setText(fileData[selectedRow + 1] [selectedCol + 1]);        
         tripDurationText.setText(fileData[selectedRow + 1] [selectedCol + 1]); 
         int selectedSpeed = averageSpeedBox.getSelectedIndex();  
         
         selection = (String)averageSpeedBox.getSelectedItem();
         
         if (milesButton.isSelected())
         {
            distance.setText("Distance (miles):");
            averageSpeed.setText("Avg.Speed (mph):");
            distanceResult = Double.parseDouble(distanceText.getText());           
            speed = Double.parseDouble(selection);
            tripTime = ( distanceResult / speed);  
            tripDurationText.setText(fmt.format(tripTime));
         }
         else if (kilometersButton.isSelected())
         {
            distance.setText("Distance (kilometers):");
            averageSpeed.setText("Avg.Speed (kph):");   
            distanceText.setText(fileData[selectedRow + 1] [selectedCol + 1]); 
            getMiles = distanceText.getText();
            myMiles = Double.parseDouble(getMiles);
            kilos = MetricConverter.milesToKilometers(myMiles);
            speed = Double.parseDouble(selection);
            tripTime = kilos / speed;
            tripDurationText.setText(fmt.format(tripTime));
            distanceText.setText(fmtt.format(kilos));          
         }       
       }
   }// End JItemListener

   // Main method to create an instance of the class.
   public static void main (String[] args)
   {
      TripCalculator tC = new TripCalculator();
   }
   
}// End class TripCalculator