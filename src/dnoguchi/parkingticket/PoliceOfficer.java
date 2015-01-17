package dnoguchi.parkingticket;

public class PoliceOfficer {
    private String name;
    private int badgeNumber;

    public PoliceOfficer(String name, int badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    public void examineParking(ParkedCar car) {
        if (car.getTimeParked() > car.getPurchasedTime()) {
            issueTicket(car);
        }
    }

    public void issueTicket(ParkedCar car) {
        ParkingTicket ticket = new ParkingTicket();
        ticket.reportParkedCar(car);
        ticket.reportFine(car);
        ticket.reportPoliceOfficer(this.name, this.badgeNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }
}
