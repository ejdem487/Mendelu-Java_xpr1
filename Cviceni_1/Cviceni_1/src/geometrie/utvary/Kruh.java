package geometrie.utvary;



public class Kruh {
    int polomer, stredX, stredY;
    static final double PI = 3.145927;

    public int getPolomer(){
        return polomer;
    }
    public int getStredX(){
        return stredX;
    }
    public int getStredY(){
        return stredY;
    }
    public void setPolomer(int polomer){
        this.polomer = polomer;
    }

    public void setStredX(int stredX){
        this.stredX = stredX;
    }
    public void setStredY(int stredY){
        this.stredY = stredY;
    }

    double obvod(){
        return 2*PI*polomer;
    }
    int obvodInt(){
        return (int) obvod();
    }

    void kruh(){

    }
}
