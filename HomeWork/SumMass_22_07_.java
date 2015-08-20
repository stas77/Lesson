package HomeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.*;

/**
 * Created by цербер on 22.07.2015.
 */
public class SumMass_22_07_ {
    public static void main(String[] args) {
        float[] mas1 = new float[9];
        float[] mas2 = new float[9];
        float[] mas3 = new float[9];
        // String s1,s2,s3;
        Float sum,sum2,a;

        // s1="mas1{ ";  s2="mas2{ ";  s3="mas3{ ";
        sum = 0.0f;
        for (short i = 0; i < mas1.length; i++) {
            mas1[i] = (float) Math.round(Math.random() * 1000) / 10;
            mas2[i] = (float) Math.round(Math.random() * 1000) / 10;
         //   mas3[i] = (float) Math.round(Math.random() * 1000) / 10;
            // s1=s1+Float.toString(mas1[i])+" ";
            sum = sum + mas1[i] + mas2[i] + mas3[i];
        }
        sum2=0.0f;
        a=0.0f;
        for(short i=0; i<mas1.length+mas2.length+mas3.length;i++){
            if(mas1.length>i){a=mas1[i];}
            else {
                if (mas1.length+mas2.length>i+2){a=mas2[i-mas1.length];}
            }
            sum2=sum2+a;
        }
        System.out.println("Сумма 3-х массивов");
        //  System.out.println(s1 + " }");
        System.out.println("mas1" + Arrays.toString(mas1));
        System.out.println("mas2" + Arrays.toString(mas2));
        System.out.println("mas3" + Arrays.toString(mas3));
        System.out.println("Sum= " + sum);
        System.out.println("Sum2= " + sum2);

        System.out.println("\n" + "первые 6 чисел mas1 меняются местами с последними");
        float[] MMM = new float[6];
        System.arraycopy(mas1, 0, MMM, 0, 6);
        //System.out.println("MMM" + Arrays.toString(MMM));
        System.arraycopy(mas1, 6, mas1, 0, mas1.length - 6);
        System.arraycopy(MMM, 0, mas1, mas1.length - 6, MMM.length);
        System.out.println("mas1" + Arrays.toString(mas1));

        System.out.println("\n" + "mas2 разбивается на 2-а и сортируется ");
        float[] mas2a = Arrays.copyOfRange(mas2, 0, mas2.length/2);
        float[] mas2b = Arrays.copyOfRange(mas2,  mas2.length / 2, mas2.length);
        System.out.print("mas2a" + Arrays.toString(mas2a) + " -> ");
        Arrays.sort(mas2a);
        System.out.println("mas2a" + Arrays.toString(mas2a));

        System.out.print("mas2b" + Arrays.toString(mas2b) + " -> ");
        Arrays.sort(mas2b);
        System.out.println("mas2b" + Arrays.toString(mas2b));

        System.out.println("\n" + "вывод эл.массива по его индексу ");
        int indx;
        Scanner scan1 = new Scanner(System.in); // создаём объект класса Scanner
        do {
            System.out.println("Введите идекс для массива 3");
            indx = scan1.nextInt();
            if(indx<0 || indx>mas3.length-1) break;
            else System.out.println("mas3["+indx+"]="+mas3[indx]);
        }while (indx<mas3.length);


        System.out.println("\n" + "программа аналог Arrays.equals");
        float[] M3 = new float[mas3.length];
        boolean mt = false;
        System.arraycopy(M3, 0, mas3, 0, mas3.length);
        if (M3.length == mas3.length) {
            for (int i = 0; i < M3.length; i++) {
                if (M3[i] != mas3[i]) {
                    mt = false;
                    break;
                } else mt = true;
            }
        }
        System.out.println("M3 mas3 " + mt);
    }
}
