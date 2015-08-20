package Exceptions.Univer;

import java.util.Scanner;

/**
 * Created by цербер on 16.08.2015.
 */
public class MainStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Введите имя");
            String str = sc.nextLine();
            System.out.println("Введите оценку");
            int mk = sc.nextInt();
            if (mk < 3) throw new Exception();
        } catch (Exception e){
            System.err.println("ощибочная оценка");
        }

    }
}
