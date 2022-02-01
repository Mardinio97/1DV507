package Ferry_System;
import java.util.ArrayList;
/**
 * Class extends from Vehicle class to register a new Bicycle.
 * @author Khalil Mardini
 * @version 1.0
 * @since 2020 -07-11
 */
public class Bicycle extends Vehicle{
    private final static int cost_vehicle = 40;
    private final static int cost_pass = 0;
    private final static double space = 0.2;
    private  static ArrayList<Passenger> passengerArrayList = new ArrayList<>();
    /**
     * Instantiates a new Bicycle.
     */
    public Bicycle() {
        super(space,cost_pass,cost_vehicle,getPassengerArrayList());
    }
    /**
     * Gets passenger array list.
     *
     * @return the passenger array list
     */
    public static  ArrayList<Passenger> getPassengerArrayList() {
        Passenger p = new Passenger();
        passengerArrayList.add(p);
        return passengerArrayList;
    }
}
