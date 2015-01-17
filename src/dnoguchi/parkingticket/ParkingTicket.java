package dnoguchi.parkingticket;

import java.util.List;

/**
 * Created by dnoguchi on 1/15/15.
 */
public class ParkingTicket {

    public ParkingTicket() {
    }

    public ParkedCar reportParkedCar(ParkedCar car) {
        return car;
    }

    public int reportFine(ParkedCar car) {
        return 25 + (int)(10 * (car.getTimeParked() / 60));
    }

    public String reportPoliceOfficer(String name, int badgeNumber) {
        return "Police Officer info: " + name + " , " + badgeNumber;
    }
}
