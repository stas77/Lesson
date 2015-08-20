package Kollekcii;

/**
 * Created by user on 17.08.2015.
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {

    static List<Integer> ArrToList(int[] mas){
        List<Integer> ls=new ArrayList();
        for(int i=0;i<mas.length;i++){
            ls.add(mas[i]);
        }
       // ls.sort();
        return ls;
    }

    public static void main(String[] args) {
        int[] IntMas={5,-1,3,8,4};

        List<Integer> list=new ArrayList();
        list=ArrToList(IntMas);
/*        for(int n:list){
            System.out.println(n);
        }*/
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
