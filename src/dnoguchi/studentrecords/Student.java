package dnoguchi.studentrecords;

public class Student {
    private int SID;
    private int scores[] = new int[5];

    public Student() {
    }

    public int getSID() {
        return SID;
    }

    public void setSID(int SID) {
        this.SID = SID;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }
}
