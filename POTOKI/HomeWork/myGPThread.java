package POTOKI.HomeWork;

/**
 * Created by цербер on 19.08.2015.
 */
public class myGPThread implements Runnable{
    private int g;
    private Thread thread;

    public myGPThread(int g) {
        this.g = g;
        thread=new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        double S;

        S=0;
        for (int i = 0; i <this.g ; i++) {
            S=S+(i+1);
        }
        System.out.println(thread.currentThread().getName()+"  S("+this.g+")= "+S);
    }
}
