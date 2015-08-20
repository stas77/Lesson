package Obekty;

/**
 * Created by цербер on 03.08.2015.
 */
public class Kassa {
    public static void main(String[] args) {
        float SS=0f;
        Tovar[] TV=new Tovar[5];

        TV[0]=new Tovar("Бургер",35,2);
        TV[1]=new Tovar("Кола",15,3);
        TV[2]=new Tovar("Фри",15,4);
        TV[3]=new Tovar("фнури",40,4);
        TV[4]=new Tovar("кофе","бутерброд",30,2);


        for(int i=0; i<TV.length;i++){
            if(i<TV.length-1)System.out.print(TV[i].nazv + ": " + TV[i].koli4stvo + " шт");
            else System.out.print(TV[i].nazv+ "+"+TV[i].nazv2 +": " + TV[i].koli4stvo + " шт");
            System.out.println(" всего: " + TV[i].Sum());
            SS+=TV[i].Sum();
        }
        System.out.println("Всего: "+SS);
        System.out.println("Чаевые 15%: "+TV[1].Sum(SS,0.15f));
        System.out.println("К оплате: "+(float)(SS+TV[1].Sum(SS,0.15f)));
      //  System.out.println("Всего: "+SS);
      //  SS+=TV[1].Sum(TV[0].Sum());
      //  System.out.println(SS);
      //  System.out.println(TV[2].Sum(TV[1].Sum()));

    }
}
