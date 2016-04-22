// Programmer: Ramonier Ramos
// Filename: SnackOrder.java
// Date: 04/24/2015
// Description: Demonstrates a java applet to integrate with the user.

import javax.swing.*; // To use GUI components
import java.awt.event.*; // To use event listeners
import java.awt.*; // To use layout manager
import java.applet.*; // To create an applet
import java.text.DecimalFormat; // To format money in total order price
import javax.swing.JOptionPane; // to show message boxes
import java.lang.StringBuilder; // To build a string , I found this in chapter 9

public class SnackOrder extends JApplet
{  
   // Declare panels and panel components
   private JPanel panel1, panel2, panel3, panel4, panel5;
   private JButton snickersButton, butterFingerButton, laysButton, cocaColaButton, dietCokeButton, clearButton, placeButton;
   private JLabel quantitySnickersLabel, quantityButterFingerLabel, quantityLaysLabel, quantityColaLabel, quantityCokeLabel, 
   employeeNumberLabel, totalItemsLabel, totalOrderLabel;
   private JTextField quanSnickersText, quanButterFingerText, quanLaysText, quanColaText, quanCokeText,
   employeeNumberText, totalItemsText, totalOrderText;
   
   /*************************************************************************************
    The programs runs fine when you first start it up. If you try to use it more then once without
    closing the program then it starts to feel glitchy. (I added a build.setLength(0) to try and fix)
    I know the code is a bit excessive but it is effective. Also, I know I can put these variables 
   in the method they were used, but the program did not run as efficient when they were
   put in the ButtonListener method. When you click the ok button in the Order Summary,
   the order before it still comes up. I dont know how to get rid of this.
   Also, I took out all the .class files like you said. The program did not run in the web page
   until i compiled the SnackOrder.java in jGrasp. 
   **************************************************************************************/
   
    // Declare variables
   int totalItems = 0;
   double totalOrderPrice;
   int snickersCount = 0;
   int butterCount = 0;
   int laysCount = 0;
   int cocaColaCount = 0;
   int dietCokeCount = 0;
   int totalSnickers;
   int totalButterFingers;
   int totalLaysChips;
   int totalColas;
   int totalDietCokes;
   
   // Declare formatted money in total order price
   DecimalFormat format = new DecimalFormat("$##.00");
   
   // Create Stringbuilder object to build a string for the order message box
   StringBuilder build = new StringBuilder();
 
   // init method
   public void init()
   {
      // Add GridLayout manager to content pane
      setLayout(new GridLayout(5, 1));
      
      // Call methods to build panels
      buildPanel1();
      buildPanel2();
      buildPanel3();
      buildPanel4();
      buildPanel5();
         
      // Add panel to the content pane
      add(panel1);
      add(panel2);
      add(panel3);
      add(panel4);
      add(panel5);

   } // End init method
   
   // This method builds the panel1
   private void buildPanel1()
   {
      // Create panel1
       panel1 = new JPanel();
      
      // Create Snickers Button FIRST ROW
      snickersButton = new JButton("Snickers");
      snickersButton.setMnemonic(KeyEvent.VK_S);
      snickersButton.setPreferredSize(new Dimension(120, 25));
      snickersButton.addActionListener(new ButtonListener());
      // Create Quantity Label for snickers
      quantitySnickersLabel = new JLabel("Quantity:");
      // Create Snickers quantity text field
      quanSnickersText = new JTextField(0);
      quanSnickersText.setText("0");
      quanSnickersText.setEditable(false); // Make text read-only
      quanSnickersText.setFont(new Font("SansSerif", Font.BOLD, 12));
      // Create Employee Number Label
      employeeNumberLabel = new JLabel("Employee Number:");
      // Create Employee Number Text Field
      employeeNumberText = new JTextField(3);
      employeeNumberText.setEditable(true);
      employeeNumberText.setFont(new Font("SansSerif", Font.BOLD, 12));
      
      // Create a layout manager for the panel1
      panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
      
      // Add panel1 components
      panel1.add(snickersButton);
      panel1.add(quantitySnickersLabel);
      panel1.add(quanSnickersText);
      panel1.add(employeeNumberLabel);
      panel1.add(employeeNumberText);
      
   } // End method build panel1
   
   // Create method buildPanel2
   private void buildPanel2()
   {
      // Create panel2
      panel2 = new JPanel();
      
      // Create Buttefinger Button SECOND ROW
      butterFingerButton = new JButton("Butterfinger");
      butterFingerButton.setMnemonic(KeyEvent.VK_B);
      butterFingerButton.setPreferredSize(new Dimension(120, 25));
      butterFingerButton.addActionListener(new ButtonListener());
      // Create Quantity Label for butterfinger
      quantityButterFingerLabel = new JLabel("Quantity:");
      // Create butterfinger quantity text field
      quanButterFingerText = new JTextField(0);
      quanButterFingerText.setText("0");
      quanButterFingerText.setEditable(false); // Make text read-only
      quanButterFingerText.setFont(new Font("SansSerif", Font.BOLD, 12));
      // Create Total Items Label
      totalItemsLabel = new JLabel("Total Items Selected:");
      // Create total Items Text Field
      totalItemsText = new JTextField(2);
      totalItemsText.setText("0");
      totalItemsText.setEditable(false);
      totalItemsText.setFont(new Font("SansSerif", Font.BOLD, 12));
      totalItemsText.setHorizontalAlignment(JTextField.RIGHT);
      
       // Create a layout manager for the panel2
      panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
      
      // Add panel 2 components
      panel2.add(butterFingerButton);
      panel2.add(quantityButterFingerLabel);
      panel2.add(quanButterFingerText);
      panel2.add(totalItemsLabel);
      panel2.add(totalItemsText);

   } // End method buildPanel2
   
   // Create method to build panel3
   private void buildPanel3()
   {     
      // Create panel3
      panel3 = new JPanel();
      
      // Create Lays Chips button THIRD ROW
      laysButton = new JButton("Lays Chips");
      laysButton.setMnemonic(KeyEvent.VK_L);
      laysButton.setPreferredSize(new Dimension(120, 25));
      laysButton.addActionListener(new ButtonListener());
      // Create Quantity Label for lays chips
      quantityLaysLabel = new JLabel("Quantity:");
      // Create lays chips quantity text field
      quanLaysText = new JTextField(0);
      quanLaysText.setText("0");
      quanLaysText.setEditable(false); // Make text read-only
      quanLaysText.setFont(new Font("SansSerif", Font.BOLD, 12));
      // Create Total Order PriceLabel
      totalOrderLabel = new JLabel("Total Order Price:");
      // Create total Order Text Field
      totalOrderText = new JTextField(4);
      totalOrderText.setText("$0.00");
      totalOrderText.setEditable(false);
      totalOrderText.setFont(new Font("SansSerif", Font.BOLD, 12));
      totalOrderText.setHorizontalAlignment(JTextField.RIGHT);
      
      // Create a layout manager for the panel3
      panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
      
      // Add panel components
      panel3.add(laysButton);
      panel3.add(quantityLaysLabel);
      panel3.add(quanLaysText);
      panel3.add(totalOrderLabel);
      panel3.add(totalOrderText);

   } // End method buildPanel3
   
   // Create method to buld panel 4
   private void buildPanel4()
   {
      // Create panel4  
      panel4 = new JPanel();
          
      // Create Coca cola button FOURTH ROW
      cocaColaButton = new JButton("Coca-Cola");
      cocaColaButton.setMnemonic(KeyEvent.VK_C);
      cocaColaButton.setPreferredSize(new Dimension(120, 25));
      cocaColaButton.addActionListener(new ButtonListener());
      // Create Quantity Label for coca cola
      quantityColaLabel = new JLabel("Quantity:");
      // Create coca cola quantity text field
      quanColaText = new JTextField(0);
      quanColaText.setText("0");
      quanColaText.setEditable(false); // Make text read-only
      quanColaText.setFont(new Font("SansSerif", Font.BOLD, 12));
      // Create Clear order Button
      clearButton = new JButton("Clear Order");
      clearButton.setMnemonic(KeyEvent.VK_E);
      clearButton.setToolTipText("Click to clear order with commissary");
      clearButton.setPreferredSize(new Dimension(120, 25));
      clearButton.addActionListener(new ButtonListener());
      
       // Create a layout manager for the panel4
      panel4.setLayout(new FlowLayout( FlowLayout.LEFT));

      // Add components to panel4
      panel4.add(cocaColaButton);
      panel4.add(quantityColaLabel);
      panel4.add(quanColaText);
      panel4.add(clearButton);

   } // End method buildPanel4
   
   // Create method to build Panel5
   private void buildPanel5()
   {
      // Create panel5 
      panel5 = new JPanel();

      // Create diet coke button FIFTH ROW
      dietCokeButton = new JButton("Diet Coke");
      dietCokeButton.setMnemonic(KeyEvent.VK_D);
      dietCokeButton.setPreferredSize(new Dimension(120, 25));
      dietCokeButton.addActionListener(new ButtonListener());
      // Create Quantity Label for diet coke
      quantityCokeLabel = new JLabel("Quantity:");
      // Create diet coke quantity text field
      quanCokeText = new JTextField(0);
      quanCokeText.setText("0");
      quanCokeText.setEditable(false); // Make text read-only
      quanCokeText.setFont(new Font("SansSerif", Font.BOLD, 12));
      // Create place order Button
      placeButton = new JButton("Place Order");
      placeButton.setMnemonic(KeyEvent.VK_P);
      placeButton.setToolTipText("Click to place order with commissary");
      placeButton.setPreferredSize(new Dimension(120, 25));
      placeButton.addActionListener(new ButtonListener()); 
      
       // Create a layout manager for the panel5
      panel5.setLayout(new FlowLayout(FlowLayout.LEFT));
      
      // Add components to panel5
      panel5.add(dietCokeButton);
      panel5.add(quantityCokeLabel);
      panel5.add(quanCokeText);
      panel5.add(placeButton);

   } // End method buildpanel5
   
   // Private inner class to handle the event listener
   private class ButtonListener implements ActionListener
   {       
      // Declare constant for snack price
      private final double SNACK_PRICE = .75;
      
      public void actionPerformed(ActionEvent e)
      {
         String actionCommand = e.getActionCommand(); // Reads when a button is clicked
        
         if (actionCommand.equals("Snickers") && snickersCount < 3)
         {
            snickersCount++; // counter for snickers button
            //totalSnickers = snickersCount; 
            totalItems++; // running total for total items
            totalOrderPrice = totalItems * SNACK_PRICE; // running total of all items selected
            quanSnickersText.setText(String.valueOf(snickersCount)); // set quantity for snicker to number of snickers count
            totalItemsText.setText(String.valueOf(totalItems)); // set the total items field 
            totalOrderText.setText(String.valueOf(format.format(totalOrderPrice)));  // set the total order price field  
            //build.append(totalSnickers + " " + "Snickers").append("\n");           
         } // End if snickersButton  
                       
         else if (actionCommand.equals("Butterfinger") && butterCount < 3)
         {
            butterCount++; // counter butter finger button
            //totalButterFingers = butterCount;
            totalItems++; // running total for total items
            totalOrderPrice = totalItems * SNACK_PRICE; // running total of all items selected
            quanButterFingerText.setText(String.valueOf(butterCount)); //set quantity for butterfinger to number of butterfinger count
            totalItemsText.setText(String.valueOf(totalItems)); // set the total items field
            totalOrderText.setText(String.valueOf(format.format(totalOrderPrice))); // set the total order price field 
         }  // End else if butterFingerButton
         
        else if (actionCommand.equals("Lays Chips") && laysCount < 3)
         {
            laysCount++; // counter for lays chips button
           // totalLaysChips = laysCount;
            totalItems++; // running total for total items
            totalOrderPrice = totalItems * SNACK_PRICE; // running total of all items selected
            quanLaysText.setText(String.valueOf(laysCount)); // set quantity for lays chip to number of lays count
            totalItemsText.setText(String.valueOf(totalItems)); // set the total items field
            totalOrderText.setText(String.valueOf(format.format(totalOrderPrice))); // set the total order price field
         } // End else if laysButton
         
         else if (actionCommand.equals("Coca-Cola") && cocaColaCount < 3)
         {
            cocaColaCount++; // counter for coca cola button
           // totalColas = cocaColaCount;
            totalItems++; // running total for total items
            totalOrderPrice = totalItems * SNACK_PRICE; // running counter for total order price
            quanColaText.setText(String.valueOf(cocaColaCount)); // set quantity for coca cola to number of coca cola count
            totalItemsText.setText(String.valueOf(totalItems)); // set the total items field
            totalOrderText.setText(String.valueOf(format.format(totalOrderPrice))); // set the total order price field
         } // End else if cocaColaButton
         
         else if (actionCommand.equals("Diet Coke") && dietCokeCount < 3)
         {
            dietCokeCount++; // counter for diet coke button
            //totalDietCokes = dietCokeCount;
            totalItems++; // running total for total items
            totalOrderPrice = totalItems * SNACK_PRICE; // running counter for total order price
            quanCokeText.setText(String.valueOf(dietCokeCount)); // set quantity for diet coke to number of diet coke count
            totalItemsText.setText(String.valueOf(totalItems)); // set the total items field
            totalOrderText.setText(String.valueOf(format.format(totalOrderPrice))); // set the total order price field
         } // End else if dietCokeButton
         
         else if (e.getSource() == clearButton)
         {
            ClearButton(); // Clears all field in the applet and resets the field
         } // End else if clearButton
         
         else if (e.getSource() == placeButton) // Shows the order summary of the employees order
         {
            String employeeNumber = employeeNumberText.getText(); // Gets employee number from input from user
                                  
            if(totalItems < 1)
            {
               JOptionPane.showMessageDialog(null, "At least one item must be selected. ",
                                 "Invalid Order Quantity", JOptionPane.ERROR_MESSAGE);
            }
            /****************************************************************************************
            I am not sure why, but if you put in an employee number, then click the place order button,
            the "At least one item must be selected" error message shows, then you click at least one
            item, it then says that employee number is not correct. Even when it is in correct order. I am not 
            sure how to get around this. Also some times even when the correct format of employee number is
            input, the error message still shows. (12:31AM Friday morning, I may have fixed it, it's not showing
            the error message anymore) I am going to leave this comment in though just in case
            ****************************************************************************************/
            else if (!(isValid(employeeNumber)))
            {
               JOptionPane.showMessageDialog(null, "The employee number entered is not correct. " + 
                                                      "(Correct format is 1 letter followed by 3 digits.)", "Incorrect Employee Number" ,
                                                      JOptionPane.ERROR_MESSAGE);                         
            } // End else if isValid
            else
            { 
               if(snickersCount == 1) // appends to build if count is 1
                {
                   build.append(snickersCount + " " + "Snicker").append("\n");
                } // End if snickersCount == 1
                  else if(snickersCount == 2) // appends to build if count is 2
                  {
                     build.append(snickersCount + " " + "Snickers").append("\n");
                  } // End else if snickersCount == 2
                      else if(snickersCount == 3) // appends to build if count is 3
                      {
                      build.append(snickersCount + " " + "Snickers").append("\n");
                      } // End else if snickersCount == 3
                         else
                         {
                            // Necessary for the message box
                         } // End else
                
                if(butterCount == 1) // appends to build if count is 1
                {
                   build.append(butterCount + " " + "Butterfinger").append("\n");
                } // End if butterCount == 1
                
                   else if(butterCount == 2) // appends to build if count is 2
                   {
                      build.append(butterCount + " " + "Butterfingers").append("\n");
                   } // End else if butterCount == 2
                
                      else if(butterCount == 3) // appends to build if count is 3
                      {
                         build.append(butterCount + " " + "Butterfingers").append("\n");
                      } // End else if butterCount == 3
                
                         else
                         {
                            // Neccessary for the message box
                         } // End else
                
                if(laysCount == 1) // appends to build if count is 1
                {
                   build.append(laysCount + " " + "Lays Chips").append("\n");
                } // End if laysCount == 1
                
                   else if(laysCount == 2) // appends to build if count is 2
                   {
                      build.append(laysCount + " " + "Lays Chips").append("\n");
                   } // End else if laysCount == 2
                   
                      else if(laysCount == 3) // appends to build if count is 3
                      {
                         build.append(laysCount + " " + "Lays Chips").append("\n");
                      } // End else laysCount == 3
                      
                         else
                         {
                            // Neccessary for the message box
                         } // End else
                
                if(cocaColaCount == 1) // appends to build if count is 1
                {
                   build.append(cocaColaCount + " " + "Coca-Cola").append("\n");
                } // End if cocaColaCount == 1
                
                   else if(cocaColaCount == 2) // appends to build if count is 2
                   {
                      build.append(cocaColaCount + " " + "Coca-Colas").append("\n");
                   } // End else if cocaColaCount == 2
                   
                      else if(cocaColaCount == 3) // appends to build if count is 3
                      {
                         build.append(cocaColaCount + " " + "Coca-Colas").append("\n");
                      } // End else if cocaColaCount == 3
                      
                         else
                         {
                            // Neccessary for the message box
                         } // End else
                
                if(dietCokeCount == 1) // appends to build if count is 1
                {
                   build.append(dietCokeCount + " " + "Diet Coke").append("\n");
                } // End if dietCokeCount == 1
                
                   else if(dietCokeCount == 2) // appends to build if count is 2
                   {
                      build.append(dietCokeCount + " " + "Diet Cokes").append("\n");
                   } // End else if dietCokeCount == 2
                   
                      else if(dietCokeCount == 3) // appends to build if count is 3
                      {
                         build.append(dietCokeCount + " " + "Diet Cokes").append("\n");
                      } // End else if dietCokeCount == 3
                      
                         else
                         {
                            // Neccessary for the message box
                         } // End else

                     
                 // Displays the order summary
                JOptionPane.showMessageDialog(null, "Order for Employee " + employeeNumber + ":\n" + build +
                                                            "\n" + "Total Items: " + totalItems + "\nTotal Price : " + format.format(totalOrderPrice), 
                                                            "Order Summary", JOptionPane.INFORMATION_MESSAGE);                                                                    
                ClearButton(); // resets all fields 
                                   
             } // End else (line 348)
         } // End placeButton ( line 325)
         else 
         {           
            JOptionPane.showMessageDialog(null, "The maximum number of each item " +
                              "that can be selected is 3. ","Exceeds Maximum Quantity",  JOptionPane.WARNING_MESSAGE);
         } // End else
       
      } // End ActionPerformed
             
   } // End ButtonListener

   // This method is to clear all the fields and return to opening screen
   private void ClearButton()
   {
      // Reset all fields as if just opening the app
      snickersCount = 0;
      butterCount = 0;
      laysCount = 0;
      cocaColaCount = 0;
      dietCokeCount = 0;
      totalItems = 0;
      totalOrderPrice = 0;
      quanSnickersText.setText(String.valueOf(snickersCount));
      quanButterFingerText.setText(String.valueOf(butterCount));
      quanLaysText.setText(String.valueOf(laysCount));
      quanColaText.setText(String.valueOf(cocaColaCount));
      quanCokeText.setText(String.valueOf(dietCokeCount));
      employeeNumberText.setText("");
      totalItemsText.setText(String.valueOf(totalItems));
      totalOrderText.setText(String.valueOf(format.format(totalOrderPrice)));
      build.setLength(0); 
   } 
   
   // This method determines whether a String is a valid employee number. 
   // If so, it returns true.
   private static boolean isValid(String empNumber)
   {
      boolean goodSoFar = true;  // Flag
      int i = 0;                 // Control variable

      // Test the length
      if (empNumber.length() != 4)
         goodSoFar = false;

      // Test the first character for a letter
      while (goodSoFar && i < 1)
      {
         if (!Character.isLetter(empNumber.charAt(i)))
            goodSoFar = false;
         i++;
      }

      // Test the last 3 characters for digits
      while (goodSoFar && i < 4)
      {
         if (!Character.isDigit(empNumber.charAt(i)))
            goodSoFar = false;
         i++;
      }
      return goodSoFar;
   }

} // End SnackOrder Class


