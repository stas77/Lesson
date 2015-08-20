package POTOKI.Kvadrat;

import POTOKI.Kvadrat.KvThread;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by user on 19.08.2015.
 */
public class MainKvadr {
    public static void main(String[] args) throws IOException, InterruptedException {
        /*WrFile WFin=new WrFile();
        new WrFile().CreateFile("Вывод потоков.txt");*/
       // WFin.CreateFile();

        File Wfile=new File("Вывод потоков.txt");
        PrintWriter PW=new PrintWriter(Wfile);
        if(!Wfile.exists()){
            Wfile.createNewFile();
        }

        Thread[] ta=new Thread[6];

      //  KvThread[] ta=new KvThread[6];
        // class KvThread******************************************

        for(int i=0;i<ta.length;i++){
            KvThread fas=new KvThread(i+3,PW);
          //  ta[i]=new KvThread(i+3,PW);
            ta[i]=fas;
            ta[i].start();
            //System.out.println(ta[i].toString());
        }

/*        // KvThRunnbl *****************************************
        for(int i=0;i<ta.length;i++) {
            new KvThRunnbl(i + 3);
        }*/

        //WFin.CloseFile();
       // new WrFile().CloseFile();
        for (int i=0;i<ta.length;i++){
            ta[i].join();
        }
        for (int i=0;i<ta.length;i++){
            ta[i].interrupt();
        }
        PW.close();
        System.out.println("файл записан");
    }
}
