package by.belhard.j26.homeworks.hw2;

public class Task4_2 {

    public static void main(String[] args) {

        int salary1 = 100;
        int salary2 = 300;
        int salary3 = 200;

        int min = Math.min(salary3, Math.min(salary1, salary2));
        int max = Math.max(salary3, Math.max(salary1, salary2));

        System.out.println(max - min);
    }
}
