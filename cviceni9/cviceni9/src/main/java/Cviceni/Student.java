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
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            Integer uid = Integer.parseInt(br.readLine());
            String separator = br.readLine().trim();
            String line, kodPredmetu, nazevPredmetu;
            String[] strArray;
            while ((line = br.readLine()) != null){
                strArray = line.split(separator);
                kodPredmetu = strArray[0].trim();
                nazevPredmetu = strArray[1].trim();
                PridejPredmet(predmety, kodPredmetu, nazevPredmetu);
                pridejPredmetStudentovi(studentiPredmety, uid, kodPredmetu);
            }
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    private static void pridejPredmetStudentovi(SortedMap<Integer, ArrayList<String>> studentiPredmety, Integer uid, String kodPredmetu) {
        if (!studentiPredmety.containsKey(uid)){
            studentiPredmety.put(uid, new ArrayList<>());
        }
        studentiPredmety.get(uid).add(kodPredmetu);
    }

    private static void PridejPredmet(SortedMap<String, String> predmety, String kodPredmetu, String nazevPredmetu) {
        if (!predmety.containsKey(kodPredmetu)){
            predmety.put(kodPredmetu, nazevPredmetu);
        }
    }

}
