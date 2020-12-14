package by.belhard.j26.lessons.lesson10;

import java.io.*;

public class IOExample1 {

    public static void main(String[] args) {

        // immutable | mutable
//        StringBuffer
        StringBuilder sb = new StringBuilder();

        try {
            File inputFile = new File("resources/example.qwe");
            InputStream rdr = new FileInputStream(inputFile);
//            InputStream rdr = new FileInputStream("resources/example.qwe");

            while (rdr.available() > 0) {
                int sym = rdr.read();
                System.out.print((char) sym);
                sb.append((char) sym);
            }

            rdr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            OutputStream wrt = new FileOutputStream("resources/exampleOut.qwe", true);

            sb.toString().chars().forEach(i -> {
                try {
                    wrt.write(i + 1);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            wrt.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
