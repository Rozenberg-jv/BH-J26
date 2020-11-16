package by.belhard.j26.lessons.lesson02;

public class SecondLessonExample {

    /*

    Ctrl + /

    Ctrl + Shift + /

     */

    static int height = 15;

    // psvm
    public static void main(String[] args) {

        int weight;
        weight = 5;

        // sout
        System.out.println("This is string");
        System.out.println(weight);
        System.out.println(weight * (weight + weight) * weight);

        weight = 10;
        System.out.println(weight);
        System.out.println();

//        anotherMethod();
//        anotherMethod();

        System.out.println(height);

        //

        boolean bool = true; // bool = false;

        float fl = 3.14F;
        double dl = 3.14;

        System.out.println();
        byte b1 = -127;
        long l = 125;

        b1 = (byte) (b1 - 5);

        System.out.println(b1);

        System.out.println();

        // ASCII
        char c = 'a';

        System.out.println(c);
        c = (char) (c - 26);
        System.out.println(c);
        System.out.println((int) 'A');
        System.out.println((int) 'a');
        System.out.println('a');

        System.out.println();
        int a1 = 5;
        int a2 = a1;
        a1 = 10;
        System.out.println(a1 + " " + a2);
        System.out.println();

        Ex ex1 = new Ex();
        Ex ex2 = ex1;
        System.out.println(ex1.v);
        System.out.println(ex2.v);
        System.out.println();
        ex1.v = 15;
        System.out.println(ex1.v);
        System.out.println(ex2.v);
        //

        System.out.println();
        System.out.println(15.0 / 6);
        int i = 5;
        System.out.println(++i);
        System.out.println(i++);
        i++; // i = i + 1;
        System.out.println(i);
    }

    public static void anotherMethod() {

        height = height + 1;
    }
}


