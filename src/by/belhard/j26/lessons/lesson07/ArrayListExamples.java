package by.belhard.j26.lessons.lesson07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        System.out.println(list.size());

//        list.add(1);
        list.add("asd");
        list.add("abc");

        String s = list.get(0);
        System.out.println(s);
        System.out.println(list.size());
//        System.out.println(list.get(4));

        System.out.println(list.contains("abc"));

        System.out.println();

        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); // string pool
        System.out.println();
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s3);
        System.out.println();
        s3 = s3.intern();

    }
}
