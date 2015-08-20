package RW_File.HomeWork;

import INKAPS.JavaRedKod.myJavaFile;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by цербер on 05.08.2015.
 */
public class MyJavaRedaktor {
    public static void main(String[] args)throws IOException {
        String s1;
     //   String nm;
       // int p;
        Scanner scan=new Scanner(System.in);

        System.out.println("создайте файл (введите имя без расш.) : ");
        s1 = scan.nextLine();
            myJavaFile javaKod=new myJavaFile();
            javaKod.setNameJavaF(s1);
            javaKod.CreteJavaFile();


      //  File Fout=new File("src/"+s1);
      //  PrintWriter pw=new PrintWriter(Fout);

     //   if(!Fout.exists()){
     //       Fout.createNewFile();
     //   }

        System.out.println("Напишите код/ (выход- ввод в пустой строке): ");
                s1 = scan.nextLine();
   //     p=s1.indexOf(".");
   //     s1 = "public class "+s1.substring(0,p)+" {";

    //    System.out.println(s1);
   //     pw.println(s1);

  //      s1="public static void main(String[] args) {";
 //       System.out.println(s1);
//        while(s1.equals("stop")!=true){
//            pw.println(s1);
//            s1 = scan.nextLine();
//        }

                while(s1.length()>0){
                    javaKod.AddJavaKod(s1);
                    s1 = scan.nextLine();
                }
                javaKod.CloseJavaFile();
        //pw.close();
        System.out.println("файл "+javaKod.getNameJavaF()+" записан");
    }
}
