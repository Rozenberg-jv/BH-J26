package by.belhard.j26.homeworks.hw4;

@SuppressWarnings("Duplicates")
public class ArraysCalculator {

    /*   0  1  2  3
        {1, 2, 3}
        {1, 2, 3, 4}
        {2, 4, 6, 4}
        */

    public int[] sumArrays(int[] array1, int[] array2) {

        /*int[] minArray = array1.length < array2.length ? array1 : array2;
        int[] maxArray = array1.length > array2.length ? array1 : array2;*/ // неправильно!

        int[] minArray;
        int[] maxArray;

        if (array1.length < array2.length) {
            minArray = array1;
            maxArray = array2;
        } else {
            minArray = array2;
            maxArray = array1;
        }

        int[] sumArray = new int[maxArray.length];

//        sumArray = maxArray; // так лучше не делать
        System.arraycopy(maxArray, 0, sumArray, 0, sumArray.length);

        // solution

        for (int i = 0; i < minArray.length; i++) {
            sumArray[i] += minArray[i];
        }

        return sumArray;
    }

    public void concatArrays(String[] array1, String[] array2) {

        String[] minArray;
        String[] maxArray;

        if (array1.length < array2.length) {
            minArray = array1;
            maxArray = array2;
        } else {
            minArray = array2;
            maxArray = array1;
        }

        int orderCounter = 0;

        while (orderCounter < minArray.length) {
            System.out.print(maxArray[orderCounter] + " " + minArray[orderCounter] + " ");
            orderCounter++;
        }

        while (orderCounter < maxArray.length) {
            System.out.print(maxArray[orderCounter] + " ");
            orderCounter++;
        }
    }
}
