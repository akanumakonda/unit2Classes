import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

/**
 * A Target shape
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
       

    /**
     * Default constructor for objects of class Target
     */
    public Target(int x, int y)
    {
        // initialise instance variables
        this.xLeft  = x;
        this.yTop = y;
    }

    /**
     * Draws the car
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
        Ellipse2D.Double ring1 = new Ellipse2D.Double(this.xLeft, this.yTop, 250, 250);
        Ellipse2D.Double ring2 = new Ellipse2D.Double(this.xLeft - 25, this.yLeft - 25, 225, 225);
        Ellipse2D.Double ring3 = new Ellipse2D.Double(this.xLeft - 50, this.yLeft - 50, 200, 200);
        Ellipse2D.Double ring4 = new Ellipse2D.Double(this.xLeft - 75, this.yLeft - 75, 175, 175);
        Ellipse2D.Double ring5 = new Ellipse2D.Double(this.xLeft - 100, this.yLeft - 100, 150, 150);
        
        g2.setColor(ring1);
        g2.Fill(color.BLACK);
        g2.setColor(ring2);
        g2.Fill(color.White);
        g2.setColor(ring3);
        g2.Fill(Color.Black);
        g2.setColor(ring4);
        g2.Fill(Color.White);
        g2.setColor(ring5);
        g2.Fill(Color.Black);
    }

}
