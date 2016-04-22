// Chapter 6, Programming Challenge 2: CarDemo Class

public class CarDemo
{
   public static void main(String[] args)
   {
      // Create a new instance of the Car class
      Car sportsCar = new Car(2009, "Porsche");
      
      // Display the current status of car object
      System.out.println("Current status of the car:");
      System.out.println("Year model: " + sportsCar.getYearModel());
      System.out.println("Make: " + sportsCar.getMake());
      System.out.println("Speed: " + sportsCar.getSpeed());
      
      // Accelerate the car five times
      System.out.println("\nAccelerating...");
      for (int count = 1; count <= 5; count++)
      {
         sportsCar.accelerate();
         System.out.println("Now the speed is " + sportsCar.getSpeed());
      }
      
      // Brake the car five times
      System.out.println("\nBraking...");
      for (int count = 1; count <= 5; count++)
      {
         sportsCar.brake();
         System.out.println("Now the speed is " + sportsCar.getSpeed());
      }

   }
}
