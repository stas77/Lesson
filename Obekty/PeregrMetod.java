package Obekty;

/**
 * Created by цербер on 03.08.2015.
 */
class GeomFigura{
        float a,b,c;
        String name;

        float Fig( float a){
            this.name="Квадрата";
            return a*a;
        }

        float Fig(float a, float b){
            this.name="Прямоугольника";
            return a*b;
        }

        float Fig(float a,float b,float c){
            this.name="Куба";
            return a*b*c;
        }

}
public class PeregrMetod {
    public static void main(String[] args) {
        float a,b,c;
        float s1;
        GeomFigura GF=new GeomFigura();

        a=5.1f;b=8.3f;c=7.8f;
        s1=GF.Fig(a);
        System.out.println("Площадь "+GF.name+" = "+s1);
        s1=GF.Fig(a,b);
        System.out.println("Площадь "+GF.name+" = "+s1);
        s1=GF.Fig(a,b,c);
        System.out.println("Площадь "+GF.name+" = "+s1);

    }
}
