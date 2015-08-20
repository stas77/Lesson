package Nasledie.TestClass;

/**
 * Created by user on 12.08.2015.
 */
final public class NewClass extends SuperClass{
    int c;

    public NewClass(int b, int a, int c) {
        super(b, a);
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
/*    public void sum(NewClass odj){
        System.out.println(getA()+getB()+c);
    }*/
    public int sum(int a,int b, int c){
        return a+b+c;
    }
}
