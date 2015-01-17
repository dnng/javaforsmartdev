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
        } else {
            System.out.println("Car " + car.getMake() + " " + car.getModel() +
                    "still has " + (car.getPurchasedTime() -
                    car.getTimeParked()) + "minutes left.");

        }
    }

    public void issueTicket(ParkedCar car) {
        ParkingTicket ticket = new ParkingTicket();
        ticket.reportParkedCar(car);
        int fine = ticket.reportFine(car);
        String report = ticket.reportPoliceOfficer(this.name, this.badgeNumber);
        System.out.println(report + " " + fine);
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
