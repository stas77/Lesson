package INKAPS;

import INKAPS.BD.People;

import java.io.*;

/**
 * Created by цербер on 09.08.2015.
 */

public class RpeopleW {

    static String[] slovo(String s){
        int h1,h2,i;
        String kk;
        String[] SSS=new String[4];

        kk=s;
        i=0;
        while(kk.length()!=0){
            h1=kk.indexOf(":");
            kk=kk.substring(h1 + 1, kk.length());
            kk=kk.trim();
            h2=kk.indexOf(" ");
            if(h2<0)h2=kk.length();
            SSS[i]=kk.substring(0, h2);
            if(h2==kk.length())break;
            kk=kk.substring(h2+1,kk.length());
            i++;
        }
         return SSS;
    }


    public static void main(String[] args)throws IOException {
        int i1,i2,k;
        String[] AA=new String[4];
        String line,bs;
        String Lout;

        BufferedReader BufRd = new BufferedReader(new InputStreamReader(System.in));
        File F = new File("BD_customs.txt");
        BufferedReader Fin = new BufferedReader(new FileReader(F));

        File Fout=new File("BD_Email.txt");
        if(!Fout.exists()){
            Fout.createNewFile();
        }
        PrintWriter pw=new PrintWriter(Fout);

        i1 = 0;
        i2 = 0;
        bs=" ";
        k=1;
        while ((line = Fin.readLine()) != null) {
           // System.out.println(line);
            Lout = line;
            People[] man= new People[k];
            man[k-1]=new People();

            AA=slovo(Lout);
            man[k - 1].setName(AA[0]);
            man[k - 1].setAge(Integer.parseInt(AA[1]));
            man[k - 1].setTel(AA[2]);
            man[k - 1].setEmail(AA[3]);

          //  System.out.println( man[k-1].getName()+" "+man[k - 1].getAge()+" "+man[k - 1].getTel()+" "+man[k - 1].getEmail());
            // запись e-maila
            System.out.println(man[k - 1].getEmail());
            pw.println(man[k - 1].getEmail());
            k++;
        }
        Fin.close();
        pw.close();
    }
}
