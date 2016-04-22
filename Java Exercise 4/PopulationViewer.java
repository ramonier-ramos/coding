// Programmer: Ramonier Ramos
// Filename: PopulationViewer.java
// Date: -
// Description: Reads data from a file into a two-dimensional array.

// Import required java libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class PopulationViewer extends JFrame
{
   // Set constant for file used to provide input data
   final String INPUT_FILE = "PopulationData.txt";
   
   // Set constants for window size
   private final int WIDTH = 190;
   private final int HEIGHT = 100;
   
   // Set constants for array size
   private final int ROWS = 5;
   private final int COLUMNS = 4;
   
   // Declare 2-dimensional array for holding data from text file
   private String[] [] fileData = [ROWS] [COLUMNS];
   
   // Declare panel and panel components
   private JPanel panel;
   private JLabel cityLabel;
   private JComboBox cityBox;
   private JLabel yearLabel;
   private JComboBox yearBox;
   private JLabel populationLabel;
   private JTextField populationText;
   
   // Constructor
   public PopulationViewer()
   {
      // Call method to load data from text file
      loadData();
      
      // Set window attributes
      setTitle("Census");              // Set window title
      setSize(WIDTH, HEIGHT);       // Set window size
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // Set close button behavior
      
      // Call method to build panel
      buildPanel;
      
      // Add panel to the frame's content pane
      add(panel);
      
      // Show Display window
      setVisible(true);
   }
   
   // This method reads data in from a text file and stores it in an array
   private void loadData()
   {
      // Declare local variables
      File file;
      Scanner input;
      String fileRow;
      String[] rowItems;
      
      // Use exception handling block to verify existence of data file
      try
      {
         file = new File(INPUT_FILE)
         input = new Scanner( file);
         
         // Read data from file and store it in array. Use split method to split
         // each file row's data into a series of items that is stored in a 1-dimensional
         // array named rowItems which then "feeds" the 2-dimensional array name filedata. 
         for (int row = 0; row < ROWS; row++)
         {
            fileROW = input.nextLine();
            rowITEMS = fileRow.split(" ");
            
            for (int col 
   