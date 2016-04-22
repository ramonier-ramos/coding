//Ch.4 Programming practice # 2
//Filename : DistanceTraveled.java
//Description: To determine the distance traveled by user
import java.util.Scanner;// Required to read input from user

public class DistanceTraveled
{
      public static void main(String[] args)
      {
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
            
            //Display header
            System.out.println("Hours\tDistance Traveled");
            System.out.println("----------------------------------");
            
            //Calculate the distance traveled
            for (int count = 1; count <= numberOfHours; count++)
            {
                  System.out.println(count +"\t\t" + count * speed);
            }
     }//end main
}//end class