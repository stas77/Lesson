package OOP.Klassy;

/**
 * Created by user on 30.07.2015.
 */
import java.util.Scanner;

public class BD {
    public static void main(String[] args) {
          String[] mm={"Вася","муж","30","70","Гена","муж","50","105","Лена","жен","20","50",
                       "Маша","жен","20","45"};

//        BD_KNSTR m1=new BD_KNSTR("Вася","муж",30,70);
//        BD_KNSTR m2=new BD_KNSTR("Гена","муж",50,105);

        BD_KNSTR[] men=new BD_KNSTR[4];
        int j;
        for(int i=0;i<men.length;i++){
            j=i*men.length;
            men[i]=new BD_KNSTR(mm[j],mm[j+1],Integer.parseInt(mm[j + 2]),Float.parseFloat(mm[j+3]));
         //   men[i]=new BD_KNSTR("Вася","муж",30,70f);
        }
        Scanner scan1 = new Scanner(System.in);
        System.out.println("введите индекс Базы данных:");
        int index = scan1.nextInt();
        men[index-1].print();
    }


}
