package driver;

import transport.Car;
import transport.Truck;

public class DriverC extends Driver<Truck> {

    public DriverC(String fullName,  int drivingExperience, Truck car) {
        super(fullName, "C", drivingExperience, car);
    }
}