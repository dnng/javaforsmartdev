package dnoguchi.parkingticket;

import java.util.Date;

/**
 * Created by dnoguchi on 1/15/15.
 */
public class ParkedCar {
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private long timeParked;
    private Date dateCreated;
    private ParkingMeter purchasedTime;

    public ParkedCar(String make, String model, String color, String licenseNumber, int timeToPurchase) {
        dateCreated = new Date(); // sets to current date/time
        purchasedTime = new ParkingMeter(timeToPurchase);
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public long getTimeParked() {
        timeParked = dateCreated.getTime() / 60000; // milliseconds to minutes
        return timeParked;
    }

    public void setTimeParked(int timeParked) {
        this.timeParked = timeParked;
    }

    public void purchaseTime(int timeToBePurchased) {
        purchasedTime.setPurchasedTime(timeToBePurchased);
    }

    public long getPurchasedTime() {
        return purchasedTime.getPurchasedTime();
    }

}
