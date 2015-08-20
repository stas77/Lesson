package Kollekcii.Translate;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by цербер on 18.08.2015.
 */
public class WRFile {
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public PrintWriter getPW() {
        return PW;
    }

    public void setPW(PrintWriter PW) {
        this.PW = PW;
    }

// чтение файла***********************************************************
    public Map<String,String> ReadFin(){
        String line,s,s1,s2;
        int j;

        s1=""; s2="";
        Map<String,String> map=new HashMap<String,String>();
        File F=new File(this.nameF);
        try{
            if(!F.exists())throw  new IOException();
            BufferedReader Fin = new BufferedReader(new FileReader(F));
            while ((line = Fin.readLine()) != null) {
                j = line.indexOf(" ");
                s1=line.substring(0, j);
                s1=s1.trim();
                s2=line.substring(j);
                s2=s2.trim();
                map.put(s1, s2);
            }
        }catch(IOException e) {
            System.err.println("Отсутствует словарь!!!");
        }
        return map;
    }
//запись файла*********************************************************
    public void WriteFout(Map<String,String> hm)throws IOException {
        Fout=new File(this.nameF);
        this.PW=new PrintWriter(Fout);
        if(!Fout.exists()){
            Fout.createNewFile();
        }
        for(Map.Entry<String,String> entry:hm.entrySet()) {
            this.PW.println(entry.getKey() + " " + entry.getValue());
        }
        this.PW.close();
    }
}
