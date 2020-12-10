package by.belhard.j26.lessons.lesson09.exceptionsExample;

import java.io.*;

public class ExceptionExample {

    public static void main(String[] args) throws IOException {

//        getStringFail("");


        System.out.println(getInteger("123"));
        System.out.println(getInteger("15"));
        try {
            System.out.println(getInteger(null));
        } catch (NullPointerException e) {
            System.err.println("NPE");
        }
        System.out.println(getInteger("15."));

        try {
            InvalidFieldValueInUserObjectException ex = new InvalidFieldValueInUserObjectException("asd1");
            throw ex;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

//        System.out.println("End of program");
    }

    private static String getStringFail(String str) {
        return getStringFail("");
    }

    private static int getInteger(String input) throws NullPointerException, FileNotFoundException {

        int result = 0;

        InputStream stream = new FileInputStream(new File("132"));

        try {
            System.out.println(input.length());
            result = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            result = 100500;
        } catch (RuntimeException e) {
            System.err.println("All other exceptions");
        } finally {
//            System.exit(0);
            System.out.println("finally");
        }

        return result;
    }

    /*
    try-catch
    try-catch-finally
    try-finally
    */
}
