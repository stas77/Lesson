package Obekty;

/**
 * Created by user on 03.08.2015.
 */
public class TestFigure2 {
    public TestFigure2() {
        this.name = null;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.perimetr = 0;
    }

    public TestFigure2(String name, double a) {
        this.name = name;
        this.a = a;
    }

    public TestFigure2(String name, double a,  int b, int c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TestFigure2(String name, double a, int b, int c, int perimetr) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimetr = perimetr;
    }

    String name;
    double a;
    int b,c,perimetr;

    double figure2(){
        return a*a;
    }
    double figure2(double a, int b, int c){
        return a+b+c;
    }
}
