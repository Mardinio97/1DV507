package Ferry_System;
import java.util.ArrayList;
/**
 * Class extends from Vehicle class to register a new Car.
 * @author Khalil Mardini
 * @version 1.0
 * @since 2020 -07-11
 */
public class Car extends Vehicle{
    private final static int cost_vehicle = 100;
    private final static int cost_pass = 20;
    private final static double space = 1;
    private final  static int max_pass = 4;
    private  static   ArrayList<Passenger> passengerArrayList = new ArrayList<>();
    /**
     * Instantiates a new Car.
     *
     * @param number_of_Passengers the number of passengers
     */
    public Car(int number_of_Passengers) {
        super(space,cost_pass,cost_vehicle,getPassengerArrayList(number_of_Passengers));
    }
    /**
     * Gets passenger array list.
     *
     * @param numberOffPass the number off pass
     * @return the passenger array list
     */
    public static  ArrayList<Passenger> getPassengerArrayList(int numberOffPass) {
        if (numberOffPass <= max_pass && numberOffPass > 0) {
            Passenger p = new Passenger();
            for (int i = 0; i < numberOffPass; i++) {
                passengerArrayList.add(p);
            }
        }
        else
        {
            throw new RuntimeException("Maximum number of passengers is 4");
        }
        return passengerArrayList;
    }
}
