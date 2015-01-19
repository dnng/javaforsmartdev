package dnoguchi.studentrecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Util {
    public static ArrayList<Student> readFile(String filename, ArrayList<Student> stu) {
        try {
            FileReader file = new FileReader("studentrecords.txt");
            BufferedReader buff = new BufferedReader(file);
            boolean eof = false;

            /* quick and dirty way to skip the first line */
            String line = buff.readLine();
            while (!eof) {

                /* dirty indexing of students array */
                int i = 0;

                line = buff.readLine();
                if (line == null)
                    eof = true;
                else {
                    /*
                     * Learning new types and Interfaces in Java, clean this mess after playing! :-P
                     *
                     * All this has to do is populate the Students Array with the records information.
                     */
                    StringTokenizer st = new StringTokenizer(line, " ");
                    String token = st.nextToken();
                    stu.get(i).setSID(Integer.parseInt(token));

                    ArrayList<Integer> scores = new ArrayList<Integer>();

                    while (st.hasMoreTokens()) {
                        scores.add(Integer.parseInt(st.nextToken()));
                    }

                    int [] bucket = new int[scores.size()];
                    Iterator<Integer> iterator = scores.iterator();
                    for (int idx = 0; idx < bucket.length; idx++) {
                        bucket[i] = iterator.next().intValue();
                    }
                    stu.get(i).setScores(bucket);
                }
                i++;
            }
            buff.close();
        } catch (IOException e) {
            System.out.println("Error -- " + e.toString());
        }

    }
}
