package by.belhard.j26.lessons.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleExample {
    private static final String MENU_STRING = "\t1) string\n\t2) number\n\t3) boolean\n\texit\n\n";

    public static void main(String[] args) {

        try {
            BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));

            String input = "";
            while (!"exit".equals(input)) {

                System.out.println(MENU_STRING);
//                input = rdr.readLine();
                try {
                    input = rdr.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                /*Scanner scanner = new Scanner(System.in);
                scanner.*/

                switch (input) {
                    case "1":
                        System.out.println("String example");
                        break;
                    case "2":
                        System.out.println(12345);
                        break;
                    case "3":
                        System.out.println("true");
                        break;
                    default:
                        System.err.println("Wrong input");
                        break;
                }
            }

            rdr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Bye-bye");
    }
}


