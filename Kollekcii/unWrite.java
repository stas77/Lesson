package Kollekcii;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by цербер on 17.08.2015.
 */
public class unWrite {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("один");
        list.add("два");
        list.add("три");
        list.add("четыре");
        list.add("пять");

     //   Collections.unmodifiableList(list);
/*        Collections.synchronizedSet(set);
        Collections.synchronizedMap(map);*/

/*        List<String> unWlist = Collections.unmodifiableList(list);
        try{
            unWlist.add("шесть");
            unWlist.set(0,"ноль");
        }catch (Exception e){
            System.err.println("Нельзя изменить коллеккцию unWlist");
        }

        for(int i=0;i<unWlist.size();i++){
            System.out.println(unWlist.get(i));
        }*/

        // !!! лучвший способ
        list=Collections.unmodifiableList(list);
        try{
            list.add("шесть");
            list.set(0,"ноль");
        }catch (Exception e){
            System.err.println("Нельзя изменить коллеккцию list");
        }

        for(String s:list){
            System.out.println(s);
        }

    }
}
