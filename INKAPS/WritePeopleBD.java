package INKAPS;

import INKAPS.BD.People;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by user on 04.08.2015.
 */

public class WritePeopleBD {
    public static void main(String[] args) {
        int j;
        String[] mm= {"Вася", "15", "123987456", "vasy@mail.ru",
                      "Маша", "25", "987123", "misha@bigmir.net",
                      "Егор", "35", "158932", "egor@gmail.com",
                      "Катя", "18", "985", "kat@yahoo.com",
                      "Игорь", "30", "03", "igor.dat@ukr.net"
        };
        People[] man= new People[mm.length/4];
        for(int i=0;i<man.length;i++){
            j=i*4;
            man[i]=new People();
            man[i].setName(mm[j]);
            man[i].setAge(Integer.parseInt(mm[j + 1]));
            man[i].setTel(mm[j + 2]);
            man[i].setEmail(mm[j + 3]);
        }

        File ff=new File("BD_customs.txt");
        try{
            if(!ff.exists()){
                ff.createNewFile();
            }
            PrintWriter pw=new PrintWriter(ff);
            try{
                for (int i = 0; i < man.length; i++) {
                    pw.println(man[i].WriteBD());
                }
            }
            finally {
                pw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(man[2].WriteBD());

    }
}
