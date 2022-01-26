package Ferry_System;
/**
 * Class to register a new Passenger
 * @author Khalil Mardini
 * @version 1.0
 * @since 2020-07-11
 */
public class Passenger {
    private  int p_cost ;
    /**
     * Instantiates a new Passenger.
     */
    public Passenger(){
        p_cost = 25;
    }
    /**
     * Get amount int.
     *
     * @return the int
     */
    public int getAmount(){
        return 1;
    }
    /**
     * Gets Passenger cost.
     *
     * @return (Integer) cost for one Passenger.
     */
    public int getP_cost() {
        return p_cost;
    }
}
