package Nasledie.TEL;

/**
 * Created by user on 10.08.2015.
 */
public class Telefon {
    private String name;
    private String number;
    private String SMStext;

    public Telefon(String name, String number, String SMStext) {
        this.name = name;
        this.number = number;
        this.SMStext = SMStext;
    }

    public Telefon(String name, String number) {
        this.name = name;
        this.number = number;
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
    public void SMS(String nomer,String textSMS){
       // setSMStext("SMS от: <"+this.number+"> "+textSMS);
        System.out.println("SMS от: <"+this.number+"> на номер <"+nomer+"> "+textSMS);
    }
    public void newSMS(Telefon a, Telefon b,String sms){
        a.setSMStext(sms);
        b.setSMStext(a.getSMStext());
        System.out.println("SMS от: <" + a.getNumber() + "> на номер <" + b.getNumber() + ">");
        System.out.println(b.getSMStext());
    }

}

