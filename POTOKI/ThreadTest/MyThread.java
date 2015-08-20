package POTOKI.ThreadTest;

/**
 * Created by user on 19.08.2015.
 */
public class MyThread extends Thread{
    private String type;
    private int pause;

    public MyThread(String type, int pause) {
        this.type = type;
        this.pause = pause;
    }

    @Override
    public void run() {
        synchronized (this){
            for(int i=0;i<7;i++){
                System.out.println(type+" "+i);
                try {
                    Thread.sleep(pause);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
