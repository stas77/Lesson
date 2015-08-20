package Exceptions;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by user on 14.08.2015.
 */
public class TestFile {
    public static void main(String[] args) {
        int p;
        File Fout=new File("a.txt");
        try{
            if(!Fout.exists()){
                Fout.createNewFile();
            }
            PrintWriter PW=new PrintWriter(Fout.getAbsoluteFile());
            try {
                for (int i = 0; i < 10; i++) {
                if(i==5)p=i/0;
                PW.println(i);
                }
            } catch (ArithmeticException e){//ArithmeticException по иерархии
                System.out.println("Деление на ноль");  //ниже чем IOException
                }
            finally {
                PW.close();
                System.out.println("finally отработал");
            }
        }catch (IOException e){
            System.out.println("ERROR!");// если указать что файл для чтения
            }
        finally {
            System.out.println("finally2 отработал");
        }
    }
}
