package Cviceni;

import org.ietf.jgss.GSSManager;

import java.io.*;
import java.util.*;

public class Student implements Comparable<Student>{

    private String jmeno,prijmeni;
    private int uid;

    @Override
    public int compareTo(Student s) {
        return getPrijmeni().compareTo(s.getPrijmeni());
    }

    @Override
    public String toString() {
        return "Student{" +
                "jmeno='" + jmeno + '\'' +
                ", prijmeni='" + prijmeni + '\'' +
                ", uid=" + uid +
                '}';
    }


    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getUid() {
        return uid;
    }

    public Student(String jmeno, String prijmeni, int uid) {
        this.uid = uid;
        this.prijmeni = prijmeni;
        this.jmeno = jmeno;
    }

    static SortedSet readStudents(File file){
        SortedSet sortedSet = new TreeSet();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            String[] strarray;
            while ((line = reader.readLine()) != null){
                strarray = line.split(";");
                sortedSet.add(new Student(strarray[2],strarray[1],Integer.parseInt(strarray[0])));

            }

        }  catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.unmodifiableSortedSet(sortedSet);
    }
    static void readAllCourses(File dir, SortedMap<String,String> predmety,SortedMap<Integer, ArrayList<String>> studentiPredmety) throws IOException {
        
        if (dir.exists()&&dir.isDirectory()){
            File[] csvfiles = dir.listFiles(new FileFilter(){
                @Override
                public boolean accept(File f) {
                    return f.isFile()
                            && f.getName().endsWith(".csv")
                            && f.getName().startsWith("predmety");
                }
            });
            for (File file : csvfiles){
                readStudentCourser(file,predmety,studentiPredmety);
            }
        }
    }

    private static void readStudentCourser(File file, SortedMap<String, String> predmety, SortedMap<Integer, ArrayList<String>> studentiPredmety) {
    }

}
