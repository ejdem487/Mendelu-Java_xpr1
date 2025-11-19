package org.example;

public abstract class Automobil implements info, MotoroveVozidlo {
    @Override
    public String kdoJsem(){
        return "Automobil";
    }

    static String naCoJezdi (MotoroveVozidlo m){
        return m.naCoJezdim().toString();
    }




    public abstract int pocet_mist();

    @Override
    public boolean equals(Object obj){
        if (obj instanceof MotoroveVozidlo mv){
           if (this.mujMotor().equals(mv.mujMotor()) && this.naCoJezdim().equals(mv.naCoJezdim())){
               return true;
           }
        }
        return false;
    }

    public static MotoroveVozidlo getVozidlo(){
       return new MotoroveVozidlo() {

            @Override
            public Palivo naCoJezdim() {
                return Palivo.NAFTA;
            }

            @Override
            public TypMotoru mujMotor() {
                return TypMotoru.DVOUTAKT;

            }

        };
    }

}

