package org.example;

public class SkodaOctavia extends Automobil{

    private Palivo palivo;
    private int pocet_mist;
    private TypMotoru typmotoru;

    public SkodaOctavia(Palivo palivo, TypMotoru typmotoru, int pocet_mist){
        this.palivo = palivo;
        this.pocet_mist = pocet_mist;
        this.typmotoru = typmotoru;
    }

    @Override
    public int pocet_mist() {
        return pocet_mist;
    }

    @Override
    public Palivo naCoJezdim() {
        return palivo;
    }

    @Override
    public TypMotoru mujMotor() {
        return typmotoru;
    }
}
