package by.belhard.j26.homeworks.hw2;

public class Task2 {

    public static void main(String[] args) {

        int r = -10;

        if (r > 0) {
            double s = r * r * Math.PI;
            double l = 2 * r * Math.PI;

            System.out.println("square = " + s);
            System.out.println("length = " + l);
        } else {
            System.out.println("wrong input");
        }

    }
}
