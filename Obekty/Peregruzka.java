package Obekty;

/**
 * Created by user on 03.08.2015.
 */
public class Peregruzka {
    public static void main(String[] args) {
        testFigure t1=new testFigure();
        System.out.println(t1.figure(3.5));
        t1.figure("Куб", 3.0);
        t1.figure("Треугольник 1",2,3,4);
        t1.figure("Треугольник 2", 4, 5, 2, 6);

        System.out.println();
        TestFigure2 t2 =new TestFigure2("Куб2",5.5);
        TestFigure2 t3 =new TestFigure2();
        System.out.println(t2.figure2());
        System.out.println(t3.figure2());
    }
}
