// Rectangle class, Phase 4.
// Under construction!

public class Rectangle
{
   private double length;
   private double width;

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
