package OOP;

/**
 * Created by user on 28.07.2015.
 */
public class Metody {
    static float vol(float a, float b, float c){
        return a*b*c;
    }
    static float convert(float val1, float val2){
        return val1/val2;
    }
    static void  Ttime(int day){
        int hh=day*24;
        int mm=hh*60;
        int ss=mm*60;
        System.out.println("void: "+day+" дней = "+hh+" часов / "+mm+" минут / "+ss+" секунд");
    }

    static String Ttm(int day){
        int hh=day*24;
        int mm=hh*60;
        int ss=mm*60;
        return ("string: " +day+" дней = "+hh+" часов / "+mm+" минут / "+ss+" секунд");
    }
    //********************************************************************************
    public static void main(String[] args) {
        float a=3.2f;
        float b=4.1f;
        float c=5.6f;
        System.out.println("объем аквариума= "+vol(a,b,c));

        float vv1=25.5f;
        float vv2=13.3f;
        float w;
        w=convert(vv1, vv2);
        System.out.println("курс валют= "+w);

        int dd=11;
        Ttime(dd);
        System.out.println(Ttm(dd));

    }
}
