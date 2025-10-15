package org.example;

import static org.junit.Assert.*;

public class AutomobilTest {

    @org.junit.Test
    public void naCoJezdi() {
        String value = Automobil.naCoJezdi(new SkodaOctavia(Palivo.BENZIN,TypMotoru.ČTYŘTAKT,5));

        String expected = "BENZIN";
        assertEquals(expected,value);
    }



}