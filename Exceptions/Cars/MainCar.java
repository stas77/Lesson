package Exceptions.Cars;

/**
 * Created by цербер on 16.08.2015.
 */
public class MainCar {
    public static void main(String[] args) {
        int j;
        int p=0;
        String[] Mcar={"ford","2500","220","red","A-100",
                        "mazda","0","200","green","A98",
                        "honda","1500","500","white","A98",
                        "toyota","2000","220","pink","A95",
                        "lada","1500","180","grey","A120"};

        Car[] car=new Car[Mcar.length/5];
        for(int i=0;i<car.length;i++){
            j=i*5;
            try {
                car[i] = new Car(Mcar[j], Integer.parseInt(Mcar[j + 1]), Integer.parseInt(Mcar[j + 2]),
                                Mcar[j + 3], Mcar[j + 4]);
                System.out.println(car[i].getName()+" "+car[i].getV()+" "+car[i].getSpeed()+" "+
                        car[i].getColor()+" "+car[i].getFuel());

                if(Integer.parseInt(Mcar[j + 1])<=100) {p=1; throw new MyCarException();};
                if(Integer.parseInt(Mcar[j + 2])>350) {p=2; throw new MyCarException();};
                if( Mcar[j + 3]=="pink") {p=3; throw new MyCarException();};
                if( Mcar[j + 4]=="A120") {p=4; throw new MyCarException();};
            }catch (MyCarException e){
               // e.printStackTrace();
                switch (p){
                    case 1:{System.err.println("ошибка Объема "+car[i].getV());break;}
                    case 2:{System.err.println("ошибка скорости "+car[i].getSpeed());break;}
                    case 3:{System.err.println("ошибка цвета "+car[i].getColor());break;}
                    case 4:{System.err.println("ошибка топлива "+car[i].getFuel());break;}
                }
            }
            finally {
/*                    System.out.println(car[i].getName()+" "+car[i].getV()+" "+car[i].getSpeed()+" "+
                                       car[i].getColor()+" "+car[i].getFuel());*/

            }
        }
    }
}
