package Kollekcii.Translate;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by цербер on 18.08.2015.
 */
public class MainTranslate {
    public static void main(String[] args) throws IOException {
        String slovo;
        String s,s1,s2;
        int i,j;
        Map<String,String> Vocab=new HashMap<String,String>();
        String Fname="BDtranslate.txt";
       /* Vocab.put("door", "дверь");
        Vocab.put("apple", "яблоко");
        Vocab.put("write", "писать");
        Vocab.put("read", "читать");
        Vocab.put("swim", "плавать");
        Vocab.put("play", "играть");
        Vocab.put("car", "машина");*/

        WRFile WFin=new WRFile();
        WFin.setNameF(Fname);
        Vocab=WFin.ReadFin();

        Scanner sc=new Scanner(System.in);
        System.out.println("Введите строку (english)");
        // slovo=sc.next();
        slovo="apple  pen sky door";
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
                System.err.println("нет перевода для: " + s1);
                System.err.println("Введите перевод: ");
                s=sc.next();
                Vocab.put(s1, s);
                s2 = s2 + Vocab.get(s1) + " ";
            }

            if(j==slovo.length()) break;
            slovo=slovo.substring(j);
            slovo=slovo.trim();
        }
        System.out.println(s2);

        WRFile WFout=new WRFile();
        WFout.setNameF(Fname);
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

