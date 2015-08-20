package POTOKI.Synhronize;

/**
 * Created by user on 19.08.2015.
 */
public class MainSynch {
    public static void main(String[] args)throws InterruptedException{
        ThreadTest threadTest=new ThreadTest();
        Thread thread=new Thread(threadTest);
        thread.start();

        //1
        Thread.sleep(5);
        threadTest.methodC("MainSynch ");

        //2
        Thread.sleep(5);
        threadTest.methodD("MainSynch ");

        //3
        Thread.sleep(5);
        threadTest.methodD("MainSynch ");

        Thread.sleep(5);
        threadTest.methodB("MainSynch ");
    }
}
