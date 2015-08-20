package Kollekcii;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by user on 18.08.2015.
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("key1",10);
        map.put("key2",11);
        map.put("key3", 12);

        System.out.println(map.get("key1"));
        map.remove("key2");
        System.out.println("Размер: " + map.size());

        // получаем все ключи
        Set<String> strings=map.keySet();
        for (String k:strings){
            System.out.println(k);
        }

        for(String k2:map.keySet()){
            System.out.println(map.get(k2));
        }

        // получаем все значения
        // 1)
        for(Integer v:map.values()){
            System.out.println(v);
        }
        // 2)
        for(String k2:map.keySet()){
            System.out.println("k2: "+map.get(k2));
        }

        // получаем все пары ключей
        // 1)
/*        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e);
        }*/
        // 2)
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

        System.out.println(map.containsKey("key3"));
        System.out.println(map.containsValue(11));
    }


}
