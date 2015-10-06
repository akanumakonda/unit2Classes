

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the methods in vending machine class.
 * 
 * @Anusha Anumakonda  
 * @9/22/15
 */
public class Vending_MachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class Vending_MachineTest
     */
    public Vending_MachineTest()
    {
        // initialise instance variables
        
        
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test 
    public void testfillUp()
    {
        Vending_Machine vend = new Vending_Machine(50, 0);
        vend.fillUp(2);
        assertEquals(52, vend.getCanCount(), 1e-6);
    }
    @Test 
    public void testgiveSoda()
    {
        Vending_Machine vend = new Vending_Machine(50, 0);
        assertEquals( 50, vend.getCanCount(), 1e-6);
        assertEquals (0, vend.getTokenCount(), 1e-6);
        vend.giveSoda(2);
        assertEquals(48, vend.getCanCount(), 1e-6);
        assertEquals(2, vend.getTokenCount(), 1e-6);
    }
  
        
   
    

}
