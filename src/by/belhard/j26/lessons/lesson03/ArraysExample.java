package by.belhard.j26.lessons.lesson03;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {

        int[] array = {1, 5, -10, 3, 2};

        int length = array.length;

        System.out.println(array[4]);
        System.out.println(length);
        System.out.println("\n");

        int size = 50;
        int[] array2 = new int[size];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = size - i;
        }

        System.out.println(array2);
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < array2.length; i++)
            System.out.print(array2[i] * 2 + " ");

        System.out.println();
        int multi = 1;
        for (int i : array) {
            System.out.print(i + " ");
            multi = multi * i;
        }
        System.out.println();
        System.out.println(multi);
        System.out.println();
        String[] stringArray = {"one", "two", "three"};

        for (String s : stringArray) {
            System.out.println(s);
        }

        System.out.println();

        String[][] dArray = new String[3][];
        System.out.println(dArray[0]);
        dArray[0] = new String[]{"one", "two"};
        System.out.println(dArray[0]);
        System.out.println(dArray[0][1]);
        dArray[1] = new String[]{"three"};
        System.out.println();
        dArray = new String[][]{
                new String[]{"one", "two", "three"},
                new String[]{"four"},
                new String[]{"five", "six"}
        };

        for (int i = 0; i < dArray.length; i++) {
            for (int j = 0; j < dArray[i].length; j++) {
                System.out.print(dArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (String[] strings : dArray) {
            for (String s : strings) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

        System.out.println("\nend");
    }
}
