package POTOKI.ThreadTest;

/**
 * Created by user on 19.08.2015.
 */
public class MyThread2 implements Runnable{
    private String type;
    private int pause;
    private Thread thread;

    public MyThread2(String type,int pause) {
        this.pause = pause;
        this.type = type;
        thread=new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(type+" "+
            thread.currentThread().getName()+"- "+i);
            try{
                Thread.sleep(pause);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
