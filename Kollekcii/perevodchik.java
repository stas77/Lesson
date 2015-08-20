package Kollekcii;

import Kollekcii.Translate.WRFile;

import java.io.IOException;
import java.util.*;

/**
 * Created by user on 18.08.2015.
 */
public class perevodchik {
  /*  static File FileWrite(){
        File Fout=new File("BDtranslate.txt");
        try{
            if(!Fout.exists()){
                Fout.createNewFile();
            }
            PrintWriter pw=new PrintWriter(Fout);

            pw.close();
        } catch (IOException e) {

        }

       *//* myJavaFile javaKod=new myJavaFile();
        javaKod.setNameJavaF(s1);
        javaKod.CreteJavaFile();*//*
    }*/

    public static void main(String[] args) throws IOException {
        String slovo;
        String s1,s2;
        int i,j;
        Map<String,String> Vocab=new HashMap<String,String>();
        Vocab.put("door", "дверь");
        Vocab.put("apple", "яблоко");
        Vocab.put("write", "писать");
        Vocab.put("read", "читать");
        Vocab.put("swim", "плавать");
        Vocab.put("play", "играть");
        Vocab.put("car", "машина");

        Scanner sc=new Scanner(System.in);
        System.out.println("Введите строку (english)");
       // slovo=sc.next();
        slovo="apple swim car cat door";
        System.out.println(slovo);

        j= 0;
        s2="";
        while (j<1000){
            j = slovo.indexOf(" ");
            if(j<0)j=slovo.length();
            s1=slovo.substring(0, j);
            s1=s1.trim();
            try {
                if(!Vocab.containsKey(s1))throw new Exception();
                s2 = s2 + Vocab.get(s1) + " ";
            }catch (Exception e){
                s2=s2+"error"+ " ";
            }

            if(j==slovo.length()) break;
            slovo=slovo.substring(j);
            slovo=slovo.trim();
        }
        System.out.println(s2);

        WRFile WFout=new WRFile();
        WFout.setNameF("BDtranslate.txt");
        WFout.WriteFout(Vocab);


/*        System.out.println("Введите слово (русский)");
        slovo=sc.next();
       // Map.Entry<String,String> aa;
      //  aa=new Vocab();
        for(Map.Entry<String,String> aa:Vocab.entrySet()){
            System.out.println(aa.getKey());
        }*/
    }
}
