package OOP.Klassy;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by user on 30.07.2015.
 */
public class Planeta {
    String Name;
    double Radius,Massa,Diam;
    double v,year;

    void accelar(double v1){
        v+=v1;
    }
     void diametr(double a){
         Diam=Radius*2;
     }
    void print(){
        System.out.println("Название: "+Name);
        System.out.println("радиус= "+Radius);
        System.out.println("диаметр= "+Diam);
        System.out.println("скорость= "+v);
        System.out.println("масса: "+Massa);
        System.out.println("год: "+year+" дней");
    }
}
