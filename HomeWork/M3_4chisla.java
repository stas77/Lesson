package HomeWork;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * Created by цербер on 22.07.2015.
 */
public class M3_4chisla {
    public static void main(String[] args) {
        float [] m1=new float[4];
        float Max;
        String S1;
        Scanner scan1 = new Scanner(System.in); // создаём объект класса Scanner

        for(int i=0;i<=3;i++) {
            S1 = scan1.next();
            m1[i]=Float.parseFloat(S1);
        }
        Max=-1e10f;
        for(int i=0;i<=3;i++) {
            Max=(Max<m1[i])?m1[i]:Max;
           // System.out.println(m1[i]);
        }
        System.out.println(Max);
    }
}
