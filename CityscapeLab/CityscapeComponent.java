import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Scanner;


/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private String type;
    //     Building building1 = new Building(0,100, 100, 300);
    //     Building building2 = new Building(700, 100 , 100, 300);
    Sun sun = new Sun(500, 100);
   
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    public CityscapeComponent( String rivertype)
    {
        this.type = rivertype;
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        Building building1 = new Building(0,100, 100, 300);
        Building building2 = new Building(700, 100 , 100, 300);
        Sun sun = new Sun(500, 100);
        building1.draw(g2);
        building2.draw(g2);
        River river = new River ( 0, 350 , 800, 300, type);
        river.draw(g2);
        sun.draw(g2);
        // invoke the draw method on each object in your Cityscape
        // ...
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        sun.move();
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
