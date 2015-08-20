package HomeWork;
import java.util.Scanner;
/**
 * Created by цербер on 22.07.2015.
 */
public class M3_Krug {
    public static void main(String[] args) {
        float x0,y0,r,x,y,rez;
        String S1;
        Scanner scan1 = new Scanner(System.in); // создаём объект класса Scanner

        r=4;
        x0=0;
        y0=0;
        System.out.print("Введите X= ");
        S1 = scan1.next();
        x=Float.parseFloat(S1);
        System.out.println();
        System.out.print("Введите Y= ");
        S1 = scan1.next();
        y=Float.parseFloat(S1);
        rez=(x0-x)*(x0-x)+(y0-y)*(y0-y);
        if(rez<=r*r){System.out.println("точка попадает в круг");}
        else        {System.out.println("точка не попадает в круг");}
    }
}
