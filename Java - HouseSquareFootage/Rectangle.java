// Programmer: Ramonier Ramos
// Filename: Rectangle.java
// Date: 99/99/9999
// Description: Calculates the area of a rectangle.

public class Rectangle
{
	// These are the private class fields
   private double length;
   private double width;

   // The constructor method is called each time an instance of the class is created.
   public Rectangle(double len, double w)
   {
      length = len;
      width = w;
   }

   // The setLength method stores a value in the length field.
   public void setLength(double len)
   {
      length = len;
   }

   // The setWidth method stores a value in the width field.
   public void setWidth(double w)
   {
      width = w;
   }

   // The getLength method returns a Rectangle object's length.
   public double getLength()
   {
      return length;
   }

   // The getWidth method returns a Rectangle object's width.
   public double getWidth()
   {
      return width;
   }

   // The getArea method returns a Rectangle object's area.
   public double getArea()
   {
      return length * width;
   }
}