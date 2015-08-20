package Obekty;

/**
 * Created by user on 03.08.2015.
 */
public class garage3 {
    public static void main(String[] args) {
        Car3 mazda=new Car3("red",2015);
        Car3 ford=new Car3("green",2000);
        System.out.println(mazda.colorCar+" "+mazda.year);

        mazda.resetCar(ford,"yellow",ford.year);
       // mazda=mazda.resetCar(mazda,"Blue",2009);

        System.out.println(mazda.colorCar+" "+mazda.year);
        System.out.println(ford.colorCar+" "+ford.year);
    }
}
