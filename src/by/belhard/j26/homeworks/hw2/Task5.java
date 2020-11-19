package by.belhard.j26.homeworks.hw2;

public class Task5 {

    public static void main(String[] args) {

        int a = 2;
        int n = 5;
// a*a*a*a*a
//        double pow = Math.pow(a, n);

        int pow = a;

        for (int i = 0; i < n - 1; i++) {
            pow = pow * a;
        }

        System.out.println(pow);
    }
}
