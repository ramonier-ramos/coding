// Chapter 8, Programming Challenge 4: LandTractDemo class

import java.util.Scanner;

public class LandTractDemo
{
   public static void main(String[] args)
   {
      double length; // Tract length input
      double width;  // Tract width input

      // Create Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      // Get dimensions of tract 1
      System.out.println("TRACT 1:");
      System.out.print("Enter the length of Tract 1: ");
      length = keyboard.nextDouble();
      System.out.print("Enter the width of Tract 1: ");
      width = keyboard.nextDouble();

      // Create LandTract object for tract 1
      LandTract tract1 = new LandTract(length, width);

      System.out.println(); // Blank line

      // Get dimensions of tract 2
      System.out.println("TRACT 2:");
      System.out.print("Enter the length of Tract 2: ");
      length = keyboard.nextDouble();
      System.out.print("Enter the width of Tract 2: ");
      width = keyboard.nextDouble();

      // Create LandTract object for tract 2
      LandTract tract2 = new LandTract(length, width);

      System.out.println(); // Blank line
     
      // Display the land tract data
      // (This utilizes the toString method of the LandTract class)
      System.out.println("TRACT 1:");
      System.out.println(tract1);

      System.out.println(); // Blank line
     
      System.out.println("TRACT 2:");
      System.out.println(tract2);
      
      // Determine whether the two tracts are equal
      // (This utilizes the equals method of the LandTract class)
      if (tract1.equals(tract2))
         System.out.println("\nThe tracts are the same dimensions.");
      else
         System.out.println("\nThe tracts are NOT the same dimensions.");
   }
}