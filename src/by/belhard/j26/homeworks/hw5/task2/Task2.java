package by.belhard.j26.homeworks.hw5.task2;

public class Task2 {

    public static void main(String[] args) {

        Player player1 = new Player("Vasily", 0, 0);
        Player player2 = new Player("Tatyana");

        System.out.println(player1);
        player1.move(3, 4);
        System.out.println(player1);
        player1.move(-3, -4);
        System.out.println(player1);

        System.out.println(player2);
        player2.move(3, 4);
        System.out.println(player2);

    }
}
