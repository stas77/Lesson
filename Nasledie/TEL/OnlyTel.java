package Nasledie.TEL;

/**
 * Created by цербер on 10.08.2015.
 */
public class OnlyTel extends MobTel {
    private String screen;

    public OnlyTel(String name, String number,
                   int nsim, int RAM, int battery, String screen) {
        super(name, number, nsim, RAM, battery);
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

}
