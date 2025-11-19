package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AutomobilTest {

    @org.junit.Test
    public void naCoJezdi() {
        String value = Automobil.naCoJezdi(new SkodaOctavia(Palivo.BENZIN,TypMotoru.ČTYŘTAKT,5));

        String expected = "BENZIN";
        assertEquals(expected,value);
    }


    @Test
    public void testEquals() {
        Automobil c1 = new SkodaOctavia(Palivo.BENZIN,TypMotoru.ČTYŘTAKT,5);
        Automobil c2 = new SkodaOctavia(Palivo.BENZIN,TypMotoru.ČTYŘTAKT,4);
        assertTrue(c1.equals(c2));
    }
@Test
    public void testEquals2() {
        Automobil c1 = new SkodaOctavia(Palivo.NAFTA,TypMotoru.ČTYŘTAKT,5);
        Automobil c2 = new SkodaOctavia(Palivo.BENZIN,TypMotoru.ČTYŘTAKT,4);
        assertEquals(c1.mujMotor(),c2.mujMotor());
    }

        ;
}