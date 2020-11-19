package by.belhard.j26.homeworks.hw2;

public class Task3 {

    public static void main(String[] args) {

        int t = 10;
        String result;

        if (t < 5) {
            result = "kurtka";
        } else if (t < 15) {
            result = "sweater";
        } else if (t < 25) {
            result = "maika";
        } else {
            result = "stay home";
        }

        System.out.println(result);
    }
}
