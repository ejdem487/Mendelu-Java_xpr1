package Cviko8;

import java.util.Objects;
import java.util.Random;

public class Osoba {
    private Boolean muz;
    private int vyska;
    private String jmeno;

    public Osoba (){
        Random rand = new Random();
        muz = rand.nextBoolean();
        vyska = rand.nextInt(150,201);
        int jmenoLength = rand.nextInt(2,6);
        StringBuffer jmenoBuffer = new StringBuffer();
        for (int i = 0; i < jmenoLength; i++){
            jmenoBuffer.append(rand.nextInt('a','z'+1));
        }
        jmeno = jmenoBuffer.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Osoba osoba)) return false;
        return muz == osoba.muz
        && vyska == osoba.vyska
                && jmeno.equals(osoba.jmeno);
    }



    public Boolean getMuz() {
        return muz;
    }

    public int getVyska() {
        return vyska;
    }

    public String getJmeno() {
        return jmeno;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "muz=" + muz +
                ", vyska=" + vyska +
                ", jmeno='" + jmeno + '\'' +
                '}';
    }




}

class PrijatelnaOsoba extends Osoba {
    @Override
    public int hashCode() {
        return getVyska()*getJmeno().length();
    }
}

class NevhodnaOsoba extends Osoba {
    @Override
    public int hashCode() {
        return getVyska();
    }
}

class PerfektniOsoba extends Osoba {
    @Override
    public int hashCode() {
        int vysledek = getMuz() ? 1:0;
        vysledek = 31 * vysledek + getVyska();
        vysledek = 31 * vysledek + getJmeno().hashCode();
        return vysledek;
    }
}