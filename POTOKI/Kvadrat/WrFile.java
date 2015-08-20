package POTOKI.Kvadrat;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by user on 19.08.2015.
 */
public class WrFile {
    private String nameF;
    private String text;
    private PrintWriter PW;
    File Fout;

    public String getNameF() {
        return nameF;
    }

    public void setNameF(String nameF) {
        this.nameF = nameF;
    }

    public PrintWriter getPW() {
        return PW;
    }

    public void setPW(PrintWriter PW) {
        this.PW = PW;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    //запись файла*********************************************************
    public void CreateFile(String nameF)throws IOException{
        Fout=new File(this.nameF);
        this.PW=new PrintWriter(Fout);
        if(!Fout.exists()){
            Fout.createNewFile();
        }
    }
    public void WriteFout(String text) {
            this.PW.println(this.text);

    }
    public void CloseFile(){
        this.PW.close();
    }
}
