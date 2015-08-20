package POTOKI.Demon;

/**
 * Created by user on 19.08.2015.
 */
public class MainTest {
    Thread t=Thread.currentThread();
    Thread thr1=new Thread(new DemonTest(),"2 thread");
}
