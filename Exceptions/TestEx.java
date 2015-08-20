package Exceptions;

import java.io.IOException;

/**
 * Created by user on 14.08.2015.
 */
public class TestEx {
    public static void main(String[] args) {
        try {
            int[] a=new int[2];
            a[0]=22/2;
            a[1]=33/3;
            a[2]=33/0;
        }
       // catch (ArithmeticException | ArrayIndexOutOfBoundsException ex){
        catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("YES!");
    }
}
