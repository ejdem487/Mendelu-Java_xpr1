package cv9;

public class Odecitaci implements Runnable {
    private final Cislo cislo;
    private final int opakovani;

    public Odecitaci(Cislo cislo, int opakovani) {
        this.cislo = cislo;
        this.opakovani = opakovani;
    }

    @Override
    public void run() {
        for (int i = 0; i < opakovani; i++) {
            cislo.minusJedna();
        }
    }
}
