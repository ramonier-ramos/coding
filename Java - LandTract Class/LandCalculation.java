//Chapter 2 - Programming Challenge #7
public class LandCalculation
{
   public static void main(String[] args)
   {
      //Declare constant and variables, and assign known values
      final int FEET_PER_ACRE = 43560; //Number of square feet per acre
      double tract = 389767; //Square feet in a particular tract
      double acres;       //Number of acres
      
      //Calculate number of acres
      acres = tract / FEET_PER_ACRE;
      
      //Display results
      System.out.println("A tract of land with " + tract + " square feet has " + 
                        acres + " acres.");
   }
}                       