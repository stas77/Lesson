package INKAPS;

import INKAPS.kassa_kafe.tovar;

/**
 * Created by цербер on 09.08.2015.
 */
public class kassa {
    public static void main(String[] args) {
        float SS=0f;
        int j;

        String[] TT={
                "Бургер","35","2",
                "Кола","15","3",
                "Фри","15","4"
        };
        String[] TT1={
                "кофе","бутерброд","35","2",
                "Кола","Бургер","40","1"
        };

        tovar[] TV=new tovar[5];
        for(int i=0;i<3;i++){
            j=i*3;
            TV[i]= new tovar();
            TV[i].setNazv(TT[j]);
            TV[i].setCena(Float.parseFloat(TT[j + 1]));
            TV[i].setKoli4stvo(Integer.parseInt(TT[j + 2]));
        }

        for(int i=3;i<5;i++){
            j=(i-3)*4;
            TV[i]= new tovar();
            TV[i].setNazv(TT1[j]);
            TV[i].setNazv2(TT1[j + 1]);
            TV[i].setCena(Float.parseFloat(TT1[j + 2]));
            TV[i].setKoli4stvo(Integer.parseInt(TT1[j + 3]));
        }

        for(int i=0; i<TV.length;i++) {
            if (i < 3) System.out.println(TV[i].getNazv() + ":  кол-во: " + TV[i].getKoli4stvo() + " шт " +
                    TV[i].getCena() + " грн. стоимость " + TV[i].Sum() + " грн.");
            else System.out.println(TV[i].getNazv() + " + " + TV[i].getNazv2() + ":  кол-во: " + TV[i].getKoli4stvo()  + " шт " +
                    TV[i].getCena() + " грн. стоимость " + TV[i].Sum() + " грн.");
//            else System.out.print(TV[i].nazv+ "+"+TV[i].nazv2 +": " + TV[i].koli4stvo + " шт");
//            System.out.println(" всего: " + TV[i].Sum());
            SS+=TV[i].Sum();
        }
        System.out.println("Всего: "+SS);
    //    System.out.println("Чаевые 15%: "+TV[1].Sum(SS,0.15f));
    //    System.out.println("К оплате: "+(float)(SS+TV[1].Sum(SS,0.15f)));
    }
}
