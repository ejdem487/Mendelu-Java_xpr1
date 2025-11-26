package cv9;

public class Pricitaci extends Thread {
    private final Cislo cislo;
    private final int opakovani;

    public Pricitaci(Cislo cislo, int opakovani) {
        this.cislo = cislo;
        this.opakovani = opakovani;
    }

    @Override
    public void run() {
        for (int i = 0; i < opakovani; i++) {
            cislo.plusJedna();
        }
    }
}
