package Cviceni;

import java.io.File;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        File f = new File("c://Users/adamp/git_repositories/Mendelu-Java_xpr1/cviceni9/cviceni9/studenti.csv");
        SortedSet<Student> sortedSet = Student.readStudents(f);
        for (Student student : sortedSet) {
            System.out.println(student);
        }

    }
}
