package Ferry_System;
/**
 * Class with main method to test all the functions
 * @author Khalil Mardini
 * @version 1.0
 * @since 2020-07-11
 */
public class FerryMain {
    /**
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        Ferry ferry = new Ferry();
        Car car = new Car(4);
        Car car2 = new Car(4);
        Bus bus = new Bus(20);
        Lorry lorry = new Lorry(2);
        Passenger p = new Passenger();
        Bicycle bicycle = new Bicycle();
        ferry.embark(car);
        ferry.embark(bus);
        ferry.embark(p);
        ferry.embark(bicycle);
        ferry.embark(lorry);
        System.out.println(ferry.toString()+"\n");
        ferry.getAllVehicles();
        System.out.println("\n"+"Ferry disembarking......");
        ferry.disembark();
        System.out.println(ferry.toString());

    }
}
