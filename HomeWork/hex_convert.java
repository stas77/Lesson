package HomeWork;

/**
 * Created by цербер on 27.07.2015.
 */

import java.util.Scanner;

public class hex_convert {
    public static void main(String[] args) {
//        String hex = "0010";
//        String h;
//        int a;
//        h= String.valueOf(Integer.parseInt(hex,2));
//        System.out.println("Двоичное число " + hex + "= " + Integer.parseInt(hex,2));
//        a=200;
//        System.out.println("Десят. число " + a + "= " + Integer.toBinaryString(a));

        int a, ind;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        Scanner scan1 = new Scanner(System.in);

        System.out.println("7/2="+7/2);
        System.out.println("7%2="+7%2);

        System.out.print("Введите десятичное число ");
        ind = scan1.nextInt();
        while (ind != 0) {
            a = ind % 2;
            sb.append(Integer.toString(a));
            ind = ind / 2;
        }
        System.out.println(sb.reverse());

      //    sb.replace(0,1,"hjk");
//        sb1.append("");
//        for (int i=sb.length()-1;i>=0; i--) {
//              sb1.append(sb.charAt(i));
//        }
//        System.out.println(sb1);

//        System.out.print("Введите двоичное число ");
//        sb.setLength(0);
//        int s2,sum;
//        sb.append(scan1.next());
//        sum=0;
//        s2=1;
//        for (int i=sb.length()-1;i>=0;i--) {
//            sum+=s2*Integer.parseInt(String.valueOf(sb.charAt(i)));
//            s2*=2;
//        }
//        System.out.println(sum);

// второй способ*************************************
        System.out.print("Введите двоичное число ");
        String ss1;
        ss1 = scan1.next();
        int sum=0;
        for (int i=sb.length()-1;i>=0;i--) {
            sum+=Integer.parseInt(ss1.substring(i,i+1))*Math.pow(2, sb.length()-1-i);
        }
        System.out.println(sum);
    }
}
