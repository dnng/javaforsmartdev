package dnoguchi.cointoss;

public class Coin {

    private String sideUp;

    public Coin() {
        toss();
    }

    public void toss(){
        if (Math.random() > 0.5) {
            this.sideUp = "heads";
        } else {
            this.sideUp = "tails";
        }
    }

    public String getSideUp() {
        return this.sideUp;
    }
}
