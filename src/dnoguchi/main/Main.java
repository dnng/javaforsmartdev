package dnoguchi.main;

import dnoguchi.cointoss.Coin;
import dnoguchi.parkingticket.ParkedCar;
import dnoguchi.parkingticket.ParkingMeter;
import dnoguchi.parkingticket.PoliceOfficer;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        List<String> programList = Arrays.asList("coin", "parking");

        /*
         * Simulate for..else python loop
         */
        select: {
            for(String program: programList) {
                if (args[0].equals(program)) {
                    call(program);
                    break select;
                }
            }
            System.out.println("Please specify a valid program name");
        }

        /*
         * Force parking call for testing purposes
         */
        Parking();
    }

    public static void call(String program) {
        if (program.equals("coin")) {
            Coin();
        } else if (program.equals("parking")) {
            Parking();
        }
    }

    public static void Coin() {
        Coin coin = new Coin();
        int headcount = 0;

        System.out.println("Initial coin toss value is: " + coin.getSideUp());

        for (int i = 0; i < 20; i++) {
            coin.toss();
            if (coin.getSideUp().equals("heads")) {
                headcount++;
            }

            System.out.println("New toss: " + coin.getSideUp());
        }

        System.out.println("Total heads count: " + headcount);
        System.out.println("Total tails count: " + (20 - headcount));

    }

    public static void Parking() {
        /*
         * 1) Create two parked cars
         * 2) Make the Police officer check both of them and issue one ticket
         */
        ParkedCar car1 = new ParkedCar("Chevrolet", "Cobra", "blue", "123456", 1);
        ParkedCar car2 = new ParkedCar("Tesla", "S1", "black", "3141592", 200);

        PoliceOfficer officer = new PoliceOfficer("Danny", 1337);

        officer.examineParking(car1);
        officer.examineParking(car2);

        try {
            TimeUnit.MINUTES.sleep(2);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        officer.examineParking(car1);
    }

}
