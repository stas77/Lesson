package INKAPS.kassa_kafe;

/**
 * Created by ������ on 09.08.2015.
 */
public class tovar {
    private String nazv;
    private String nazv2;
    private float cena;
    int koli4stvo;

    public int getKoli4stvo() {
        return koli4stvo;
    }

    public void setKoli4stvo(int koli4stvo) {
        this.koli4stvo = koli4stvo;
    }

    public String getNazv() {
        return nazv;
    }

    public void setNazv(String nazv) {
        this.nazv = nazv;
    }

    public String getNazv2() {
        return nazv2;
    }

    public void setNazv2(String nazv2) {
        this.nazv2 = nazv2;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }


   public float Sum(){
        return this.cena*this.koli4stvo;
    }

}
