package Ferry_System;
import java.util.ArrayList;
/**
 * Class to setup Vehicle's information.
 * @author Khalil Mardini
 * @version 1.0
 * @since 2020-07-11
 */
public  abstract class Vehicle {
    private double space;
    private int total_Cost;
    /**
     * The Passenger array list.
     */
    ArrayList<Passenger> passengerArrayList = new ArrayList<>();
    /**
     * Instantiates a new Vehicle.
     *
     * @param space              the space of each vehicle
     * @param cost_pass          the cost for each  pass
     * @param cost_Vehicle       the cost  for each vehicle
     * @param passengerArrayList the passenger array list
     */
    public Vehicle(double space, int cost_pass, int cost_Vehicle, ArrayList<Passenger> passengerArrayList) {
        if (passengerArrayList.size() > 0) {
            for (int i = 0; i < passengerArrayList.size(); i++) {
                this.passengerArrayList.add(passengerArrayList.get(i));
            }
            this.space = space;
            this.total_Cost = setFee(cost_Vehicle, cost_pass);
        }
    }
    /**
     * Gets passengers on board.
     *
     * @return the passengers on board
     */
    public int getPass_on_board() {
        return passengerArrayList.size();
    }
    /**
     * Gets Correctly rounded of vehicle space
     *
     * @return the space
     */
    public double getSpace() {
        return space;
    }
    /**
     * Set fee for each vehicle and passenger.
     *
     * @param a the a Representing the cost of each  vehicle
     * @param b the b the a Representing the cost of each vehicle passenger
     * @return the int
     */
    public int setFee(int a, int b){
        return a + (b *this.passengerArrayList.size());
    }
    /**
     * Gets total cost.
     *
     * @return the total cost
     */
    public int getTotal_Cost() {
        return total_Cost;
    }
}
