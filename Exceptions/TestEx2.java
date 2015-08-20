package Exceptions;

import java.io.File;
import java.io.PrintWriter;

/**
 * Created by user on 14.08.2015.
 */
public class TestEx2 {
    public static void main(String[] args) {
        File Fout=new File("a.txt");
        try {
            int[] a=new int[2];
            a[0]=22/2;
            a[1]=33/3;
          //  a[2]=33/0;
          //  a[3]=22;

            if(!Fout.exists()){
                Fout.createNewFile();
            }
            PrintWriter PW=new PrintWriter(Fout.getAbsoluteFile());
            try{
                for(int i=0;i<10;i++)
                    PW.println(i);
            }finally {
                PW.close();
            }
        }catch (ArithmeticException ex){
            System.out.println("Деление на ноль");
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Выход за пределы массива!");
        }catch(Exception ex){
            System.out.println("Ошибка не предусмотренная выше");
            ex.printStackTrace();
        }catch (OutOfMemoryError ex){
            System.out.println("OutOfMemoryError");
        }
    }
}
