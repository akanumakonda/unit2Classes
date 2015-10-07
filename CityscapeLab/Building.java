import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Rectangle;
import java.awt.Color;


/**
 * Write a description of class Building here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    private int inwidth;
    private int inheight;

    /**
     * Default constructor for objects of class Building
     */
    public Building(int x, int y, int width, int height )
    {
        // initialise instance variables
        this.xLeft = x;
        this.yTop = y;
        this.inwidth = width;
        this.inheight = height;
        
    }

    /**
     * An example of a method - Draws a Building
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
        Rectangle tower = new Rectangle(xLeft,yTop, inwidth, inheight);
        g2.draw(tower);
        g2.setColor(Color.DARK_GRAY);
        g2.fill(tower);
        int counter = inheight;
        int numwindow = 32;
        
        while (counter > 100)
        {
            {
            counter -= 40;
            Rectangle window1 = new Rectangle( xLeft + 10, yTop + numwindow, 20, 20);
            Rectangle window2 = new Rectangle( xLeft + 40, yTop + numwindow, 20, 20);
            g2.draw(window1);
            g2.draw(window2);
            g2.setColor(Color.LIGHT_GRAY);
            g2.fill(window1);
            g2.fill(window2);
            numwindow += 40;
        }
        }


    }

}
