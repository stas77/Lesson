package POTOKI.MainSynk2;

/**
 * Created by user on 19.08.2015.
 */
public class MainSynch {
    static int inkrement=0;
    static void runIncrement(){
        inkrement++;
    }

    public static void main(String[] args)throws InterruptedException{
        ThreadTest threadTest=new ThreadTest();
        Thread thread=new Thread(threadTest);
        thread.start();
        for(int i=0;i<500000;i++){
            runIncrement();
        }
        thread.join();
        System.out.println(inkrement);
    }
}
