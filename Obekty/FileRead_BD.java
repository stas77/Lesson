package Obekty;

import java.io.*;
import java.util.Arrays;

/**
 * Created by user on 04.08.2015.
 */
public class FileRead_BD {
    public static void main(String[] args) throws IOException {
        BufferedReader BufRd = new BufferedReader(new InputStreamReader(System.in));
        File F = new File("BD_customs.txt");
        BufferedReader Fin = new BufferedReader(new FileReader(F));
        String name;
        String line;
        String Lout;
        int i1, i2;

        i1 = 0;
        i2 = 0;

        // System.out.println("Print File "+F.getName()+"? Y/N");
        //   name=BufRd.readLine(); // построчное считывание
        //   if(name.equals("y"));
        while ((line = Fin.readLine()) != null) {
            System.out.println(line);
            Lout = line;
            int i = Lout.indexOf("@");
            while (i < 500) {
                if (Lout.codePointAt(i) == 32) {
                    i1 = i;
                    break;
                }
                i--;
            }

            i = Lout.indexOf("@");
            while (i < 500) {
                if (Lout.codePointAt(i) == 32 || i < Lout.length()) {
                    i2 = i;
                    break;
                }
                i++;
                System.out.println(Lout.indexOf("@"));
                System.out.println(i1);
            }

            Fin.close();

        }
}   }
