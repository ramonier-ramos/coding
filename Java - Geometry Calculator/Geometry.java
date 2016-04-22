// Chapter 8, Programming Challenge 9: Geometry class

public class Geometry
{
   // The circleArea method calculates the area of a circle.
   public static double circleArea(double r)
   {
      return Math.PI * r * r;
   }

   // The rectangleArea method calculates the area of a rectangle.
   public static double rectangleArea(double len, double w)
   {
      return len * w;
   }
   
   // The triangleArea method calculates the area of a triangle.
   public static double triangleArea(double base, double h)
   {
      return base * h * 0.5;
   }
}