package POTOKI.HomeWork;

/**
 * Created by цербер on 19.08.2015.
 */
public class MainGmProgression {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new myGPThread(i+1);
        }

    }
}
