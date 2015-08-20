package POTOKI.HomeWork;

/**
 * Created by цербер on 19.08.2015.
 */
public class Factorial extends Thread {
    private Thread thread;
    private int k;

    public Factorial(int k) {
        this.k = k;
    }

    @Override
    public void run() {
        double Sk;

        Sk=1;
        for (int i = 0; i <this.k ; i++) {
            Sk=Sk*(i+1);
        }
        System.out.println(thread.currentThread().getName()+"  "+this.k+"!= "+Sk);
    }
}
