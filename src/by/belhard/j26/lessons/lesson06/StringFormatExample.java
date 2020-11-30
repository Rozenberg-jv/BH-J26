package by.belhard.j26.lessons.lesson06;

import java.time.*;
import java.util.Arrays;

public class StringFormatExample {

    public static void main(String[] args) {

        long l1 = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            System.out.printf("Random number in %d iteration is %6.2f\n", i + 1, (Math.random() * 1000000));
        }

        System.out.println();

        System.out.printf("111[%16.3s]222\n", "maxim");

        double d1 = 2.1424132;
        double d2 = Math.floor(d1 * 1000) / 1000;
        System.out.println(d1);
        System.out.println(d2);

        /*example(1);
        example(2, "a");
        example(3, "a", "b", "c");*/

        LocalDate localDate = LocalDate.of(2021, Month.MAY, 9);
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime localTimeUTC = LocalTime.now(ZoneId.of("UTC"));
        System.out.println(localTimeUTC);

        long l2 = System.currentTimeMillis();

        System.out.println(l2 - l1);
    }

    private static void example(int a, String ex, String... st) { // varargs

        System.out.println(a);
        System.out.println(Arrays.toString(st));

        System.out.println();
    }
}
