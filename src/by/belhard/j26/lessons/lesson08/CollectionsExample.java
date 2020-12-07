package by.belhard.j26.lessons.lesson08;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsExample {

    public static void main(String[] args) {

//        list.sort();
        Set<String> set = new TreeSet<>(new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        set.add("abca");
        set.add("abd");
        set.add("abedw");
        set.add("abcawfw");
        set.add("abafa");
        set.add("abA3");


        System.out.println(set.size());
        System.out.println(set);

    }
}
