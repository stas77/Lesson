package POTOKI.MainSynk2;

/**
 * Created by user on 19.08.2015.
 */
public class ThreadTest implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<500000;i++){
            MainSynch.runIncrement();
        }
    }
}
