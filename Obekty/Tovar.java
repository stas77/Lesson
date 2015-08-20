package Obekty;

/**
 * Created by цербер on 03.08.2015.
 */
public class Tovar {
    public Tovar(String nazv, float cena, int koli4stvo) {
        this.nazv = nazv;
        this.cena = cena;
        this.koli4stvo=koli4stvo;
    }

    public Tovar(String nazv, String nazv2, float cena,int koli4stvo) {
        this.nazv = nazv;
        this.nazv2 = nazv2;
        this.cena = cena;
        this.koli4stvo=koli4stvo;
    }

    String nazv,nazv2;
    float cena,SS;
    int koli4stvo;

    float Sum(){
        return cena*koli4stvo;
    }
    float Sum(float SS,float tip){
        return SS*tip;
    }

}
