package INKAPS.Firma_OK;

/**
 * Created by цербер on 09.08.2015.
 */
public class Manager extends Employee {
        private float bonus;

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
      //  System.out.println(" Имя: " + getName() + " Зар/пл=ставка*(Kвозр+Kостаж+Kстжк+Kдолж)+бонус "+
       //         this.getStavka()+"*("+this.Kage()+"+"+this.Kwe()+"+"+this.Kwec()+"+"+this.Kp()+")+"+
       //         bonus+"="+getSalery());
        GG=super.KK()+" бонус ( "+this.bonus+" )";
        return GG;
    }

    public String ID(){ //печать
        setSalery(accounting());
        String GG;
     //   System.out.println("Должность: "+getPosition()+" Имя: "+getName()+" возраст "+getAge()+
      //          " Общий стаж: "+getWrExp()+" стаж в компании: "+getWrExprComp()+
       //         " бонус: "+bonus+" Зар/плата: "+getSalery());
        GG=super.ID()+" бонус ( "+this.bonus+" )";
        return GG;
    }
}
