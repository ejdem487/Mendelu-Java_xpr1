package cv9;

public class Cislo{
    private int x;

    public Cislo(int x){
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public synchronized void plusJedna() {x++;}
    public synchronized void minusJedna() {x--;}
}
