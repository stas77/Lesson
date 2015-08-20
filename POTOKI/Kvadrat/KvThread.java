package POTOKI.Kvadrat;

import java.io.PrintWriter;

/**
 * Created by user on 19.08.2015.
 */
public class KvThread extends Thread {
    private int a;
    private String textOut;
    private Thread thread;
    private PrintWriter PpWw;

    public KvThread(int a,PrintWriter PpWw) {
        this.a = a;
        this.PpWw=PpWw;
    }

    public PrintWriter getPpWw() {
        return PpWw;
    }

    public void setPpWw(PrintWriter ppWw) {
        PpWw = ppWw;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getTextOut() {
        return textOut;
    }

    public void setTextOut(String textOut) {
        this.textOut = textOut;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        int S,P;
      //  synchronized (this) {
           /* S=this.a*this.a;
            P=4*this.a;
            this.text=thread.currentThread().getName()+
                    " сторона="+this.a+" S="+S+" P="+P;*/
            this.textOut=toString();
            this.PpWw.println(this.textOut);
            System.out.println(this.textOut);
      //  }
    }

    @Override
    public String toString() {
        int S,P;
        String tx;
        S=this.a*this.a;
        P=4*this.a;
        tx=thread.currentThread().getName()+
                " сторона="+this.a+" S="+S+" P="+P;
        return tx;
    }

/*    public String TX(){
        int S,P;
        String tx;
        S=this.a*this.a;
        P=4*this.a;
        tx=thread.currentThread().getName()+
                " сторона="+this.a+" S="+S+" P="+P;
        return tx;
    }*/

}
