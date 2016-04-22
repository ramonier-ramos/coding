//ch 4 Practice # 3
//Filename: DistanceFile.java
//Description: To write distance traveled to notepad
import java.util.Scanner;// Required to read input from user
import java.io.*; // Required for filewriter and printwriter classes

public class DistanceFile
{
      public static void main(String[] args) throws IOException // throws clause for IO
      {
            //Declare constant ( simplifies any necessary future maintenance
            final String OUTPUT_FILE = "DistanceReport.txt"; //output file name
            
            //Declare variables
            int speed; 
            int numberOfHours;
           
            
            //Create  a Scanner object to read input from keyboard
            Scanner keyboard = new Scanner(System.in);
            
            //Ask the user their speed and number of hours traveled
            System.out.println("What is your speed (in miles per hour)? ");
            speed = keyboard.nextInt();
            
          
            //Validate speed and hours are not negative
            while(speed < 0) 
            {     
                  System.out.print("You cannot travel a negative speed, otherwise you would be going back in time :)");
                  speed = keyboard.nextInt();
            }
            
            System.out.println("How many hours have you traveled? ");
            numberOfHours = keyboard.nextInt();
                 
            while (numberOfHours < 1)
            {     
                  System.out.print("You cannot travel less than 1 hour");
                  numberOfHours = keyboard.nextInt();
            }
            
            //Create the objects necessary to perform appended file output
            FileWriter fwriter = new FileWriter(OUTPUT_FILE, true);
            PrintWriter outputFile = new PrintWriter(fwriter);
            
            //Display header
            outputFile.println("Hours\tDistance Traveled");
            outputFile.println("-------------------------------------");
            
            //Calculate the distance traveled
            for (int count = 1; count <= numberOfHours; count++)
            {
                  outputFile.println(count +"\t\t" + count * speed);
            }
            
            outputFile.println();
            
            outputFile.close();
            
            System.out.println("Report written to " + OUTPUT_FILE + ".");
     }//end main
}//end class