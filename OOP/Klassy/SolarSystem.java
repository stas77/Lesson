package OOP.Klassy;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import java.lang.reflect.Array;

/**
 * Created by user on 30.07.2015.
 */
public class SolarSystem {
    public static void main(String[] args) {
        Planeta pl= new Planeta();
        pl.Name="Земля";
        pl.Radius=6200;
        pl.Massa=1e10;
        pl.v=300;
        pl.year=365.3;
        pl.diametr(pl.Radius);
        pl.accelar(500);
        pl.print();
        System.out.println(pl.Diam);
        System.out.println(pl.v);
        System.out.println();


        String[] nm={"Земля","Марс","Венера"};
        int[] r={6200,3000,4000};
        float[] ms={1f,0.5f,0.8f};

        Planeta[] ppl= new Planeta[3];

        for(int i=0;i<ppl.length;i++){
            ppl[i]=new Planeta();
            ppl[i].Name=nm[i];
            ppl[i].Radius=r[i];
            ppl[i].Massa=ms[i];
            ppl[i].v=100;
            ppl[i].year=600;
            ppl[i].diametr(pl.Radius);
            ppl[i].accelar(500);
        }
        ppl[0].print();
        System.out.println();
        ppl[1].print();
        System.out.println();
        ppl[2].print();
    }
}
