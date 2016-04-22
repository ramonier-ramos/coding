// This class stores data about a course.

public class Course
{
   private String courseName;      // Name of the course
   private Instructor instructor;  // The instructor
   private TextBook textBook;      // The textbook

   // This constructor initializes the courseName, instructor, and textBook.
   public Course(String name, Instructor instr, TextBook text)
   {
      // Assign the courseName
      courseName = name;

      // Create a new Instructor object, passing instr as an argument 
		// to the copy constructor
      instructor = new Instructor(instr);

      // Create a new TextBook object, passing text as an argument 
		// to the copy constructor
      textBook = new TextBook(text);
   }

   // This method returns the name of the course.
   public String getName()
   {
      return courseName;
   }

   // This method returns a reference to a copy of this course's Instructor object.
   public Instructor getInstructor()
   {
      // Return a copy of the instructor object
      return new Instructor(instructor);
   }

   // This method returns a reference to a copy of this course's TextBook object.
   public TextBook getTextBook()
   {
      // Return a copy of the textBook object
      return new TextBook(textBook);
   }

   // This method returns a string containing the course information.
   public String toString()
   {
      // Create a string representing the object
      String str = "Course name: " + courseName +
                   "\nInstructor Information:\n" + instructor +
                   "\nTextbook Information:\n" + textBook;

      // Return the string
      return str;
   }
}
