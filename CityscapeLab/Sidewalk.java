import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Rectangle;
import java.awt.Color;


/**
 * Write a description of class Sidewalk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sidewalk
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    private int inwidth;
    private int inheight;

    /**
     * Default constructor for objects of class Sidewalk
     */
    public Sidewalk(int x, int y, int width, int height)
    {
        // initialise instance variables
        this.xLeft = x;
        this.yTop = y;
        this.inwidth = width;
        this.inheight = height;
    }

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
    public void draw(Graphics2D g2)
    {
        // put your code here
        Rectangle river = new Rectangle( xLeft, yTop, inwidth, inheight);
        g2.draw(river);
        g2.setColor(Color.BLUE);
        g2.fill(river);
    }

}
