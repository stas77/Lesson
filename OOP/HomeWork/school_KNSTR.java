package OOP.HomeWork;

import java.util.Random;

/**
 * Created by цербер on 30.07.2015.
 */
public class school_KNSTR {

    public school_KNSTR(String tchName, String Uch,String subj, int Znanie, int mark ){
        this.tchName=tchName;
        this.Uch=Uch;
        this.subj=subj;
        this.Znanie=Znanie;
        this.mark=mark;
    }

    String tchName,Uch,subj;
    int Znanie,mark;

    void  Izuchenie(){
        Random rnd=new Random();
        Znanie=rnd.nextInt(100);
    }
    void Ocenka(){
        Izuchenie();
        if(Znanie<30){mark=1;}
        else if(Znanie<60){mark=2;}
             else if(Znanie<75){mark=3;}
                  else if(Znanie<89){mark=4;}
                       else mark=5;
    }
    void print(){
       // Ocenka();
        System.out.println(Uch + "     " + Znanie + "%      " + mark);
    }
}
