package Cviceni2;

public class Main{
    public static void main(String[] args) {
        Backpack backpack = new Backpack(50,50);
        Item item1 = new Item(20,20);
        backpack.putitem(item1);
        Item item2 = new Item(20,20);
        backpack.putitem(item2);
        Item item3 = new Item(20,20);
        System.out.println(backpack.putitem(item3));

        Rectangle r = Rectangle.getInstance(7);
        System.out.println(r.getArea());



        
    }
}