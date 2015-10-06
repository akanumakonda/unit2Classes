
public class DistanceConverter
{
      public static final double feetInYard = 3;
      public static final double inchesInFeet = 12;
      //The magic numbers are made into constants, so that it would be clearer when revising 
   public static void main(String[] args)
   {
      final double yards = 3.5;
      double feet = feetInYard*yards ;
      //Make sure the 'Magic Number' names make sense- are significant
      double inches = feet*12;
      
      System.out.println(yards + " yards are " + feet + " feet");
      System.out.println(yards + " yards are " + inches + " inches");

    }
}