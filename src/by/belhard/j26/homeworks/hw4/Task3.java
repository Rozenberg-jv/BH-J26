package by.belhard.j26.homeworks.hw4;

import java.util.Arrays;

@SuppressWarnings("Duplicates")
public class Task3 {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {-1, -2, -3};
        int[] array4 = {};

        ArraysCalculator calculator = new ArraysCalculator();

        int[] result = calculator.sumArrays(array1, array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(result));
        System.out.println();

        result = calculator.sumArrays(array1, array3);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(result));
        System.out.println();

        result = calculator.sumArrays(array1, array4);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array4));
        System.out.println(Arrays.toString(result));
        System.out.println();

        System.out.println("--------------\n");

        String[] strArray1 = new String[]{"myla", "ochen"};
        String[] strArray2 = new String[]{"Mama", "ramy", "tschatelno", "!"};

        calculator.concatArrays(strArray1, strArray2);
        System.out.println();

    }
}
