package driver;

import transport.Bus;

public class DriveD extends Driver<Bus> {

    public DriveD(String fullName, int drivingExperience, Bus car) {
        super(fullName, "D", drivingExperience, car);
    }
}