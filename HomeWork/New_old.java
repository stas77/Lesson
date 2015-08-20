package HomeWork;
import java.util.Scanner;
/**
 * Created by user on 23.07.2015.
 */
public class New_old {
    public static void main(String[] args) {
//****************************************************************
        int i;
        System.out.println("\n" + "Вывод чисел 10..20 всеми циклами");
        for(i=10;i<=20;i++){
            System.out.println("for: "+i);
        }
        i=10;
        while (i<=20){
            System.out.println("while: "+i);
            i++;
        }
        i=10;
        do {
            System.out.println("do...while: " + i);
            i++;
        }    while (i <= 20) ;
//**********************************************************

        System.out.println("\n" + "Вывод чисел 1..100 кот делятся на 3");
        for(i=1;i<=100;i++){
            if(i%3==0) {
                System.out.println(i);
            }
        }
//***************************************************

        System.out.println("\n" + "Дан текст из 3-х слов. поменять 1 и 3 местами");
        String s="один два три";
        System.out.println(s);
        String s1;
        int j=0;
        s=s+" ";
        s1="";
        for(i=0;i< s.length();i++){
           // System.out.println("кодовые точки: "+ s1.codePointAt(i));
            if(s.codePointAt(i)==32 || i==s.length())   {
                s1=" "+s.substring(j,i)+s1;
                j=i+1;
            }
        }
        System.out.println(s1.trim());
//***********************************************************

        Scanner scan1 = new Scanner(System.in);
        System.out.println("\n" + "программа кот постоянно запрашивает числа, а после ввода «0» выводит суму \n" +
                           "этих чисел");
        int indx,sum;
        sum=0;
        i=1;
        do {
            System.out.println("введите число "+ i++);
            indx = scan1.nextInt();
            sum=sum+indx;
        }while (indx!=0);
        System.out.println("сумма="+sum);


    }

}
