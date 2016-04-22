// This program passes an object as an argument.

public class PassObject
{
   public static void main(String[] args)
   {
      // Create a Rectangle object
      Rectangle box = new Rectangle(12.0, 5.0);

      // Pass a reference to the object to the displayRectangle method
      displayRectangle(box);
   }

   // This method displays the length and width of a rectangle.
   public static void displayRectangle(Rectangle r)
   {
      // Display the length and width
      System.out.println("Length : " + r.getLength() +
                         " Width : " + r.getWidth());
   }
}
