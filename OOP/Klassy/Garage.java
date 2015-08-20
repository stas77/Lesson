package OOP.Klassy;

/**
 * Created by user on 30.07.2015.
 */
public class Garage {
    public static void main(String[] args) {
        Car m1=new Car();
        m1.color="green";
        m1.weight=1500;
        m1.year=1982;
        m1.print();
        m1.acceleration(30);
        m1.print();
        m1.beep();
        m1.deceleration(10);
        m1.print();
    }
}
