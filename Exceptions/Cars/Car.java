package Exceptions.Cars;

/**
 * Created by цербер on 16.08.2015.
 */
public class Car {
    String name;
    int v;
    int speed;
    String color;
    String fuel;

    public Car(String name, int v, int speed, String color, String fuel) {
        this.name = name;
        this.v = v;
        this.speed = speed;
        this.color = color;
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
