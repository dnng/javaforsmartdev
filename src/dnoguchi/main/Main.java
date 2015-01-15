package dnoguchi.main;

import dnoguchi.cointoss.Coin;

public class Main {

    public static void main(String[] args) {
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
}
