

/**
 * A car has a certain fuel efficiency and a certain amount of fuel in the gas tank. Tha car can be driven a certain distance.
 * 
 * @author Anusha Anumakonda
 * @version 10 September 2015
 */
public class Car
{
    /** fuel efficiency of the car miles per gallon (mpg) */
    private double fuelEfficiency;
    
    /** amount of fuel left in tank in gallons */
    private double fuelInTank;
    

    /**
     * Constructor for objects of classs Car that specifies the fuel efficiency
     */
    public Car(double fuelEfficiency)
    {
        this.fuelEfficiency = fuelEfficiency;
        /*this.lkasdjflkas works like self in python*/
        this.fuelInTank = 0;
    }

    /**
     * Simulates driving the car the specified distance and reduces the amount of fuel in the tank.   
     *
     * @pre    specified distance cannot result in the consumption of more gas than is available
     * 
     * 
     * @param   distance      distance that the car drives in miles
     * 
     */
    public void drive(double distance)
    {
        this.fuelInTank -= distance / this.fuelEfficiency;
    }
    

    /**
     * Returns the amount of gas in the car's tank in units of gallons
    
     * @return the amount of gas in the car's tank in units of gallons
     */
    public double getGasInTank()
    {
        // put your code here
        return this.fuelInTank;
    }
    

    /**
     * Increments the fuel in the car's tank by the specified amount in gallons
     * @pre     gallonsOfGas must be a positive number
     * @param   gallonsOfGas   description of parameter y

     */
    public void addGas(double gallonsOfGas)
    {
        this.fuelInTank += gallonsOfGas;
        
    }



}
