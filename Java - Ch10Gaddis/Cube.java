// This class holds data about a cube.

public class Cube extends Rectangle
{
   private double height;  // The cube's height

   // The constructor sets the cube's length, width, and height.
   public Cube(double len, double w, double h)
   {
      // Call the superclass constructor
      super(len, w);
      
      // Set the height
      height = h;
   }

   // This method returns the cube's height.
   public double getHeight()
   {
      return height;
   }

   // This method calculates and returns the cube's surface area.
   public double getSurfaceArea()
   {
      return getArea() * 6;
   }

   // This method calculates and returns the cube's volume.
   public double getVolume()
   {
      return getArea() * height;
   }
}
