package Obekty;

/**
 * Created by user on 03.08.2015.
 */
public class Car3 {
    public Car3(String colorCar, int year) {
        this.colorCar = colorCar;
        this.year = year;
    }

    String colorCar;
    int year;

    Car3 resetCar(Car3 a,String colorCar, int year){
        a.colorCar=colorCar;
        a.year=year;
        return a;
    }

}
