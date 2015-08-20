package Obekty;

/**
 * Created by user on 03.08.2015.
 */
public class PK {
    public PK(String OS, String CPU, String monitor) {
        this.OS = OS;
        this.CPU = CPU;
        this.monitor = monitor;
    }
    String OS,CPU,monitor;

    PK ChangeSystem(PK pkOB, String os, String cpu, String monitor){
        pkOB.OS=os;
        pkOB.CPU=cpu;
        pkOB.monitor=monitor;
        return pkOB;
    }

}
