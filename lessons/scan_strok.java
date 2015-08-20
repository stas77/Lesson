package lessons;

/**
 * Created by user on 14.07.2015.
 */
import java.util.Scanner;
public class scan_strok {
    public static void main(String[] args) {
        String s1, s2, s3,s;
        Scanner scan1 = new Scanner(System.in);
//
//        System.out.print("Введите строку s1: ");
//        s1 = scan1.next(); System.out.println("длина строки s1=" + s1.length());
//        System.out.print("Введите строку s2: ");
//        s2 = scan1.next(); System.out.println("длина строки s2=" + s2.length());
//        System.out.print("Введите строку s3: ");
//        s3 = scan1.next(); System.out.println("длина строки s3=" + s3.length());
//        s = s1 + s2;       System.out.println("длина s(s1+s2)=" + s.length());
//        System.out.println("строки s3=s? "+s.equals(s3));
//        System.out.println("строка s1: "+s.substring(0,s1.length()));
//        System.out.println("строка s2: "+s.substring(s1.length()));

//        s1=Integer.toString(129);          System.out.println(s1);
//        int a=Integer.parseInt("4567");    System.out.println(a);
//        s1=Float.toString(4.69070f);System.out.println(s1);

//        String str= scan1.nextLine();
//
//        StringBuilder sb=new StringBuilder();
//        sb.append(str);
//        System.out.println(sb);
//        sb.append(" А этот текст добавили в StringBuilder");
//        String goodStr=sb.toString();
//        System.out.println(goodStr);
//
//        int goodStrlength=goodStr.length();
//        System.out.println(goodStrlength);
//
//        System.out.println(sb);
//        System.out.println(sb.delete(3,5));

        String str=scan1.nextLine();// Я сейчас изучаю StringBuilder!
        String p="изучаю";
        StringBuilder sb=new StringBuilder();
        sb.append(str);
      //  sb.insert(sb.indexOf("ю")+2, "методы ");
        sb.insert(sb.indexOf(p)+p.length()+1, "методы ");
       // sb.delete(sb.length()-1,sb.length()+1);
        sb.delete(sb.indexOf("!"),sb.length()+1);
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
