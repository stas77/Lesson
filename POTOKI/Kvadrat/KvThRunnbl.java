package POTOKI.Kvadrat;

/**
 * Created by user on 19.08.2015.
 */
public class KvThRunnbl implements Runnable {
    private int a;
    private Thread thread;

    public KvThRunnbl(int a) {
        this.a = a;
        thread=new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        int S,P;
        synchronized (this) {
                S=this.a*this.a;
                P=4*this.a;
                System.out.println("Runnable "+thread.currentThread().getName()+
                        " сторона="+this.a+" S="+S+" P="+P);
        }
    }
}
