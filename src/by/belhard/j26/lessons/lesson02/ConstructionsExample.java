package by.belhard.j26.lessons.lesson02;

public class ConstructionsExample {

    public static void main(String[] args) {

       /* int a = 15;

        if (a > 5) {
            a = -100;
            System.out.println("1");
        } else if (a > 0) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }

        System.out.println("end");*/

        int q = 5;
        /*String result;

        if (q < 10) {
            result = "less";
        } else {
            result = "more";
        }

        System.out.println(result);*/

        String result = q < 10 ? "less" : "more";

        System.out.println(result);

        System.out.println();
        System.out.print("ABC");
        System.out.print("ABC");
        System.out.print("\n\n\n\n\n\n");

        int w = 10;

        while (w > 0) {
            System.out.println(w);
            w -= 2; // w = w - 2;
        }
        System.out.println("end");

        System.out.println("\n\n");

        int e = 15;
        for (int i = e; i > 0; i--) {
            System.out.print(i + " ");
        }

        /*for (;;) {
            System.out.println("HELLO!");
        }*/
        System.out.println();
        int i = 11;

        switch (i) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Shabbath. But also ");
            case 7:
                System.out.println("WEEDENDS!!!111oneoneonen");
                break;
            default:
                System.out.println("wrong input");
                break;
        }
    }
}
