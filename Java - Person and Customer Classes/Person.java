// Chapter 10, Programming Challenge 7: Person class

public class Person
{
   private String name;    // Person name
   private String address; // Person address
   private String phone;   // Person phone number

   // The no-arg constructor initializes the object with
   // empty strings for name, address, and phone.
   public Person()
   {
      name = "";
      address = "";
      phone = "";
   }

   // This constructor initializes the object with
   // a name, address, and a phone number.
   public Person(String n, String a, String p)
   {
      name = n;
      address = a;
      phone = p;
   }

   // The setName method sets the name field.
   public void setName(String n)
   {
      name = n;
   }

   // The setAddress method sets the address field.
   public void setAddress(String a)
   {
      address = a;
   }

   // The setPhone method sets the phone field.
   public void setPhone(String p)
   {
      phone = p;
   }

   // The getName method returns the name field.
   public String getName()
   {
      return name;
   }

   // The getAddress method returns the address field.
   public String getAddress()
   {
      return address;
   }

   // The getPhone method returns the phone field.
   public String getPhone()
   {
      return phone;
   }
}