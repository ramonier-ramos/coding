//Ch. 4 Programming Problem #2
//Filename: GradebookTest.cs
//To test the Gradebook class and display the message in the methods
using System;

public class GradebookTest
{
    //Main method begins program execution
    public static void Main(string[] args)
    {

        //Create GradeBook object
        GradeBook gradebook1 = new GradeBook("ISM4234 Object-oriented development", "Sam Smith");

        //Call Display message method
        gradebook1.DisplayMessage();

        //Test auto-implemented property InstructorName
        Console.WriteLine("\nChanging instructor name to W.Whitlock.\n");
        gradebook1.InstructorName = "W.Whitlock";

        //Call method display message to display changed method
        gradebook1.DisplayMessage();

        //end method
    }

}//end class GradebookTest


