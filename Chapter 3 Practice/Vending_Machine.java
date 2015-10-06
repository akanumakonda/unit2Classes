

/**
 * Virtual version of a Vending Machine; holds soda, and gives customer soda.
 * 
 * @author Anusha Anumakonda 
 * @version 9/21/15
 */
public class Vending_Machine
{
    /** description of instance variable x (add comment for each instance variable) */
    private int cansInside;
    private int token;
    

    /**
     * Default constructor for objects of class Vending_Machine
     */
    public Vending_Machine(int initial_soda)
    {
        // initialise instance variables
        this.cansInside = initial_soda;
        this.token = 0;
       
    }
        /**
     * Default constructor for objects of class Vending_Machine
     */
    public Vending_Machine()
    {
        // initialise instance variables
        this.cansInside = 10;
        this.token = 0;
       
    }

    /**
     * An example of a method - add more cans to the vending machine
     *
     * @pre        number of cans inside vending maching cannot exceed 100 cans
     * 
     * @post    adds the number of cans given to the number of cans already in the vending machine 
     * 
     * @param    cans    Number of cans that are to be added
     * 
     */
    public void fillUp(int cans)
    {
        // put your code here
        this.cansInside += cans ;
    }



    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @post   returns the number of tokens inside the vending machine
     * 

     * @return token Number of tokens inside the vending machine
     */
    public int getTokenCount()
    {
        // put your code here
        return this.token;
    }



    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @post    returns the number of cans inside the vending machine
     * 
     * @return cansInside  Number of cans inside the vending machine
     */
    public int getCanCount()
    {
        // put your code here
        return this.cansInside;
    }



    /**
     * An example of a method - Gives the customer one soda for every token that they insert
     *
     * @pre     The number of tokens that are given are less than or equal to the number of sodas in the vending machine
     * 
     * @post    The number of cans in the vending machine will decrease by the amount of tokens given
     * 
     * @param   numToken   Number of tokens that the customer puts into the vending machine
     * 
     * @return cansInside  Number of Cans inside the vending machine after method runs
     */
    public int giveSoda(int numToken)
    {
        // put your code here
        this.token += numToken;
        this.cansInside -= numToken;
        return cansInside;
    }




}
