package Kollekcii;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by цербер on 17.08.2015.
 */
public class WriteDir {
     static List<String> PathDir(String ss){
         List ls=new ArrayList();
         File Dir=new File(ss);
         try{
             if(!Dir.exists())throw new IOException();
             Dir.getAbsolutePath();
             if(Dir.isDirectory()) {
               //  int k=Dir.list().length;

                 //Способ 1
/*                 String[] S=Dir.list();
                 for(int i=0;i<S.length;i++){
                     ls.add(S[i]);
                 }*/
                 //Способ 2
/*                 for(String s:Dir.list()){
                     ls.add(s);
                 }*/

                 //Способ 3
                 Collections.addAll(ls, Dir.list());
             }
         }catch (IOException e){
             System.err.println("Каталог отсутствует");
         }

     return ls;
     }

    public static void main(String[] args) {
        int k;
        String myPath="c:/Program Files";
        List<String> listDIR=new ArrayList<>();
        listDIR=PathDir(myPath);

        System.out.println("Содержимое папки "+myPath);
        if(listDIR.size()<5)k=listDIR.size();
        else k=5;
        for(int i=0;i<k;i++){
            System.out.println("/"+listDIR.get(i));
        }

    }
}
