package POTOKI.HomeWork;

/**
 * Created by цербер on 19.08.2015.
 */
public class MainFactorial {
    public static void main(String[] args) {
        Thread[] th=new Thread[100];

        for (int i = 0; i <100 ; i++) {
            th[i]=new Factorial(i+1);
            th[i].start();
        }
    }
}
