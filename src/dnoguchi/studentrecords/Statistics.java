package dnoguchi.studentrecords;

import java.util.ArrayList;
import java.util.List;

public class Statistics {
    List<Integer> lowscores  = new ArrayList<Integer>();
    List<Integer> highscores = new ArrayList<Integer>();
    List<Float> avgscores    = new ArrayList<Float>();

    public List<Integer> findlow(ArrayList<Student> students){
        int currentScore = 9999;
        for (Student student: students) {
            for (int score: student.getScores()) {
                if (score < currentScore) {
                    currentScore = score;
                }
            }
            lowscores.add(currentScore);
        }
        return lowscores;
    }

    public List<Integer> findhigh(Student [] students){
        int currentScore = 0;
        for (Student student: students) {
            for (int score: student.getScores()) {
                if (score > currentScore) {
                    currentScore = score;
                }
            }
            highscores.add(currentScore);
        }
        return highscores;
    }

    public void findavg(Student [] students){
    }

}
