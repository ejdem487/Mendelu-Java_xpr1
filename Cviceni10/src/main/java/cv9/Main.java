package cv9;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cislo cislo0 = new Cislo(0);
        int opakovani = 20000000;

        Pricitaci pricitaci = new Pricitaci(cislo0, opakovani);
        Thread odecitaci = new Thread(new Odecitaci(cislo0, opakovani));

        pricitaci.start();
        odecitaci.start();

        pricitaci.join();
        odecitaci.join();

        System.out.println("Vysledek: " + cislo0.getX());
    }
}
