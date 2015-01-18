package dnoguchi.parkingticket;

import java.util.List;

public class ParkingTicket {

    public ParkingTicket() {
    }

    public String reportParkedCar(ParkedCar car) {
        return "\tCar info:\n\t\tmodel: " + car.getModel() +
            "\n\t\tmake: " + car.getMake() +
            "\n\t\tcolor: " + car.getColor() +
            "\n\t\tlicense plate: " + car.getLicenseNumber() +
            "\n\t\tpurchased time: " + car.getPurchasedTime() +
            "\n\t\ttime parked " + car.getTimeParked();
    }

    public int reportFine(ParkedCar car) {
        return 25 + (int)(10 * (car.getTimeParked() / 60));
    }

    public String reportPoliceOfficer(String name, int badgeNumber) {
        return "Issuing ticket:\n\tOfficer: " + name + " , badge: " + badgeNumber;
    }
}
