// This program can't find its variable.
// (The variable is referenced in code before it is declared.)
// (Note the error message received when attempting to compile.)

public class Scope
{
   public static void main(String[] args)
   {
      System.out.println(value);  // ERROR!
      int value = 100;
   }
}


