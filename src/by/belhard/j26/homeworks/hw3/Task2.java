package by.belhard.j26.homeworks.hw3;

@SuppressWarnings("Duplicates")
public class Task2 {

    public static void main(String[] args) {

        int startN = 2;
        int currentN = startN;
        int n = 4;

        int[][] triangle = new int[n][];

        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = currentN;
                currentN *= 2;
            }
        }

        for (int[] ar : triangle) {
            for (int i : ar) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] ar : triangle) {
            for (int i = ar.length - 1; i >= 0; i--) {
                System.out.print(ar[i] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < triangle.length; i++) {
            for (int j = triangle[i].length - 1; j >= 0; j--) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
