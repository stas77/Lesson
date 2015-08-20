package InterFacy.Telefony;

/**
 * Created by цербер on 10.08.2015.
 */
public class SmartFon extends MobTel implements GPS{
    private String OS;
    private int Ncpu;


    public SmartFon(String name, String number, String SMStext,
                    int nsim, int RAM, int battery, String OS, int ncpu) {
        super(name, number, SMStext, nsim, RAM, battery);
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

    @Override
    public void SMS(Telefon a, Telefon b, String sms) {
        super.SMS(a, b, sms);
    }

    @Override
    public void aGPS() {
        System.out.println("Я "+getName()+" и у меня есть GPS !!!");
    }
}
