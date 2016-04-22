// This class stores data about a textbook.

public class TextBook
{
   private String title;      // Title of the book
   private String author;     // Author's last name
   private String publisher;  // Name of publisher

   // This constructor initializes the title, author, and publisher.
   public TextBook(String textTitle, String auth, String pub)
   {
      title = textTitle;
      author = auth;
      publisher = pub;
   }

   // This copy constructor initializes the object as a copy of another TextBook object.
   public TextBook(TextBook object2)
   {
      title = object2.title;
      author = object2.author;
      publisher = object2.publisher;
   }

   // This method sets a value for each field.
   public void set(String textTitle, String auth, String pub)
   {
      title = textTitle;
      author = auth;
      publisher = pub;
   }

   // This method returns a string containing the textbook information.
   public String toString()
   {
      // Create a string representing the object
      String str = "Title: " + title +
                   "\nAuthor: " + author +
                   "\nPublisher: " + publisher;

      // Return the string
      return str;
   }
}