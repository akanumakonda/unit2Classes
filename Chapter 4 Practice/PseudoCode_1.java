import java.util.Scanner;

/**
 * Write a description of class PseudoCode_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PseudoCode_1
{
 
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a ten-digit phone number");
        String phoneNum = s.next();
        String sub1 = phoneNum.substring(0,3);
        String sub2 = phoneNum.substring(3,6);
        String sub3 = phoneNum.substring(6, 10);
        String whole = "(" + sub1 + ") " + sub2 + "-" + sub3;
        System.out.println(whole);
        
    }

}
