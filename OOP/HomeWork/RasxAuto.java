package OOP.HomeWork;

/**
 * Created by цербер on 29.07.2015.
 */
public class RasxAuto {

    // расход 2-х автомобилей с разным объемом
    static float Rasxod(int ss, int sp, float rr) {
        float k;

        if (sp > 95) {
            k = 1.2f;
        } else if (sp > 85) {
            k = 1.0f;
        } else {
            k = 1.1f;
        }
        return ((float)(ss)/(float)(100))*k*rr;
    }

    static float Tesla(float CT,float Ca,float Cbn, float CkV,float Rv1km, float Rb100km){
        float Cb1km=(Rb100km/100)*Cbn;
        float Cv1km=Rv1km*CkV;
        float SS=(CT-Ca)/(Cb1km-Cv1km);
        return SS;// прoбег
    }

    public static void main(String[] args) {
        System.out.println("расход бензина 2-х автомобилей");
        int[] s1={45,50,15};
        float[] rsx={11.0f,13.0f};
        int[] speed={50,90,100};
        float Srx;

        for (int i=0;i<3;i++) {
            System.out.println("расстояние "+s1[i]+"км со скоростью  "+speed[i]+" км/ч");
        }
        System.out.println();

        for(int j=0;j<2;j++){
            Srx=0.0f;
            for (int i=0;i<3;i++) {
                Srx += Rasxod(s1[i], speed[i], rsx[j]);
            }
            System.out.println("Автомобиль №"+Integer.toString(j+1)+" расход на 100км= "+rsx[j]);
            System.out.println("Расход бензина= "+Srx);
        }


        System.out.println();
        System.out.println( "окупаемость автомобиля Tesla model S");
        float CenaT=132000;
        float CenaA,CkV,Cbn;
        float Ra,Rt,SSS;
        CenaT=CenaT*24.0f;
        CenaA=CenaT/2;
        CkV=0.35f;
        Cbn=25;
        Ra=11;
        Rt=(float)40/225;
        SSS=Tesla(CenaT,CenaA,Cbn, CkV,Rt, Ra);
        System.out.println( "Tesla model S окупится через "+SSS+" км");
        System.out.println( "или");
        SSS=Math.round(SSS*10/20000);
        SSS=SSS/10;
        System.out.println( "через "+SSS+" лет");

    }
}
