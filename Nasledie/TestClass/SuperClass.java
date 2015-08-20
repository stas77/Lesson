package Nasledie.TestClass;

/**
 * Created by user on 12.08.2015.
 */
public class SuperClass {
    private int a;
    final private int B;

    public SuperClass(int b, int a) {
        this.B = b;
        this.a = a;
    }

    public SuperClass(int a) {
        this.B = 4;
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return B;
    }

//    public void setB(int a) {
//        this.b = b;
//    }
    public void sum(SuperClass odj){
        System.out.println(a+B);
    }
}

