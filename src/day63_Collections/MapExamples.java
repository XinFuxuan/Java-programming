package day63_Collections;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {
        // id (key) has to be unique, names (value) could be duplicate, no index number
        Map<Integer, String> map = new HashMap<>(); // the order is not gauranteed

        map.put(1,"James");
        map.put(2,"Ana");
        map.put(3,"Daria");
        map.put(3,"Jay"); // cannot have duplicated key, the value will be updated from Daria to Jay
        map.put(100,"Max");
        System.out.println(map);
        System.out.println(map.get(100));

        map.remove(2);
        System.out.println(map);
        map.put(1,"kinga");
        System.out.println(map);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Daria"));

        for(Integer key:map.keySet()) {
            System.out.println(key + " - " + map.get(key));
            //map.values() this is a more General way of getting the value in map

            if (map.get(key).equals("Daria")) {
                System.out.println("This is our key" + key);
            }
        }




    }




}
