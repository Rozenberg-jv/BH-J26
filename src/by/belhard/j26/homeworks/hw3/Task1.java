package by.belhard.j26.homeworks.hw3;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        int[] array = new int[]{13, 513, 12, -223, 14, 0, 123, 421, 23, 11};

        int sum = 0;
        double avg;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

//        int sum1 = Arrays.stream(array).sum();

        /*for (int i : array)
            sum += i;
        */

        avg = (double) sum / array.length;

        System.out.println(sum);
        System.out.println(avg);

        Arrays.stream(array).forEach(System.out::println);
        Arrays.sort(array);
        Arrays.stream(array).forEach(System.out::println);


    }
}
