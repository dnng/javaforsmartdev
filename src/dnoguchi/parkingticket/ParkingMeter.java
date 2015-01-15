package dnoguchi.parkingticket;

import java.sql.Time;

/**
 * Created by dnoguchi on 1/15/15.
 */
public class ParkingMeter {
    private int purchasedTime;

    public ParkingMeter() {
    }

    public void setPurchasedTime(int purchasedTime) {
        this.purchasedTime = purchasedTime;
    }

    public int getPurchasedTime() {
        return purchasedTime;
    }
}
