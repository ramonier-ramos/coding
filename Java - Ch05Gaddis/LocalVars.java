// This program demonstrates that two methods may have
// local variables with the same name.

public class LocalVars
{
   public static void main(String[] args)
   {
      texas();
      california();
   }
   
   // The texas method has a local variable named birds.
   public static void texas()
   {
      int birds = 5000;
      
      System.out.println("In Texas are " + birds + " birds.");
   }
   
   // The california method also has a local variable named birds.
   public static void california()
   {
      int birds = 3500;

      System.out.println("In California are " + birds + " birds.");
   }
}
