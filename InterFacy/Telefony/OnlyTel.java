package InterFacy.Telefony;

/**
 * Created by цербер on 10.08.2015.
 */
public class OnlyTel extends MobTel {
    private String screen;

    public OnlyTel(String name, String number, String SMStext,
                   int nsim, int RAM, int battery, String screen) {
        super(name, number, SMStext, nsim, RAM, battery);
        this.screen = screen;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }
    public String TTX(){
        String ss=super.TTX()+" "+getNsim()+" "+getRAM()+" "+getBattery()+" "+getScreen();
        return ss;
    }

    @Override
    public void SMS(Telefon a, Telefon b, String sms) {
        super.SMS(a, b, sms);
    }
}
