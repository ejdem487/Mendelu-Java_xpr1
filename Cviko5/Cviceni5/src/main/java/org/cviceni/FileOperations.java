package org.cviceni;
import java.io.*;
import java.util.*;
import java.io.Serializable;

public class FileOperations {

    public static boolean isExistingReadableFile(File f) {
        if (f == null) return false;
        if (!f.exists()) return false;
        if (!f.isFile()) return false;
        if (!f.canRead()) return false;
        return true;
    }

    public static boolean saveCitizensToFile(File inputFile,File outputFile){
        if (!isExistingReadableFile(inputFile)) return false;
        try(BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile))) {

            String line;
            String[] strArr;
            Citizen c;
            while ((line = reader.readLine()) != null) {
                line = line.trim(); //odstrani bile znaky na zacatku a na konci
                strArr = line.split(";");
                c = new Citizen(strArr);
                oos.writeObject(c);
            }


            return true;

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

     return false;

    }

    public static void printCitizensFromFile(File f) {
        if (!isExistingReadableFile(f)) return;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            while (true) {
                try {
                    System.out.println(ois.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
