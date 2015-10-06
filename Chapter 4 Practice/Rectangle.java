 import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class Rectangle here.
 * 
 * @author (Anusha Anumakonda) 
 * @version (9/30/15)
 */
public class Rectangle
{
    /** description of instance variable x (add comment for each instance variable) */
    public int height;
    public int width;

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
        System.out.println("Enter the length of the rectangle");
        double height = s.nextDouble();
        System.out.println("Enter the width of the rectangle");
        double width = s.nextDouble();
        double area =  height*width;
        double perimeter = (height+width)*2;
        double diagonal = Math.sqrt((height*height)+ (width*width));
        System.out.println("area: " + area + "\n Perimeter: " + perimeter + "\n Diagonal: " + diagonal);
    }

}
