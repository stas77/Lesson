package Exceptions.ObjPK;

/**
 * Created by user on 14.08.2015.
 */
public class PK {
    String name;
    int Monitor;
    int ROM;

    public PK(String name,int monitor, int ROM) {
        Monitor = monitor;
        this.name = name;
        this.ROM = ROM;
    }

    public int getMonitor() {
        return Monitor;
    }

    public void setMonitor(int monitor) {
        Monitor = monitor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getROM() {
        return ROM;
    }

    public void setROM(int ROM) {
        this.ROM = ROM;
    }
}
