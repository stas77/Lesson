package INKAPS;

import INKAPS.Firma_OK.Employee;
import INKAPS.Firma_OK.Manager;

/**
 * Created by цербер on 08.08.2015.
 */
public class Firma {
    public static void main(String[] args) {
//       Employee rab=new Employee();
//            rab.setName("Вася");
//            rab.setAge(40);
//            rab.setWrExp(20);
//            rab.setWrExprComp(1);
//            rab.setPosition("Грузчик");
//
//        Employee storekeeper=new Employee();
//            storekeeper.setName("Галя");
//            storekeeper.setAge(60);
//            storekeeper.setWrExp(40);
//            storekeeper.setWrExprComp(40);
//            storekeeper.setPosition("Кладовщик");
//
//        Employee driver=new Employee();
//            driver.setName("Степан");
//            driver.setAge(30);
//            driver.setWrExp(11.5f);
//            driver.setWrExprComp(2);
//            driver.setPosition("Водитель");
//
//        Employee manager=new Employee();
//            manager.setName("Света");
//            manager.setAge(30);
//            manager.setWrExp(11.5f);
//            manager.setWrExprComp(10);
//            manager.setPosition("Менеджер");
//
//        Employee programmer=new Employee();
//            programmer.setName("Кирилл");
//            programmer.setAge(35);
//            programmer.setWrExp(10.5f);
//            programmer.setWrExprComp(7);
//            programmer.setPosition("Программист");
//
//        Employee topmanager=new Employee();
//            topmanager.setName("Иван");
//            topmanager.setAge(40);
//            topmanager.setWrExp(18.5f);
//            topmanager.setWrExprComp(15);
//            topmanager.setPosition("Руководитель отдела");
//        Employee Direktor=new Employee();
//            Direktor.setName("Эдуард");
//            Direktor.setAge(45);
//            Direktor.setWrExp(20);
//            Direktor.setWrExprComp(1);
//            Direktor.setPosition("Директор");

        //  System.out.println(topmanager.getSalery());


        String[] personal={
                "Вася","40","20","1","Грузчик",
                "Галя","60","40","40","Кладовщик",
                "Степан","30","11.5","2","Водитель",
                "Света","30","11.5","10","Менеджер",
                "Кирилл","35","10.5","7","Программист",
                "Иван","40","18.5","15","Руководитель отдела",
                "Эдуард","45","20","1","Директор" };
        int Npip=personal.length/5;
        int j;
        Employee[] sotrudnik=new Employee[Npip];
        for(int i=0;i<3;i++){
            j=i*5;
            sotrudnik[i]= new Employee();
            sotrudnik[i].setName(personal[j]);
            sotrudnik[i].setAge(Integer.parseInt(personal[j + 1]));
            sotrudnik[i].setWrExp(Float.parseFloat(personal[j + 2]));
            sotrudnik[i].setWrExprComp(Float.parseFloat(personal[j + 3]));
            sotrudnik[i].setPosition(personal[j + 4]);
        }
        Manager[] boss=new Manager[4];
        for(int i=3;i<7;i++){
            j=i*5;
            boss[i-3]=new Manager();
            boss[i-3].setName(personal[j]);
            boss[i-3].setAge(Integer.parseInt(personal[j + 1]));
            boss[i-3].setWrExp(Float.parseFloat(personal[j + 2]));
            boss[i-3].setWrExprComp(Float.parseFloat(personal[j + 3]));
            boss[i-3].setPosition(personal[j + 4]);
            boss[i-3].setBonus((i - 2) * 1000);
            sotrudnik[i]= boss[i-3];
          //  sotrudnik[i]..setBonus(1000);
        }
        for(int i=0;i<Npip;i++){
            System.out.println(sotrudnik[i].ID());
        }
        System.out.println();
        for(int i=0;i<Npip;i++){
            System.out.println(sotrudnik[i].KK());
        }
        System.out.println();
        System.out.println("проверка");
        sotrudnik[3].ID();
        System.out.println(sotrudnik[4].getName());
    }
}
