package by.belhard.j26.homeworks.hw3;

public class Task3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\n");

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 || i % 7 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\n");

        for (int i = 1; i <= 100; i++) {
            if (i / 10 % 2 == 0)
                continue;
            if (i % 5 == 0 ^ i % 7 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}
