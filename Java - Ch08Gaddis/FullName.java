// This class stores a person's first, last, and middle names. The class is dangerous 
// because it does not prevent operations on null reference fields.

public class FullName
{
   private String lastName;    // Last name
   private String firstName;   // First name
   private String middleName;  // Middle name

   // This method sets the lastName field.
   public void setLastName(String str)
   {
      lastName = str;
   }

   // This method sets the firstName field.
   public void setFirstName(String str)
   {
      firstName = str;
   }

   // This method sets the middleName field.
   public void setMiddleName(String str)
   {
      middleName = str;
   }

   // This method returns the length of the full name. 
   public int getLength()
   {
      return lastName.length() + firstName.length() + middleName.length();
   }

   // This method returns the full name.
   public String toString()
   {
      return firstName + " " + middleName + " "  + lastName;
   }
}
