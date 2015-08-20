package Nasledie;


import Nasledie.Firma_OK.Employee;
import Nasledie.Firma_OK.Manager;

/**
 * Created by цербер on 08.08.2015.
 */
public class Firma_Main {
    public static void main(String[] args) {
        Employee gruzchik=new Employee("Вася",40,20,1,"Грузчик");
        Employee kladovsh=new Employee("Галя",60,40,40,"Кладовщик");
        Employee driver=new Employee("Степан",30,11.5f,2,"Водитель");
        Manager manager=new Manager("Света",30,11.5f,10,"Менеджер",1000);
        Manager programmer=new Manager("Кирилл",35,10.5f,7,"Программист",2000);
        Manager chif=new Manager("Иван",40,18.5f,15,"Руководитель отдела",3000);
        Manager boss=new Manager("Эдуард",45,20,1,"Директор",5000);
        System.out.println(gruzchik.ID());
        System.out.println(gruzchik.KK());
        System.out.println(kladovsh.ID());
        System.out.println(kladovsh.KK());
        System.out.println(driver.ID());
        System.out.println(driver.KK());
        System.out.println(manager.ID());
        System.out.println(manager.KK());
        System.out.println(programmer.ID());
        System.out.println(programmer.KK());
        System.out.println(chif.ID());
        System.out.println(chif.KK());
        System.out.println(boss.ID());
        System.out.println(boss.KK());


//        String[] personal={
//                "Вася","40","20","1","Грузчик",
//                "Галя","60","40","40","Кладовщик",
//                "Степан","30","11.5","2","Водитель",
//                "Света","30","11.5","10","Менеджер",
//                "Кирилл","35","10.5","7","Программист",
//                "Иван","40","18.5","15","Руководитель отдела",
//                "Эдуард","45","20","1","Директор" };
//        int Npip=personal.length/5;
//        int j;
//        Employee sotrudnik[]=new Employee[Npip];
//        for(int i=0;i<3;i++){
//            j=i*5;
//            sotrudnik[i]=new Employee();
//            sotrudnik[i].setName(personal[j]);
//            sotrudnik[i].setAge(Integer.parseInt(personal[j + 1]));
//                                       super.setWrExp(Float.parseFloat(personal[j + 2])),
//                                       super.setWrExprComp(Float.parseFloat(personal[j + 3])),
//                                       super.setPosition(personal[j + 4]));
//            sotrudnik[i].setName(personal[j]);
//            sotrudnik[i].setAge(Integer.parseInt(personal[j + 1]));
//            sotrudnik[i].setWrExp(Float.parseFloat(personal[j + 2]));
//            sotrudnik[i].setWrExprComp(Float.parseFloat(personal[j + 3]));
//            sotrudnik[i].setPosition(personal[j + 4]);
 //       }
      //    Manager[] boss=new Manager[4];
//        for(int i=3;i<7;i++){
//            j=i*5;
//            boss[i-3]=new Manager();
//            boss[i-3].setName(personal[j]);
//            boss[i-3].setAge(Integer.parseInt(personal[j + 1]));
//            boss[i-3].setWrExp(Float.parseFloat(personal[j + 2]));
//            boss[i-3].setWrExprComp(Float.parseFloat(personal[j + 3]));
//            boss[i-3].setPosition(personal[j + 4]);
//            boss[i-3].setBonus((i - 2) * 1000);
//            sotrudnik[i]= boss[i-3];

//        }
//        for(int i=0;i<Npip;i++){
//            System.out.println(sotrudnik[i].ID());
//        }
//        System.out.println();
//        for(int i=0;i<Npip;i++){
//            System.out.println(sotrudnik[i].KK());
//        }
//        System.out.println();
//        System.out.println("проверка");
//        sotrudnik[3].ID();
//        System.out.println(sotrudnik[4].getName());
    }
}
