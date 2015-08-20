package POTOKI.ThreadTest;

/**
 * Created by user on 19.08.2015.
 */
public class Main {
    public static void main(String[] args) {
     /*   Thread thread1=new MyThread("thread1",1000);
        Thread thread2=new MyThread("thread2",750);
        Thread thread3=new MyThread("thread3",500);
        //запуск потоков
        thread1.start();
        thread2.start();
        thread3.start();*/

       /* new MyThread2("MyThread.2.1",300);
        new MyThread2("MyThread.2.2",1000);*/

        //массив потоков
        Thread[] ta=new Thread[5];
        for(int i=0;i<ta.length;i++){
            ta[i]=new MyThread("re"+i,500);
            ta[i].start();
        }
    }
}
