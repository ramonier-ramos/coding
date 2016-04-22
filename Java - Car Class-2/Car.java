//	Chapter 6, Programming Challenge 2: Car Class

public class Car
{
   private int yearModel; // Car's year model
   private String make;	  // Car's make
   private int speed;	  // Car's current speed

   //	Constructor.
   Car(int y, String m)
   {
      yearModel = y;
      make = m;
      speed = 0;
   }

   //	The getYearModel method returns the car's	year model.
   public int getYearModel()
   {
      return yearModel;
   }

   //	The getMake method returns the car's make.
   public String getMake()
   {
      return make;
   }

   //	The getSpeed method returns the car's current speed.
   public int getSpeed()
   {
      return speed;
   }

   //	The accelerate method increases the car's	speed by 5 MPH.
   public void accelerate()
   {
      speed += 5;
   }

   //	The brake method decreases the car's speed by 5 MPH.
   public void brake()
   {
      speed -= 5;
   }
}
