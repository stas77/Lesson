package OOP;

import java.util.Random;

/**
 * Created by user on 28.07.2015.
 */
public class Ssylka_s_izmeneniem {
    static void print(int[]a){
        System.out.println();
        for(int k:a){
            System.out.print(k+" ");
        }
    }
    static int[] sort(int[]a){
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int temp;
                if(a[j]<a[i]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Random rn=new Random();
        int[]a=new int[7];
        int[]b=new int[7];
        for(int i=0;i<a.length;i++){
            a[i]=rn.nextInt(20);
        }
        print(a);
        b=sort(a);
        print(b);
        print(a);
    }
}
//    9 0 16 9 8 11 18
//    0 8 9 9 11 16 18
//    0 8 9 9 11 16 18
// массив непростой тип поэтому изменяется
