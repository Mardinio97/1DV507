package Ferry_System;
/**
 * interface with all the functions that make the ferry be ready to disembark.
 *
 * @author Khalil Mardini
 * @version 1.0
 * @since 2020-07-11
 */
public interface Ferry_Interface {
    /**
     * Count Number of passengers on board
     *
     * @return Number of passengers on board
     */
    int countPassengers();
    /**
     * Count Correctly rounded off vehicle space
     *
     * @return Correctly rounded off vehicle space. One car is 1
     */
    int countVehicleSpace();
    /**
     * counting Money
     *
     * @return Earned money
     */
    int countMoney();
    /**
     * Array containing all embarked vehicles
     *
     * @return An array containing all embarked vehicles
     */
    Vehicle[] getAllVehicles();
    /**
     * Embark vehicle, exception if not enough space
     *
     * @param v Vehicle to be added
     */
    void embark(Vehicle v);
    /**
     * Embark passenger, exception if not enough room
     *
     * @param p Passenger to be added
     */
    void embark(Passenger p);
    /**
     * Clear (empty) ferry. The money earned remains,
     */
    void disembark();
    /**
     * Checking if there is space for new Vehicle
     *
     * @param v Vehicle to be added
     * @return true if we can embark vehicle v
     */
    boolean hasSpaceFor(Vehicle v);
    /**
     * Checking if there is space for new passenger
     *
     * @param p Passenger to be added
     * @return true if we can embark passenger p
     */
    boolean hasRoomFor(Passenger p);
    /**
     * Nice looking ferry status print out
     *
     * @return Nice looking ferry status print out
     */
    String toString();
}