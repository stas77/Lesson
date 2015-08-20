package POTOKI.ThreadTest;

/**
 * Created by user on 19.08.2015.
 */
public class CurrentThread {
    public static void main(String[] args) {
        Thread ct= Thread.currentThread();
        System.out.println(ct.getName());
        System.out.println(ct.getStackTrace());
        System.out.println(ct.getPriority());

        try{
            ct.sleep(2000);
            System.out.println(ct.getState());
        }catch (InterruptedException e){
            System.out.println("поток поломался");
        }
    }
}
