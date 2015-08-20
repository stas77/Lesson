package Obekty;

import java.io.*;

/**
 * Created by user on 04.08.2015.
 */
public class Pifagor {
    public static void main(String[] args) {
        String s;
        File ff=new File("Pifagor.txt");
        try{
            if(!ff.exists()){
                ff.createNewFile();
            }
            PrintWriter pw=new PrintWriter(ff);
            try{
                for(int i=1;i<10;i++){
                    for(int j=1;j<10;j++) {
                        s=Integer.toString(j*i);
                        if(s.length()<2)s=" "+s;
                        pw.print(s + "  ");
                    }
                    pw.println();
                }
            }
            finally {
                pw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
