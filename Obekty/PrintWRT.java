package Obekty;

//import java.io.PrintWriter;
import java.io.*; //* - все методы класса

/**
 * Created by user on 04.08.2015.
 */
public class PrintWRT {
    public static void main(String[] args) {
        PrintWriter pw=new PrintWriter(System.out,true);
        pw.println("Замена SOUT");
        File F1=new File("a.txt");
        pw.println(F1.getAbsolutePath());
    }
}
