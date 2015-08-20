package Kollekcii;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 18.08.2015.
 */
public class TestList2 {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<Integer>();
        ls.add(333);
        ls.add(55);
        ls.add(56);
        ls.add(334);
        ls.add(335);
        ls.add(336);

        System.out.println(ls.subList(0, ls.size()));

        ls.subList(1,3).clear();
        System.out.println("clear: "+ls.subList(0,ls.size()));
/*        for(Integer i:ls){
            System.out.println("clear: "+i);
        }*/
        ls.add(2);
        System.out.println("clear2: " + ls.subList(0, ls.size()));
/*        System.out.println();
        for(Integer i:ls){
            System.out.println("clear2: "+i);
        }*/
    }
}
