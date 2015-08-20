package OOP.Klassy;

/**
 * Created by user on 30.07.2015.
 */
public class Car {
    String color;
    double weight;
    int year;
    private double velosity=0;

    void beep(){
        System.out.println("BEPP-BEPP !!!");
    }

    void acceleration(double a){
        velosity+=a;
    }

    void deceleration(double b){
        if(velosity-b>=0) velosity-=b;
    }

    void print(){
        System.out.println("Color:  "+color);
        System.out.println("Weight: "+weight);
        System.out.println("Year car: "+year);
        System.out.println("Velosity: "+velosity);
    }
}
