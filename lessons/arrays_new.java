package lessons;

import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;

/**
 * Created by user on 23.07.2015.
 */
public class arrays_new {
    public static void main(String[] args) {
        float[] mas1 = new float[11];
        float[] mas2;
       // ArrayList<Float> mas2 = new ArrayList<>();
        for (short i = 0; i < mas1.length; i++) {
            mas1[i] = (float) Math.round(Math.random() * 1000) / 10;
        }
        mas2=Arrays.copyOf(mas1,mas1.length);
       // mas2=mas1;
        Arrays.sort(mas2);
       // mas2=Arrays.copyOf(mas2,Math.round((int) (mas1.length * 1.5)));
        mas2=Arrays.copyOf(mas2,(int) (mas1.length * 1.5));

        System.out.println("mas1" + Arrays.toString(mas1));
        System.out.println("mas2" + Arrays.toString(mas2));
    }
}
