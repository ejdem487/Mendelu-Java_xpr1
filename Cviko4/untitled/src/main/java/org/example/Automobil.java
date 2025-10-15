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
        MotoroveVozidlo mv = new SkodaOctavia(Palivo.NAFTA,TypMotoru.DVOUTAKT,5);

        return mv;
    }

}

