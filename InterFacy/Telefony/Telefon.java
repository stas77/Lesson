package InterFacy.Telefony;

/**
 * Created by user on 10.08.2015.
 */
public abstract class Telefon {
    private String name;
    private String number;
    private String SMStext;

    public Telefon(String name, String number, String SMStext) {
        this.name = name;
        this.number = number;
        this.SMStext = SMStext;
    }

    public String getName() {
        return name;
    }

    public String getSMStext() {
        return SMStext;
    }

    public void setSMStext(String SMStext) {
        this.SMStext = SMStext;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String TTX(){
        String ss=this.name+" "+this.number;
        return ss;
    }

    public void SMS(Telefon a, Telefon b,String sms){
        a.setSMStext(sms);
        b.setSMStext(a.getSMStext());
        System.out.println("SMS от: <" + a.getNumber() + "> на номер <" + b.getNumber() + ">");
        System.out.println(b.getSMStext());
    }

}

