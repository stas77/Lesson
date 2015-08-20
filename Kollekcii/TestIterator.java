package Kollekcii;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 17.08.2015.
 */
public class TestIterator {
    public static void main(String[] args) {
        List <Integer> list=new ArrayList<Integer>();
        list.add(99);
        list.add(33);

        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
