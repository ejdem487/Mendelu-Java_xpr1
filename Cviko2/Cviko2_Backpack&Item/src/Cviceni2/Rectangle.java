package Cviceni2;

public class Rectangle {
    private static int instanceCount = 0;
    private int a,b;

    public static Rectangle getInstance(int a,int b){
        if (a>=0 && b>=0) {
            return new Rectangle(a,b);
        }
        return null;
    }

    public static Rectangle getInstance(int a){
        return getInstance(a,a);
    }

    public static Rectangle getInstance(){
        return new Rectangle(3,5);
    }

    private Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        instanceCount = instanceCount + 1;
    }

    public int getArea(){
        return a*b;
    }
    public int getPerimeter(){
        return 2*(a+b);
    }

    public int getinstancecount(){
        return instanceCount;
    }


}
