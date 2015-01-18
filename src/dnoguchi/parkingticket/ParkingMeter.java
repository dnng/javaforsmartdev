package dnoguchi.parkingticket;

public class ParkingMeter {
    private long purchasedTime;

    public ParkingMeter(long purchasedTime) {
        this.purchasedTime = purchasedTime;
    }

    public void setPurchasedTime(long purchasedTime) {
        this.purchasedTime = purchasedTime;
    }

    public long getPurchasedTime() {
        return purchasedTime;
    }
}
