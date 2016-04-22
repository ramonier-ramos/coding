// Chapter 10, Programming Challenge 7: Customer Class

public class Customer extends Person
{
   private String customerNumber; // Customer number
   private boolean mailingList;   // Add to mailing list?

   // The no-arg constructor initializes the object with
   // empty strings for name, address, phone, and customerNumber. 
   // The mailingList field is set to false.
   public Customer()
   {
      super();
      customerNumber = "";
      mailingList = false;
   }

   // This constructor initializes the object with a name, address, 
   // phone number, customer number, and mailing list status.
   public Customer(String n, String a, String p, String c, boolean m)
   {
      super(n, a, p);
      customerNumber = c;
      mailingList = m;
   }

   // The setCustomerNumber method sets the customer number.
   public void setCustomerNumber(String c)
   {
      customerNumber = c;
   }

   // The setMailingList method sets the mailing list status.
   public void setMailingList(boolean m)
   {
      mailingList = m;
   }

   // The getCustomerNumber method returns the customer number.
   public String getCustomerNumber()
   {
      return customerNumber;
   }

   // The getMailingList method returns the mailing list status.
   public boolean getMailingList()
   {
      return mailingList;
   }
}