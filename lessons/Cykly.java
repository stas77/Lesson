package lessons;

/**
 * Created by user on 14.07.2015.
 */
import java.util.Scanner;
public class Cykly {
    public static void main(String[] args) {
    int i, j, k;
    j=0;k=0;

    for(i=1;i<10;i+=2){
        j+= 5;
        k++;
        System.out.println("Цикл " + k + ": " + "i= " + i+ "  j= " + j);
    }
}

}
