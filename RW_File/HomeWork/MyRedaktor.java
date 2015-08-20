package RW_File.HomeWork;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by цербер on 05.08.2015.
 */
public class MyRedaktor {
    public static void main(String[] args)throws IOException{
        String s1;
        File Fout=new File("Text.txt");
        PrintWriter pw=new PrintWriter(Fout);
        Scanner scan=new Scanner(System.in);

        if(!Fout.exists()){
            Fout.createNewFile();
        }

        System.out.println("Печатайте текст/ (по окончании- stop): ");
        s1 = scan.nextLine();
        while(s1.equals("stop")!=true){
            pw.println(s1);
            s1 = scan.nextLine();
        }
        pw.close();
        System.out.println("файл "+Fout.getName()+" записан");
    }
}
