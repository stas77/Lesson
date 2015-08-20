package INKAPS;

import INKAPS.JavaRedKod.myJavaFile;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by цербер on 05.08.2015.
 */
public class MyJavaRedIncap {
    public static void main(String[] args)throws IOException {
        String s1;
        Scanner scan=new Scanner(System.in);

        System.out.println("создайте файл (введите имя без расш.) : ");
        s1 = scan.nextLine();
        myJavaFile javaKod=new myJavaFile();
        javaKod.setNameJavaF(s1);
        javaKod.CreteJavaFile();

        System.out.println("Напишите код/ (выход- ввод в пустой строке): ");
            s1 = scan.nextLine();

        while(s1.length()>0){
            javaKod.AddJavaKod(s1);
            s1 = scan.nextLine();
        }
        javaKod.CloseJavaFile();
        System.out.println("файл "+javaKod.getNameJavaF()+" записан");
    }
}
