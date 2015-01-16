package dnoguchi.parkingticket;

public class PoliceOfficer {
    private String name;
    private int badgeNumber;

    public PoliceOfficer(String name, int badgeNumber) {
        this.name = name;
        this.badgeNumber = badgeNumber;
    }

    public void examineParking(ParkedCar car, PoliceOfficer officer) {
        if (car.getTimeParked() > car.getPurchasedTime()) {
            issueTicket(car, officer);
        }
    }

    public void issueTicket(ParkedCar car, PoliceOfficer officer) {
        ParkingTicket ticket = new ParkingTicket();
        ticket.reportParkedCar(car);
        ticket.reportFine(car);
        ticket.reportPoliceOfficer(officer);
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
