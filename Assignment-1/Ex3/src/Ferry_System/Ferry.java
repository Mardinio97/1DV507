package Ferry_System;
import java.util.*;
/**
 * A class implements from Ferry_Inter (Interface class) to fix all the functions for the ferry system.
 *  @author Khalil Mardini
 *  @version 1.0
 *  @since 2020-07-11
 */
public class Ferry implements Ferry_Interface {
    private int number_Vehicles;
    private int number_passengers;
    private int fees;
    private final int max_number_Vehicles;
    private final int max_number_passengers;
    private ArrayList<Vehicle> vehicles_arrayLis = new ArrayList<>();
    private ArrayList<Passenger> passenger_arrayLis = new ArrayList<>();
    private Vehicle[] getAllVehicles;
    /**
     * Instantiates a new Ferry.
     */
    public Ferry() {
        number_Vehicles = 0;
        number_passengers = 0;
        fees = 0;
        max_number_Vehicles = 40;
        max_number_passengers = 200;
    }
    @Override
    public int countPassengers() {
        return number_passengers;
    }
    @Override
    public int countVehicleSpace() {
        return number_Vehicles;
    }
    @Override
    public int countMoney() {
        return fees;
    }
    @Override
    public Vehicle[] getAllVehicles() {
        Vehicle[] vehicles = new Vehicle[vehicles_arrayLis.size()];
        if (number_Vehicles == 0) {
            return null;
        } else {
            int n = 5;
            for (int i = 0; i < vehicles_arrayLis.size(); i++) {
                vehicles[i] = vehicles_arrayLis.get(i);
                vehicles[i].toString().replaceAll("@.*", "");
                System.out.println("vehicle " + (i + 1) + ": " + vehicles[i].toString().replaceAll("@.*", "").substring(13));
            }
            return vehicles;
        }
    }
    @Override
    public void embark(Vehicle v) {
        if ((hasSpaceFor(v))) {
            vehicles_arrayLis.add(v);
            if (check_dub_vehicles(vehicles_arrayLis)) {
                throw new RuntimeException("The same vehicle cannot embark twice");
            } else {
                number_passengers += v.getPass_on_board();
                number_Vehicles += v.getSpace();
                fees += v.getTotal_Cost();
                number_Vehicles++;
            }
        }
    }
    /**
     * Check for duplicate vehicle boolean.
     *
     * @param vehicles_arrayLis the vehicles array list
     * @return the boolean true if same vehicle will be added
     */
    public static boolean check_dub_vehicles(ArrayList<Vehicle> vehicles_arrayLis) {
        for (int i = 0; i < vehicles_arrayLis.size(); i++) {
            for (int j = 0; j < vehicles_arrayLis.size(); j++) {
                if (vehicles_arrayLis.get(i).toString().replaceAll(".+m", "").substring(1, 4).equals(vehicles_arrayLis.get(j).toString().replaceAll(".+m", "").substring(1, 4)) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public void embark(Passenger p) {
        if (hasRoomFor(p)) {
            passenger_arrayLis.add(p);
            number_passengers += p.getAmount();
            fees += p.getP_cost();
        }
    }
    @Override
    public void disembark() {
        vehicles_arrayLis.clear();
        passenger_arrayLis.clear();
        number_Vehicles = 0;
        number_passengers = 0;
    }
    @Override
    public boolean hasSpaceFor(Vehicle v) {
        return number_Vehicles + v.getSpace() <= max_number_Vehicles;
    }
    @Override
    public boolean hasRoomFor(Passenger p) {
        return number_passengers <= max_number_passengers;
    }
    @Override
    public String toString() {
        String toString =
                "Total Passengers on board: " + countPassengers() + "\n" +
                        "Total Vehicle Space on board: " + countVehicleSpace() + "\n" + "Money: " + countMoney();
        return toString;
    }
}
