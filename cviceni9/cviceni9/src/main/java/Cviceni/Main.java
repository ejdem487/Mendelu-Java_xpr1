package Cviceni;

import java.io.File;
import java.io.IOException;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("c://Users/adamp/git_repositories/Mendelu-Java_xpr1/cviceni9/cviceni9/");
        SortedSet<Student> sortedSet = Student.readStudents(new File(f, "studenti.csv"));
        SortedMap<String, String> predmety = new TreeMap<>();
        SortedMap<Integer, ArrayList<String>> studentiPredmety = new TreeMap<>();
        Student.readAllCourses(f,predmety,studentiPredmety);
        for (Student student : sortedSet) {
            System.out.println(student);
            ArrayList<String> kodypredmetu =
                    studentiPredmety.get(student.getUid());
            for (String kod : kodypredmetu) {
                System.out.println("   " + predmety.get(kod));
            }
        }

    }
}
