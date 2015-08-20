package INKAPS.JavaRedKod;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by цербер on 09.08.2015.
 */
public class myJavaFile {
    private String nameJavaF;
    private String StrKod;
    private PrintWriter PW;
    File Fout;

    public void setPW(PrintWriter PW) {
        this.PW = PW;
    }

    int p;
    String s1;

    public String getNameJavaF() {
        return nameJavaF;
    }

    public void setNameJavaF(String nameJavaF) {
        this.nameJavaF = nameJavaF;
    }

    public String getStrKod() {
        return StrKod;
    }

    public void setStrKod(String strKod) {
        StrKod = strKod;
    }

// создание файла
    public void CreteJavaFile()throws IOException {
        this.nameJavaF=this.nameJavaF+".java";
        Fout=new File("src/"+this.nameJavaF);
        this.PW=new PrintWriter(Fout);
        if(!Fout.exists()){
            Fout.createNewFile();
        }
        p=this.nameJavaF.indexOf(".");
        s1 = "public class "+this.nameJavaF.substring(0,p)+" {";
        System.out.println(s1);
        this.PW.println(s1);
        s1="public static void main(String[] args) {";
        System.out.println(s1);
        this.PW.println(s1);
    }

    public void AddJavaKod(String aa)throws IOException{
        this.StrKod=aa;
        this.PW.println(this.StrKod);
    }

    public void CloseJavaFile(){
        this.StrKod="}";
        this.PW.println(this.StrKod);
        this.StrKod="}";
        this.PW.println(this.StrKod);
        this.PW.close();
    }
}
