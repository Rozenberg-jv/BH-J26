package by.belhard.j26.homeworks.hw2;

public class Task4_1 {

    public static void main(String[] args) {

        int salary1 = 100;
        int salary2 = 100;
        int salary3 = 100;

        int min = salary1;
        int max = salary1;

        if (salary2 < min)
            min = salary2;
        if (salary3 < min)
            min = salary3;

        if (salary2 > max)
            max = salary2;
        if (salary3 > max)
            max = salary3;

        System.out.println(max - min);

    }
}
