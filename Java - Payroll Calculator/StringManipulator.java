//Lab 1 exercise 12 
//Filename: String Manipulator
//program that asks user to enter name of city
import java.util.Scanner; //required to read input from keyboard

public class StringManipulator
{
   public static void main(String[] args)
   {
      //Declare variables
      String city; //users favorite city
      
      //Create Scanner objedt for input
      Scanner keyboard = new Scanner(System.in);
      
      //Get users city
      System.out.print("Enter the name of your favorite city: ");
      city = keyboard.nextLine();
      
      //Display number of characters
      System.out.println("Number of characters : " + city.length());
      
      //Display name in uppercase
      System.out.println(city.toUpperCase());
      
      //Display name in lowercase
      System.out.println(city.toLowerCase());
      
      //Display first character in the city name
      System.out.println(city.charAt(0));
      }// End
 } // End class
