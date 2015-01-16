package dnoguchi.parkingticket;

/**
 * Created by dnoguchi on 1/15/15.
 */
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
