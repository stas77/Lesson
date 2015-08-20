package Nasledie.Firma_OK;

/**
 * Created by цербер on 09.08.2015.
 */
public class Manager extends Employee {
        private float bonus;

    public Manager(String name, int age, float wrExp, float wrExprComp,
                   String position, float bonus) {
        super(name, age, wrExp, wrExprComp, position);
        this.bonus = bonus;
    }

    public float getBonus() {
            return bonus;
        }

        public void setBonus(float bonus) {
            this.bonus = bonus;
        }

        float accounting(){ // расчет Зар/плата
            float a=super.getStavka()*(Kage()+Kwe()+Kwec()+Kp())+this.bonus;
            return a;
        }
    public String KK(){
        String GG;
        GG=super.KK()+" бонус ( "+this.bonus+" )";
        return GG;
    }

    public String ID(){ //печать
        setSalery(accounting());
        String GG;
        GG=super.ID()+" бонус ( "+this.bonus+" )";
        return GG;
    }
}
