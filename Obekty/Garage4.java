package Obekty;

/**
 * Created by user on 03.08.2015.
 */
class Car4 {
    int year;
    String color;

    Car4(int t, String color) {
        year = t;
        this.color = color;
    }

    Car4 newCar4() {
        Car4 prototyp = new Car4(year + 5, "Red");
        return prototyp;
    }
}

public class Garage4 {
    public static void main(String[] args) {
        Car4 reno=new Car4(1999,"Blue");
        Car4 lada;

        lada=reno.newCar4();

        System.out.println("reno.color: "+reno.color);
        System.out.println("lada.color: "+lada.color);

    }
}


