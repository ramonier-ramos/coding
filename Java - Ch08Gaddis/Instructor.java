// This class stores data about an instructor.

public class Instructor
{
   private String lastName;      // Last name   
   private String firstName;     // First name
   private String officeNumber;  // Office number

   // This constructor initializes the last name, first name, and office number.
   public Instructor(String lname, String fname, String office)
   {
      lastName = lname;
      firstName = fname;
      officeNumber = office;
   }

   // This copy constructor initializes the object as a copy of another Instructor object.
   public Instructor(Instructor object2)
   {
      lastName = object2.lastName;
      firstName = object2.firstName;
      officeNumber = object2.officeNumber;
   }

   // This method sets a value for each field.
   public void set(String lname, String fname, String office)
   {
      lastName = lname;
      firstName = fname;
      officeNumber = office;
   }
   
   // This method returns a string containing the instructor information.
   public String toString()
   {
      // Create a string representing the object
      String str = "Last Name: " + lastName +
                   "\nFirst Name: " + firstName +
                   "\nOffice Number: " + officeNumber;

      // Return the string
      return str;
   }
}
