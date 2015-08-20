package Nasledie.TEL;

/**
 * Created by цербер on 10.08.2015.
 */
public class MobTel extends Telefon{
    private int Nsim;
    private int RAM;
    private int battery;

    public MobTel(String name, String number, int nsim, int RAM, int battery) {
        super(name, number);
        Nsim = nsim;
        this.RAM = RAM;
        this.battery = battery;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getNsim() {
        return Nsim;
    }

    public void setNsim(int nsim) {
        Nsim = nsim;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
