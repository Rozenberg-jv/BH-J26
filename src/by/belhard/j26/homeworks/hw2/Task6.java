package by.belhard.j26.homeworks.hw2;

public class Task6 {

    public static void main(String[] args) {

        int startSum = 1000;
        int proc = 10;
        int years = 2;

        int result = startSum;

        for (int i = 0; i < years; i++) {

            result = result + result * proc / 100;
        }

        System.out.println(result);
    }
}
