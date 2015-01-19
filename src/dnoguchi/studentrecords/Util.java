package dnoguchi.studentrecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Util {
    public static ArrayList<Student> readFile(String filename, ArrayList<Student> stu) {
        try {
            FileReader file = new FileReader("studentrecords.txt");
            BufferedReader buff = new BufferedReader(file);
            boolean eof = false;
            while (!eof) {
                String line = buff.readLine();
                if (line == null)
                    eof = true;
                else {
                    StringTokenizer st = new StringTokenizer(line, " ");
                    while (st.hasMoreTokens()) {
                        System.out.println(st.nextToken());
                    }
                    System.out.println(line);
                }
            }
            buff.close();
        } catch (IOException e) {
            System.out.println("Error -- " + e.toString());
        }

    }
}
