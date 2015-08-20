package Obekty;

import java.io.*;

/**
 * Created by user on 04.08.2015.
 */
public class FileWrite {
    public static void main(String[] args) {
        File FL=new File("file1.txt");
        try{
            if(!FL.exists()){
                FL.createNewFile();
            }
            PrintWriter pw=new PrintWriter(FL);
            try{
                for(int i=0;i<10;i++){
                    pw.println(i);
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
