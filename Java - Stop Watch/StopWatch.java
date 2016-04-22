// Chapter 14 Programming Challenge 8: StopWatch

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StopWatch extends JApplet
{
 	// Declare constant  
	private final int TIME_DELAY = 1000; // To set one second time delay
	
	// Declare variables
   private int numSeconds = 0;          // To count the seconds
   private JTextField secondsTextField; // To display the seconds
   private JButton startButton;         // To start the timer
   private JButton stopButton;          // To stop the timer
   private JPanel secondsPanel;         // To hold the seconds text field
   private JPanel buttonPanel;          // To hold the start and stop buttons
   private Timer timer;                 // To reference a Timer object

   public void init()
   {
      // Build the seconds panel
      buildSecondsPanel();
      
      // Build the button panel
      buildButtonPanel();
      
      // Add the panels to the default layout manager of the content pane
      add(secondsPanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);
      
      // Create a timer object
      timer = new Timer(TIME_DELAY, new TimerListener());
   }

   private void buildSecondsPanel()
   {
      // Create a panel
      secondsPanel = new JPanel();
      
      // Create the text field
      secondsTextField = new JTextField(10);
		secondsTextField.setHorizontalAlignment(JTextField.RIGHT);
      secondsTextField.setEditable(false);
      secondsTextField.setFont(new Font("SansSerif", Font.BOLD, 18));
      secondsTextField.setText("0");
            
      // Add the text field to the panel
      secondsPanel.add(secondsTextField);
   }

   private void buildButtonPanel()
   {
      // Create a panel
      buttonPanel = new JPanel();
      
      // Create two buttons
      startButton = new JButton("Start");
      stopButton = new JButton("Stop");
      
      // Register the buttons with action listeners
      startButton.addActionListener(new StartButtonListener());
      stopButton.addActionListener(new StopButtonListener());
      
      // Add the buttons to the panel
      buttonPanel.add(startButton);
      buttonPanel.add(stopButton);
   }

   private class TimerListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         numSeconds++; // Increment seconds
         secondsTextField.setText(String.valueOf(numSeconds)); // Update seconds display
      }
   }

   private class StartButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         timer.start(); // Start the timer
      }
   }
   
   private class StopButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         timer.stop(); // Stop the timer
      }
   }
}