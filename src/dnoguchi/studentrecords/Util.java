package dnoguchi.studentrecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Util {
    public static Student [] readFile(String filename, Student[] stu) {
        //Reads the file and builds student array.
        //Open the file using FileReader Object.
        //In a loop read a line using readLine method.
        //Tokenize each line using StringTokenizer Object
        //Each token is converted from String to Integer using parseInt method
        //Value is then saved in the right property of Student Object.
        ArrayList<Student> students = new ArrayList<Student>();

        try {
            FileReader file = new FileReader("ReadSource.java");
            BufferedReader buff = new BufferedReader(file);
            boolean eof = false;
            while (!eof) {
                String line = buff.readLine();
                if (line == null)
                    eof = true;
                else
                    System.out.println(line);
            }

            buff.close();
        } catch (IOException e) {System.out.println("Error -- " + e.toString());
        }

    }
}
