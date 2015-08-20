package POTOKI.Demon;

/**
 * Created by user on 19.08.2015.
 */
public class DemonTest implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }
}
