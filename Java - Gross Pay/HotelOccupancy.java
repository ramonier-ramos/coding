//Ch. 4 practice #7
//Filename: HotelOccupancy.java
//Description: Write a program that calculates occupancy rate 
import java.util.Scanner; // Required for input from user
public class HotelOccupancy
{
      public static void main(String[] args)
      {
            //Declare constant
            final int MINIMUM_ROOMS = 10;
            
            //Declare Variables
            int rooms;
            int occupied;
            int vacantRooms;
            int numberOfFloors;
            int totalOccupied;
            int totalNumberOfRooms;
            double OccupancyRate;
            
            //Create a Scanner object for keyboard input
            Scanner keyboard = new Scanner(System.in);
            
            //Ask the user the number of floors in hotel
            System.out.print("How many floors are in the hotel? ");
            numberOfFloors = keyboard.nextInt();
            
            //Validate number of floors is not less than 1
            while (numberOfFloors <= 1)
            {
                  System.out.print("Enter 1 or more for number of floors");
                  numberOfFloors = keyboard.nextInt();
            }
            //Initialize Accumulators
            totalNumberOfRooms = 0;
            totalOccupied = 0;
           
             //Get the number of floors
             for (int floors = 1; floors <= numberOfFloors; floors++)
             {
                    System.out.println("How many rooms does floor " + (floors) + " have? " );
                    rooms = keyboard.nextInt();
                    
                    while (rooms < MINIMUM_ROOMS)
                    {
                        System.out.println("Invalid number. Please enter " + MINIMUM_ROOMS + " or more: ");
                        rooms = keyboard.nextInt();
                    }
                    
                    totalNumberOfRooms += rooms; // Increment total number of rooms
                    
                    //Get the number of occupied rooms on each floor
                    System.out.println(" How many occupied rooms  does floor " + (floors) + "have?");
                    occupied = keyboard.nextInt();
                    
                    while (occupied > rooms)
                    { 
                        System.out.print("Invalid number. Number of occupied rooms should be" + rooms + "or less. Please re-enter");
                        occupied = keyboard.nextInt();
                    }
                    
                    totalOccupied += occupied; //Increment total number of occupied rooms
             }
             
             //Calculate number of vacant rooms
             vacantRooms = totalNumberOfRooms - totalOccupied;
             
             //Calculate Occupancy rate
             //Avoid integer division
             OccupancyRate = (double)totalOccupied / totalNumberOfRooms;
             
             //Display the Results
             System.out.println();
             System.out.println("HOTEL OCCUPANCY SUMMARY:");
             System.out.print("Number of rooms : " + totalNumberOfRooms +
                                    "\nOccupied rooms: " + totalOccupied +
                                    "\nVacant rooms: " + vacantRooms +
                                    "\nOccupancy rate: " + OccupancyRate);
                                    
             
      }//end main
}//end class       
                    
                    
            
          