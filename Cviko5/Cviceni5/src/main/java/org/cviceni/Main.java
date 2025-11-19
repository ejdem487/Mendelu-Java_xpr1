package org.cviceni;
import java.io.File;
import java.io.Serializable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
     File f = new File("C:/Users/adamp/Downloads/adresy.csv");
        //System.out.println(FileOperations.isExistingReadableFile(f));
        File inputFile = new File("C:/Users/adamp/Downloads/adresy.csv");
        File outputFile = new File("C:/Users/adamp/Downloads/citizens.dat");
        FileOperations.saveCitizensToFile(inputFile, outputFile);
        FileOperations.printCitizensFromFile(outputFile);

    }
}
