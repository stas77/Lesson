package Exceptions;

/**
 * Created by user on 14.08.2015.
 */
public class Zadacha_1 {
    public static void main(String[] args) {
        int[] a1=new int[91];
        int[] a2=new int[10];

        for(int i=0;i<=90;i++) a1[i]=i+10;
        for(int i=0;i<10;i++) a2[i]=i;

        for(int i=0;i<=90;i++){
            for(int j=0; j<10;j++){
                try {
                   /* if((float)(a1[i]%a2[j])!=0) {
                        System.out.println(a1[i] + " не делится без остатка на " + a2[j]);
                    */
                    if((float)(a1[i]%a2[j])==0) {
                        System.out.println(a1[i] + " делится без остатка на " + a2[j]);
                    }
                }catch (ArithmeticException ex){
                    System.out.println(a1[i] + " делится на " + a2[j]);
                    ex.printStackTrace();
                }
            }
        }

    }


}
