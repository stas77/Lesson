package Obekty;

/**
 * Created by цербер on 03.08.2015.
 */
class GeomFig {
    String name;
    float a, b, c;

    public GeomFig(float a) {
        this.name = "Квадрат";
        this.a = a;
    }

    public GeomFig(float a, float b) {
        this.name = "Прямоугольник";
        this.a = a;
        this.b = b;
    }

    public GeomFig(float a, float b, float c) {
        this.name = "Куб";
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

public class PeregrKonstr {
    public static void main(String[] args) {
        GeomFig GF1=new GeomFig(5.3f);
        GeomFig GF2=new GeomFig(4f,6f);
        GeomFig GF3=new GeomFig(3f,8f,2f);

        System.out.println(GF1.name+" а="+GF1.a);//+" площадь= "+GF1.Mat(3));
        System.out.println(GF2.name+" а="+GF2.a+" b="+GF2.b);//+" площадь= "+GF2.Mat(2,3));
        System.out.println(GF3.name+" а="+GF3.a+" b="+GF3.b+" c="+GF3.c);//+" площадь= "+GF3.Mat(3,4,5));

    }
}
