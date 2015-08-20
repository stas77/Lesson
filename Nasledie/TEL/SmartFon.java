package Nasledie.TEL;

/**
 * Created by цербер on 10.08.2015.
 */
public class SmartFon extends MobTel {
    private String OS;
    private int Ncpu;


    public SmartFon(String name, String number, int nsim, int RAM, int battery,
                    String OS, int ncpu) {
        super(name, number, nsim, RAM, battery);
        this.OS = OS;
        Ncpu = ncpu;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getNcpu() {
        return Ncpu;
    }

    public void setNcpu(int ncpu) {
        Ncpu = ncpu;
    }
    public String TTX(){
        String ss=super.TTX()+" "+getNsim()+" "+getRAM()+" "+getBattery()+" "+getOS()+" "+getNcpu();
        return ss;
    }
}
