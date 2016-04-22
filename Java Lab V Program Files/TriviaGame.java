// Programmer: Your Name
// Filename: TriviaGame.java
// Date: 11/26/2013
// Description: Demonstrates an applet utilizing a timer and sound effects.

// Import required Java libraries
import java.awt.*;       // To use a layout manager
import java.awt.event.*; // To use event listeners
import javax.swing.*;    // To use GUI components
import java.applet.*;    // To create an applet

public class TriviaGame extends JApplet
{
	// Set constant for number of questions (rows in array)
	private final int NUM_QUESTIONS = 6;
   

	// Declare and initialize 2-dimensional array for holding trivia data
	private String[][] triviaData = {{" Who was the 16th President of the U.S.?", " Abraham Lincoln"},
                   						{" What baseball team has won the most World Series?", " New York Yankees"},
												{" What color has a name with which no English word rhymes?", " Orange"},
												{" What year did man first step foot on the moon?", " 1969"},
												{" What is the name of the currency used in the European Union?", " Euro"},
                    						{" How many stories tall is the Empire State Building?", " 102"}};

	// Declare panels and panel components
	private JPanel panel1, panel2, panel3, panel4, panel5;
	private JLabel timeSetLabel, soundSetLabel, timeDisplayLabel, secondsLabel, answerLabel;
	private JRadioButton fiveSecondsRadioButton, tenSecondsRadioButton;
	private ButtonGroup timeGroup;
	private JCheckBox soundCheckBox;
	private JButton questionButton;
	private JTextField questionTextField, timeDisplayTextField, answerTextField;

	// Declare other variables
   private Timer timer; // Timer object for setting time limit for answering question
	// ADD
	// OTHER
	// NECESSARY
	// VARIABLE
	// DECLARATIONS
	// HERE

	// init method.
	public void init()
	{
		// Add GridLayout manager to content pane
		setLayout(new GridLayout(5, 1));

		// Call method to build 5 panels
		buildPanels();
		
		// Add panels to the window's content pane
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
				
		// Initialize timer
      timer = new Timer(1000, new TimerListener()); // 1 second delay
	}

	// This method builds the 5 panels.
	private void buildPanels()
	{
		// panel1 components:
		
		// Create label
		timeSetLabel = new JLabel("Select your preferred time limit to answer:");
		// Create two radio buttons and button group
		fiveSecondsRadioButton = new JRadioButton("5 Seconds", true);
		fiveSecondsRadioButton.setMnemonic(KeyEvent.VK_5);
		fiveSecondsRadioButton.addActionListener(new RadioButtonListener());
		tenSecondsRadioButton = new JRadioButton("10 Seconds");
		tenSecondsRadioButton.setMnemonic(KeyEvent.VK_1);
		tenSecondsRadioButton.addActionListener(new RadioButtonListener());
		timeGroup = new ButtonGroup();
		timeGroup.add(fiveSecondsRadioButton);
		timeGroup.add(tenSecondsRadioButton);

		// panel2 components:
		
		// Create label
		soundSetLabel = new JLabel("Check/uncheck this box to turn sound effects on/off:");
		// Create check box
		soundCheckBox = new JCheckBox("Sound", true);
		soundCheckBox.setMnemonic(KeyEvent.VK_S);
		soundCheckBox.addItemListener(new CheckBoxListener());
		
		// panel3 components:
		
		// Create button
		questionButton = new JButton("Display Question");
		questionButton.setMnemonic(KeyEvent.VK_D);
		questionButton.setPreferredSize(new Dimension(130, 20));
		questionButton.addActionListener(new ButtonListener());
		// Create text field
		questionTextField = new JTextField(35);
		questionTextField.setEditable(false); // Make text field read-only
		questionTextField.setFont(new Font("SansSerif", Font.BOLD, 12));
		questionTextField.setForeground(Color.BLUE); // Set text color
		
		// panel4 components:
		
		// Create label
		timeDisplayLabel = new JLabel("Time Left:");
		// Create text field
		timeDisplayTextField = new JTextField(2);
		timeDisplayTextField.setEditable(false); // Make text field read-only
		timeDisplayTextField.setFont(new Font("SansSerif", Font.BOLD, 16));
		timeDisplayTextField.setHorizontalAlignment(JTextField.RIGHT);
		timeDisplayTextField.setText("5"); // Set startup display value
		// Create label
		secondsLabel = new JLabel("Seconds");

		// panel5 components:
		
		// Create label
		answerLabel = new JLabel("ANSWER:");
		// Create text field
		answerTextField = new JTextField(12);
		answerTextField.setEditable(false); // Make text field read-only
		answerTextField.setFont(new Font("SansSerif", Font.BOLD, 12));
		answerTextField.setForeground(Color.BLUE); // Set text color
	
		// Create 5 panels
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();

		// Add components to panels
		panel1.add(timeSetLabel);
		panel1.add(fiveSecondsRadioButton);
		panel1.add(tenSecondsRadioButton);
		panel2.add(soundSetLabel);
		panel2.add(soundCheckBox);
		panel3.add(questionButton);
		panel3.add(questionTextField);
		panel4.add(timeDisplayLabel);
		panel4.add(timeDisplayTextField);
		panel4.add(secondsLabel);
		panel5.add(answerLabel);
		panel5.add(answerTextField);
	}

   // Private inner class to handle the event of one of the radio buttons being clicked.
   private class RadioButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
			// ADD REQUIRED CODE HERE
      }
	}

   // Private inner class to handle the event of check box being clicked.
   private class CheckBoxListener implements ItemListener
   {
      public void itemStateChanged(ItemEvent e)
      {
			// ADD REQUIRED CODE HERE
      }
   }

	// Private inner class to handle the event of button being clicked.
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// ADD REQUIRED CODE HERE
		}
	}
	
   // Private inner class to handle the Timer object's action events.
   private class TimerListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
			// ADD REQUIRED CODE HERE
      }
   }
}