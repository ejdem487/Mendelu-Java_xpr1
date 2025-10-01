package Cviceni2;

public class Backpack {

    private final int volume;
    private final int loadCapacity;
    private int remainingVolume;
    private int remainingLoadCapacity;

    public Backpack(int volume, int loadCapacity) {
        this.volume = remainingVolume = volume;
        this.loadCapacity = remainingLoadCapacity = loadCapacity;
    }

    public int getVolume() {
        return volume;
    }
    public int getLoadCapacity() {
        return loadCapacity;
    }

    public boolean putitem(Item item){
        if(item.getWeight()<=remainingLoadCapacity && item.getVolume()<=remainingVolume) {
            remainingLoadCapacity -= item.getWeight();
            remainingVolume -= item.getVolume();
            System.out.println("Item successfully putitemed");
            System.out.println("Load Capacity: " + loadCapacity);
            return true;
        }
        System.out.println("Not enough load capacity");
        return false;
        }

}
