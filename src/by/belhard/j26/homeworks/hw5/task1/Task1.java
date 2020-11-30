package by.belhard.j26.homeworks.hw5.task1;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        /*for (int i = 0; i < 10; i++)
            System.out.println(Math.random());*/

        /*TempCounter tempCounter = new TempCounter(5, 3, 10);
        tempCounter.calcTemp();

        tempCounter = new TempCounter(10, 2, 100);
        tempCounter.calcTemp();*/

        TempCounter tempCounter = new TempCounter();
        double[] result = tempCounter.calcTemp(10, 5, 10);
        for (double d : result)
            System.out.println(d);

        System.out.println();

        result = tempCounter.calcTemp(5, 2, 15);
        for (double d : result)
            System.out.println(d);

        System.out.println();

        Random rand = new Random();

        int low = 23;
        int high = 70;

        for (int i = 0; i < 10; i++)
            System.out.println(low + rand.nextInt(high - low + 1));

        System.out.println();

    }
}
