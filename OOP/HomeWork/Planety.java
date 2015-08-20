package OOP.HomeWork;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by цербер on 29.07.2015.
 */
public class Planety {

    //планеты
    static void fun(float a, float b, String w){
        float c=a-b;
        if(c>0) System.out.println("на планете "+w+" год больше, чем на Земле на "+Math.abs(c)+" дней");
        else System.out.println("на планете "+w+" год меньше, чем на Земле на "+Math.abs(c)+" дней");
    }

    //деление на 13.5
    static float Del(float[]a){
        int i=0;
        float f,sum;
        Random rn=new Random();
        sum=0.0f;
        while(i<a.length){
            f=rn.nextInt(1000);
            if(f%13.5==0){
                a[i]=f;
                sum+=a[i];
                i++;
            }
        }
        sort(a);
        return sum;
    }
    static float[] sort(float[]mm){
        for(int k=0;k<mm.length;k++){
            for(int j=k;j<mm.length;j++){
                float temp;
                if(mm[j]<mm[k]){
                    temp=mm[j];
                    mm[j]=mm[k];
                    mm[k]=temp;
                }
            }
        }
        return mm;
    }

    // прямоугольник
    static void Rect(int a, int b) {
        String s1, s2;
        s2 = "* ";
        s1 = "";
        for (int i = 0; i < a; i++) {
            s1 = s1 + "* ";
            if (i < a - 2) s2 = s2 + "  ";
        }
        s2 = s2 + "*";
        for (int i = 0; i < b; i++) {
            if (i == 0 || i == b - 1) {
                System.out.println(s1);
            } else {
                System.out.println(s2);
            }
        }
    }


    public static void main(String[] args) {
        //на сколько длиннее или короче год на планете Земля.....
        float[]year={88.97f,224.7f,365.3f,687f,4332.3f,10761.7f,30689.2f,60201.2f};
        String[]PL={"Меркурий","Венера","Земля","Марс","Юпитер","Сатурн","Уран","Нептун"};
        System.out.println("год на планетах");
        for(int i=1;i<9;i++){
            if(i==3)continue;
            fun(year[i-1],year[3-1],PL[i-1]);
        }
        System.out.println();

        //Создать массив, на 10000 значений, числа от 0 до 1000, нужно отобрать из них те которые делятся без
       // остатка на 13.5. вывести их на печать и посчитать сумму.
        System.out.println("Сумма случ.чисет /13.5");
        float[]D3=new float[10000];
        float sum;
        sum=Del(D3);
        for(int i=0;i<10000;i++){
            System.out.print(D3[i]+", ");
        }
        System.out.println();
        System.out.println("Сумма= "+sum);
        System.out.println();

        System.out.println("метод параметрами которого является длинна и ширина прямоугольника. '*'");
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Ведите ширину прямоугольника= ");
        int X = scan1.nextInt();
        System.out.println("Ведите высоту прямоугольника= ");
        int Y = scan1.nextInt();
        Rect(X, Y);
        System.out.println();
    }
}
