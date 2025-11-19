package Cviko8;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Osoba[] osobaArray = new Osoba[20000];
        for (int i = 0; i < osobaArray.length; i++) {
            osobaArray[i] = new PerfektniOsoba();
        }
        HashSet<Osoba> osobaSet = new HashSet();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < osobaArray.length; i++) {
            osobaSet.add(osobaArray[i]);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime)+" ms");
        System.out.println("Set size: " + osobaSet.size());
    }
}
