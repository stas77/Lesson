package Kollekcii;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by user on 18.08.2015.
 */
public class TestSet {
    public static void main(String[] args) {
        Set<Integer> Hset=new HashSet<Integer>();
        Hset.add(111);
        Hset.add(111);
        Hset.add(333);

        Iterator<Integer> Hiterator=Hset.iterator();
        while(Hiterator.hasNext()){
            System.out.println(Hiterator.next());
        }

        for(Integer i:Hset){
            System.out.println("Вывод for: "+i);
        }

        Hset.remove(111);
        for(Integer i:Hset){
            System.out.println("Вывод после remove : "+i);
        }
        Hset.clear();
        System.out.print("\nРазмер после clear =" + Hset.size());

        Hset.add(11);
        Hset.add(22);
        Hset.add(33);
        Hset.add(44);
        Hset.add(55);
        Hset.add(66);
        System.out.println("   contains(22): "+Hset.contains(22));

        Set<Integer> Hset2=new HashSet<Integer>();
        Hset2.add(00);
        Hset2.add(33);
        Hset2.add(55);

        System.out.println();
        Hset.removeAll(Hset2);
        for(Integer i:Hset){
            System.out.println("Вывод2 for: "+i);
        }

    }
}
