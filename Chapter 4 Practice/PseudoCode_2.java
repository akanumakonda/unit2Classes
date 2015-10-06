import java.util.Scanner;

/**
 * Write a description of class PseudoCode_2 here.
 * 
 * @author (Anusha Anumakonda) 
 * @version (10/1/15)
 */
public class PseudoCode_2
{
    
    public static void main(String[] args)
    {
        // put your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the amount due");
        double due = s.nextDouble();
        System.out.println("Please enter the amount recieved");
        double pay = s.nextDouble();
        double change =  (pay - due);
        int dollars = (int) change/ 1;
        change = change%1;
        int quarters = (int) (change/.25);
        change = change %.25;
        int dimes = (int) (change/.10);
        change = change% .10;
        int nickels = (int) (change /.05);
        change = change % .05;
        int pennies = (int) (change/.01);
        System.out.println(dollars  + " Dollars\n");
        System.out.println(quarters +" Quarters\n");
        System.out.println(dimes + " Dimes\n");
        System.out.println(nickels + " Nickels\n");
        System.out.println(pennies + " Pennies\n");
}
}
