// This program creates a FullName object, and then calls the object's
// getLength method AFTER values are established for its reference fields. 
// As a result, this program will work correctly.

public class NameTester2
{
   public static void main(String[] args)
   {
      int len;  // To hold the name length
      
      // Create a FullName object
      FullName name = new FullName();

		//Set values for object's data fields
		name.setFirstName("John");
		name.setMiddleName("Lee");
		name.setLastName("Smith");

      // Get the length of the full name
      len = name.getLength();
		
		// Display length of the full name
		System.out.println("The length of the full name is: " + len);
   }
}
