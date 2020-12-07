package by.belhard.j26.lessons.lesson08;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(10, "ten");
        map.put(9, "nine");
        map.put(6, "six");
        System.out.println(map);

        map.put(1, "uno");
        System.out.println(map);

        System.out.println(map.get(1));

        Collection<String> values = map.values();
        System.out.println(values);

        Set<Integer> keys = map.keySet();
        System.out.println(keys);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.printf("%d) %s\n", entry.getKey(), entry.getValue());
        }

//        int i = Integer.parseInt("123");
//        Byte, Double, Long, Character, Boolean, Integer
    }
}
