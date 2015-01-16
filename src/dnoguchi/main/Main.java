package dnoguchi.main;

import dnoguchi.cointoss.Coin;
import dnoguchi.parkingticket.ParkingMeter;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void call(String program) {
        if (program.equals("coin")) {
            Coin();
        } else if (program.equals("parking")) {
            Parking();
        } else {
            System.out.println("Please specify a valid program name");
        }
    }

    public static void main(String[] args) {
        List<String> programList = Arrays.asList("coin", "parking");

        for(String program: programList) {
            if (args[0].equals(program)) {
                call(program);
            }
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
    }

}
