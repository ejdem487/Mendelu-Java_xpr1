package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        printInfo(new SkodaOctavia(Palivo.BENZIN,TypMotoru.ČTYŘTAKT,7));

    }
    static void printInfo(info i){
        System.out.println(i.kdoJsem());
        if (i instanceof MotoroveVozidlo){
        }
    }


}
