package Nasledie;


import Nasledie.TEL.OnlyTel;
import Nasledie.TEL.SmartFon;
import Nasledie.TEL.Telefon;

/**
 * Created by user on 10.08.2015.
 */
public class Telofony_Main {
    public static void main(String[] args) {
        int j;
        Telefon telfon=new Telefon("phillips","0441237788");
        OnlyTel onltel=new OnlyTel("Nokia 225","0502223344",2, 512,1020,"цвет");
//        String[] MasSF= {"Lenovo P780","0671112233","2","1000","4000","android","4",
//                        "Nokia Lum730","0634445566","2","1000","2220","Windows Phone 8.1","4",
//                        "iPhone 6","0978889911","1","1000","1810","Apple iOS 8","2"
//                        };
//        SmartFon[] smatr=new SmartFon[MasSF.length/7];
//        for(int i=0;i<MasSF.length;i++){
//            j=i*MasSF.length/7;
//            smatr[i]=new SmartFon();
//        }

        SmartFon Lenovo=new SmartFon("Lenovo P780","0971112233",2,1000,4000,"android",4);
        SmartFon Nokia=new SmartFon("Nokia Lum730","0634445566",2,1000,2220,"Windows Phone 8.1",4);
        SmartFon iPhone=new SmartFon("iPhone 6","0508889911",1,1000,1810,"Apple iOS 8",2);

        System.out.println(telfon.TTX());
        System.out.println(onltel.TTX());
        System.out.println(Lenovo.TTX());
        System.out.println(Nokia.TTX());
        System.out.println(iPhone.TTX());

        // telfon.SMS(Lenovo.getNumber(),"Привет!!!");

        System.out.println();
        Telefon t1=Lenovo;
        Telefon t2=iPhone;
        telfon.newSMS(t1, t2, "Привет!!!");

        System.out.println();
        System.out.println("Проверка");
        System.out.println("исходящий "+t1.getNumber());
        System.out.println("входящий " + t2.getNumber());
        System.out.println("текст " + t2.getSMStext());


      //  Lenovo.setSMStext(telfon.getSMStext());
     //   Lenovo.setSMStext("Привет!!!");

        //telfon.SMS("Привет!");
        //System.out.println(Lenovo.getSMStext());

//        SmartFon[] smartfon=new SmartFon[3];
//        for(int i=0;i<smartfon.length;i++){
//            j=i*smartfon.length;
//            smartfon[i]= new SmartFon();
//            smartfon[i].setName(MasSF[j]);
//            smartfon[i].setNumber(MasSF[j + 1]);
//            smartfon[i].setNsim(Integer.parseInt(MasSF[j + 2]));
//            smartfon[i].setRAM(Integer.parseInt(MasSF[j + 3]));
//            smartfon[i].setBattery(Integer.parseInt(MasSF[j + 4]));
//            smartfon[i].setOS(MasSF[j + 5]);
//            smartfon[i].setNcpu(Integer.parseInt(MasSF[j + 6]));
//        }


    }
}
