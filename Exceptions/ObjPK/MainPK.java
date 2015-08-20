package Exceptions.ObjPK;

import Exceptions.MyException;

import java.io.IOException;

/**
 * Created by user on 14.08.2015.
 */
public class MainPK {
    public static void main(String[] args) {
        int j;
        String[] Mas={"i5","2","1",
                      "i7","1","4",
                      "i7","1","0",
                      "i7","2","16"};
        PK[] myPK=new PK[Mas.length/3];

        for(int i=0;i<Mas.length/3;i++){
            j=i*3;
            myPK[i]=new PK(Mas[j],Integer.parseInt(Mas[j + 1]),
                           Integer.parseInt(Mas[j+2]));
        }

        for(int i=0; i<myPK.length;i++){
            try{
              //  if(myPK[i].getROM()==0)throw new Exception();
                if(myPK[i].getROM()==0)throw new MyPKexception();
                    System.out.print("С памятью все впорядке RAM=");
                    System.out.println(myPK[i].getROM());
            }catch(MyPKexception e){
                     e.printStackTrace();
                   // System.err.println("С памятью не впорядке!!! RAM="+myPK[i].getROM());
                    System.err.println(myPK[i].getROM());
                }
        }
    }
}
