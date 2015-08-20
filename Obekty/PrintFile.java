package Obekty;

import java.io.*;

/**
 * Created by user on 04.08.2015.
 */
public class PrintFile {
    public static void main(String[] args) {
        PrintWriter PW=new PrintWriter(System.out,true);
        File FL=new File(".");
        try {
            if (!FL.exists()) {
                FL.createNewFile();
            }
        }
        catch(IOException e){
                PW.println("ERROR");
        }
        File f1=new File(FL.getAbsolutePath());
        if(f1.isDirectory()){
            String[] S=f1.list();
            for(int i=0; i<S.length;i++){
                PW.println(new File(f1.getParent())+"/"+S[i]);
              //  PW.println(S[i]);
            }
        }

    }
}
