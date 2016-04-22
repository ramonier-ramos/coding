// Ch.4 Practice Problem #1
//Filename: Gradebook
//Programmer: Ramonier Ramos
//To modify gradebook to implement course name and instructor name
using System;

public class GradeBook
{ 
    //auto-implemented property CourseName implicitly
    //Creates an instance variable for course name
    public string CourseName {get; set;}

    //auto-implement property  InstructorName implicitly
    //creates an instance variable for instructor name
    public string InstructorName {get; set;}

    //Constructor initializes automatic properties
    //CourseName with string supplied as argument
    //InstructorName with string supplied as argument
    public GradeBook(string course, string instructor)
    {
        CourseName = course; //Set CourseName to course
        InstructorName = instructor;//Set InstructorName to instructor
    }//end constructor

    //Display a welcome message to the GradeBook user
    public void DisplayMessage()
    {
        // use automatic properties CourseName and InstructorName to get the
        // name of the course and the name of the instructor that this GradeBook represents
        Console.WriteLine("Welcome to the gradebook for\n{0}!", CourseName);
        Console.WriteLine("This course is taught by: {0}", InstructorName);

    }//end method DisplayMessage
    
}//end class GradeBook

