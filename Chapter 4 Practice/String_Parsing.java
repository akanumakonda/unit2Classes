import java.util.Scanner;

/**
 * Write a description of class Sting_Parsing here.
 * 
 * @author (Anusha Anumakonda) 
 * @version (9/30/15)
 */
public class String_Parsing
{

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public static void main(String[] args)
    {
        // put your code here
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer between 1,000 and 999,999: ");
        String num = s.next();
        int length = num.length();
        int numsub = length - 3;
        String sub1 = num.substring(0,(numsub-1));
        String sub2 = num.substring((numsub), length);
        String whole = sub1 + sub2;
        System.out.println(whole);
    }

}
