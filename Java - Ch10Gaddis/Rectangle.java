public class Rectangle
{
   private double length;
   private double width;

   // Constructor.
   public Rectangle(double len, double w)
   {
      length = len;
      width = w;
   }

   // This method stores a value in the length field.
   public void setLength(double len)
   {
      length = len;
   }

   // This method stores a value in the width field.
   public void setWidth(double w)
   {
        width = w;
   }

   // This method returns a Rectangle object's length.
   public double getLength()
   {
      return length;
   }

   // This method returns a Rectangle object's width.
   public double getWidth()
   {
      return width;
   }

   // This method returns a Rectangle object's area.
   public double getArea()
   {
      return length * width;
   }
}
