// Chapter 8, Programming Challenge 9: GeometryCalculator class

// NOTE: The instructions in the textbook imply that the data
// validation tests to check for negative values input by the user 
// should take place in the Geometry class.  But, it makes more
// sense to perform those validation tests in this class instead.

import java.util.Scanner;

public class GeometryCalculator
{
   public static void main(String[] args)
   {
      int choice; // The user's menu choice

      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      // Display the menu
      System.out.println("Geometry Calculator");
      System.out.println("1.  Calculate the Area of a Circle");
      System.out.println("2.  Calculate the Area of a Rectangle");
      System.out.println("3.  Calculate the Area of a Triangle");
      System.out.println("4.  Quit\n");
      System.out.print("Enter your choice (1-4) : ");
      
      // Get the user's selection
      choice = keyboard.nextInt();
      
      // Validate the selection
      while (choice < 1 || choice > 4)
      {
         System.out.print("Error: Enter 1, 2, 3, or 4: ");
         choice = keyboard.nextInt();
      }
      
      // Process user's menu selection
      switch(choice)
      {
         case 1 : circle();    // Call custom method
                  break;
         case 2 : rectangle(); // Call custom method
                  break;
         case 3 : triangle();  // Call custom method
                  break;
         case 4 : System.out.println("\nGoodbye!");
      }
   }

   // The circle method determines the area of a circle.
   public static void circle()
   {
      double radius; // The radius of the circle

      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      // Get the circle's radius
      System.out.print("\nWhat is the circle's radius? ");
      radius = keyboard.nextDouble();
      
      // Display the circle's area if radius is non-negative
      if (radius >= 0)
         System.out.println("\nThe circle's area is " + Geometry.circleArea(radius));
      else
         System.out.println("\nThe radius value cannot be negative.");
   }

   // The rectangle method determines the area of a rectangle.
   public static void rectangle()
   {
      double length; // The length of the rectangle
      double width;  // The width of the rectangle

      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      // Get the rectangle's length
      System.out.print("\nWhat is the rectangle's length? ");
      length = keyboard.nextDouble();
      
      // Get the rectangle's width
      System.out.print("What is the rectangle's width? ");
      width = keyboard.nextDouble();
      
      // Display the rectangle's area if length and width are both non-negative
      if (length >= 0 && width >= 0)
         System.out.println("\nThe rectangle's area is " + Geometry.rectangleArea(length, width));
      else
         System.out.println("\nNeither the length nor width values can be negative.");
   }

   // The triangle method determines the area of a triangle.
   public static void triangle()
   {
      double base;   // The triangle's base
      double height; // The triangle's height

      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      // Get the base of the trianlge
      System.out.print("\nWhat is the length of the triangle's base? ");
      base = keyboard.nextDouble();
      
      // Get the height of the triangle
      System.out.print("What is the triangle's height? ");
      height = keyboard.nextDouble();
      
      // Display the triangle's area if base and height are both non-negative
      if (base >= 0 && height >= 0)
         System.out.println("\nThe triangle's area is " + Geometry.triangleArea(base, height));
      else
         System.out.println("\nNeither the base nor height values can be negative.");
   }
}