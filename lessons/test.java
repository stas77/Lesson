package lessons;

/**
 * Created by user on 23.07.2015.
 */
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        char[] ms = {'d', 'r', 'o', 'а', 'р', 'д', 'к', 'а'};
        char pp;
        int a, b, c;

        a = 0;
        b = 0;
        c = 0;
        for (int i = 0; i < ms.length; i++) {
            switch (ms[i]) {
                case 'а':
                    a++;
                    break;
                case 'р':
                    b++;
                    break;
                case 'д':
                    c++;
                    break;
            }
        }
        if (a > 0) System.out.println("символ а встречается " + a + " раз");
        if (b > 0) System.out.println("символ р встречается " + b + " раз");
        if (c > 0) System.out.println("символ д встречается " + c + " раз");

        Arrays.sort(ms);
        for (int i = 0; i < ms.length; i++) {
            System.out.print(ms[i] + " ");
        }
        for (int i = 0; i < ms.length / 2; i++) {
            pp = ms[i];
            ms[i] = ms[ms.length - 1 - i];
            ms[ms.length - 1 - i] = pp;
        }
        System.out.println(" ");
        for (int i = 0; i < ms.length; i++) {
            System.out.print(ms[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < ms.length; i++) {
            if (ms[i] == 'o') ms[i] = 'у';
            System.out.print(ms[i] + " ");
        }
        //**********************************************
        System.out.println(" ");
        String s1, s = "I love java";
        char[] ch1 = new char[s.length()];
        for (int i = 0; i < ch1.length; i++) {
            ch1[i] = s.charAt(i);
            System.out.print(ch1[i] + " ");
        }
        s1 = " ";
        for (int i = 0; i < ch1.length; i++) {
            s1 += ch1[i];
        }
        System.out.println("\n" + s1.trim());
        //*****************************************************
          int ind;
//        String[][] db1 = {{"Имя", " рост", " вес"},{"Вася", "175см", "68кг"},
//                          {"Миша", "180см", "85кг"},{"Галя", "180см", "55кг"}};
//        Scanner scan1 = new Scanner(System.in);
//        System.out.print("Введите id человека ");
//        ind = scan1.nextInt();
//        for (int i = 0; i < db1[0].length; i++)  {
//            System.out.print(db1[0][i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < db1[ind].length; i++) {
//            System.out.print(db1[ind][i] + " ");
//        }


// **************************************************
//        String[] m0 = {"Имя", " рост", " вес"};
//        String[] m1 = {"Вася", "175см", "68кг"};
//        String[] m2 = {"Миша", "180см", "85кг"};
//        String[] m3 = {"Галя", "180см", "55кг"};
//
//        Scanner scan1 = new Scanner(System.in);
//        System.out.print("Введите id человека ");
//        ind = scan1.nextInt();
//        for (int i = 0; i < m0.length; i++) {
//            System.out.print(m0[i]+' ');
//        }
//        System.out.println();
//        switch (ind) {
//            case 1:
//                for (int i = 0; i < m1.length; i++) {
//                    System.out.print(m1[i]+' ');
//                }
//                break;
//            case 2:
//                for (int i = 0; i < m2.length; i++) {
//                    System.out.print(m2[i]+' ');
//                }
//                break;
//            case 3:
//                for (int i = 0; i < m3.length; i++) {
//                    System.out.print(m3[i]+' ');
//                }
//                break;
//        }
//        System.out.println();

//***************************************************************
        String[] db1 = {"Имя", " рост", " вес","Вася", "175см", "68кг",
                       "Миша", "180см", "85кг","Галя", "180см", "55кг"};
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Введите id человека ");
        ind = scan1.nextInt();
        for (int i = 0; i < 3; i++)  {
            System.out.print(db1[i] + " ");
        }
        System.out.println();
        for (int i = ind*3; i < ind*3+3; i++) {
            System.out.print(db1[i] + " ");
        }
    }
}
