package Nasledie.Firma_OK;

/**
 * Created by цербер on 08.08.2015.
 */
public class Employee {
    private String name;
    private int age;
    private float WrExp;
    private float WrExprComp;
    private String position;
    private float Salery;
    private float stavka=500f;

    public Employee(String name, int age, float wrExp, float wrExprComp,
                    String position) {
        this.name = name;
        this.age = age;
        WrExp = wrExp;
        WrExprComp = wrExprComp;
        this.position = position;
    }

    public void setSalery(float salery) {
        Salery = salery;
    }

    public float getStavka() {
        return stavka;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getWrExp() {
        return WrExp;
    }
    public void setWrExp(float wrExp) {
        WrExp = wrExp;
    }
    public float getWrExprComp() {
        return WrExprComp;
    }
    public void setWrExprComp(float wrExprComp) {
        WrExprComp = wrExprComp;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public void setStavka(float stavka) {
        this.stavka = stavka;
    }

    public float getSalery() {
        return Salery;
    }

    float Kage(){ // коеффициент за возраст
        float a;
        if(this.age<55){a=1.0f;}
        else a=1.05f;
        return a;
    }

    float Kwe() {// коеффициент за Общий стаж
        float a;
        if (this.WrExp < 10) {a = 1.0f;}
        else
                if (this.WrExp < 20) {
                     a = 1.5f;
                } else if (this.WrExp < 30) {
                            a = 2.0f;
                        } else a = 2.5f;
                    return a;
    }

    float Kwec(){// коеффициент за стаж в компании
        float a;
        if (this.WrExprComp < 3) {a = 1.0f;}
        else
            if (this.WrExp < 5) { a = 1.5f;}
            else
                if (this.WrExp < 10) {
                    a = 2.0f;
                } else
                    if (this.WrExp < 20) {
                        a = 2.5f;
                    } else a = 3.0f;
        return a;
    }

    float Kp(){//коеффициент за Должность
        float a = 1f;
        switch (this.position){
            case             "Грузчик" : a=1.0f; break;
            case           "Кладовщик" : a=1.1f; break;
            case            "Водитель" : a=1.5f; break;
            case            "Менеджер" : a=2f; break;
            case         "Программист" : a=2.5f; break;
            case "Руководитель отдела" : a=2.7f; break;
            case            "Директор" : a=5f; break;
        }
        return a;
    }

    float accounting(){ // расчет Зар/плата
        float a=stavka*(Kage()+Kwe()+Kwec()+Kp());
        return a;
    }
    public String KK(){
        String GG;
        GG=" Зар/пл=ставка*(Kвозр+Kостаж+Kстжк+Kдолж) "+
                stavka+"*("+this.Kage()+"+"+this.Kwe()+"+"+this.Kwec()+"+"+this.Kp()+")="+this.Salery;
       // System.out.println();
        return GG;
    }

    public String ID(){ //печать
        String GG;
        this.Salery=accounting();
       // System.out.println("Должность: "+this.position+" Имя: "+this.name+" возраст "+this.age+
      //                    " Общий стаж: "+this.WrExp+" стаж в компании: "+this.WrExprComp+" Зар/плата: "+this.Salery);
        GG="Должность: "+position+" Имя: "+name+" возраст "+age+
                            " Общий стаж: "+WrExp+" стаж в компании: "+WrExprComp+" Зар/плата: "+this.Salery;
        return GG;
    }
}
