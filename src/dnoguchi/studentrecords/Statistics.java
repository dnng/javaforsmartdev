package dnoguchi.studentrecords;

import java.util.ArrayList;
import java.util.List;

public class Statistics {
    int lowScores[] = { 9999, 9999, 9999, 9999, 9999 };
    int highScores[] = { 0, 0, 0, 0, 0 };
    int avgScores[] = { 0, 0, 0, 0, 0 };

    public int[] findlow(ArrayList<Student> students){
        for (Student student: students) {
            int currentScore[] = student.getScores();
            for (int i = 0; i < lowScores.length; i++) {
                if (lowScores[i] > currentScore[i]) {
                    lowScores[i] = currentScore[i];
                }
            }
        }
        return lowScores;
    }

    public int[] findhigh(Student [] students){
        for (Student student: students) {
            int currentScore[] = student.getScores();
            for (int i = 0; i < highScores.length; i++) {
                if (highScores[i] > currentScore[i]) {
                    highScores[i] = currentScore[i];
                }
            }
        }
        return highScores;
    }

    public void findavg(Student [] students){
    }

}
