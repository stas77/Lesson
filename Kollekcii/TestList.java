package Kollekcii;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 17.08.2015.
 */
public class TestList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(333);
        list.add(55);

        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list.get(0));
        list.add(5);
        list.add(83);

        for(int n:list) {
            System.out.println(n);
        }
        System.out.println(list.indexOf(55));

        boolean noVar=list.isEmpty();
        System.out.println(noVar);

        list.set(0, 30);
        System.out.println(list.get(0));
        System.out.println(list.get(2));
    }
}
