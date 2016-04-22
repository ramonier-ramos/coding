// This application uses the AudioClip class to play a sound.
// Sound source: NASA

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;         // For the File class
import java.net.*;        // For URL class and MalformedURLException

public class AudioFrame extends JFrame
{
   private JLabel credit;       // Displays NASA credit
   private JButton playButton;  // Plays the sound clip
   private JButton loopButton;  // Loops the clip
   private JButton stopButton;  // Stops the clip
   private AudioClip sound;     // Holds the sound clip
   
   // Constructor.
   public AudioFrame() throws MalformedURLException
   {
      // Set the title
      setTitle("JFrame Audio Demo");
 
       // Specify an action for the close button
      setDefaultCloseOperation(EXIT_ON_CLOSE);
     
      // Create a layout manager
      setLayout(new FlowLayout());
      
      // Make the credit label and add it
      credit = new JLabel("Audio source: NASA");
      add(credit);
      
      // Make the buttons and add them
      makeButtons();
      
      // Create a file object for the step.wav file
      File file = new File("step.wav");
      
      // Get a URI object for the audio file
      URI uri = file.toURI();

      // Get a URL for the audio file
      URL url = uri.toURL();
    
      // Get an AudioClip object for the sound file using the 
      // Applet class's static newAudioClip method
      sound = Applet.newAudioClip(url);
      
      // Pack and display
      pack();
      setVisible(true);
   }
   
   // This method creates the Play, Loop, and Stop 
   // buttons, and adds them to the content pane.
   private void makeButtons()
   {
      // Create the  Play, Loop, and Stop buttons
      playButton  = new JButton("Play");
      loopButton  = new JButton("Loop");         
      stopButton  = new JButton("Stop");
          
      // Register an action listener with each button
      playButton.addActionListener(new ButtonListener());
      loopButton.addActionListener(new ButtonListener());
      stopButton.addActionListener(new ButtonListener());

      // Add the buttons to the content pane
      add(playButton);
      add(loopButton);
      add(stopButton);
   }

   // This private inner class handles the action event that is 
   // generated when the user clicks one of the buttons.
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Determine which button was clicked and 
         // perform the selected action
         if (e.getSource() == playButton)
            sound.play();
         else if (e.getSource() == loopButton)
            sound.loop();        
         else if (e.getSource() == stopButton)
            sound.stop();
      }
   }

   // The main method creates an instance of the class.
   public static void main(String[] args) throws MalformedURLException
   {
      new AudioFrame();
   }
}
