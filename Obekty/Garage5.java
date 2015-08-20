package Obekty;

/**
 * Created by user on 03.08.2015.
 */
    class Car5{

    String name;
    int year;

    public Car5(String name,int year){
        this.name=name;
        this.year=year;
    }
}


public class Garage5 {
    public static void main(String[] args) {
        int nm=3;
        Car5[] myGarage =new Car5[nm];
        for(int i=0;i<myGarage.length; i++){
            myGarage[i]=new Car5("bmv",2000+i);
            System.out.println(myGarage[i].year);
        }
        myGarage[2].name="subaru";
        System.out.println(myGarage[2].name+" "+myGarage[2].year);
    }
}
