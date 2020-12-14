package by.belhard.j26.lessons.lesson10;

import java.io.*;

public class IOExample2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        try {

            BufferedReader rdr = new BufferedReader(new FileReader("resources/example.qwe"));

            String inputLine;
            while (rdr.ready()) {
                inputLine = rdr.readLine();
                sb.append(inputLine.toUpperCase()).append("\n");
            }

            rdr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            BufferedWriter wrt = new BufferedWriter(new FileWriter("resources/exampleOut.qwe"));

            wrt.write(sb.toString());

//            wrt.append("\n");
            wrt.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
