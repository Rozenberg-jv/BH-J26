package by.belhard.j26.homeworks.hw5.task2;

public class Player {

    private int x, y;
    private String name;
    private double distance;

    public Player(String name) {

        this(name, 0, 0);
    }

    public Player(String name, int x, int y) {

        this.name = name;
        this.x = x;
        this.y = y;
        this.distance = 0;
    }

    public void move(int newX, int newY) {

        if (newX == x && newY == y)
            return;

        this.distance += distanceFromCurrent(newX, newY);

        this.x = newX;
        this.y = newY;
    }

    private double distanceFromCurrent(int newX, int newY) {

        return Math.sqrt(Math.pow(newX - x, 2) + Math.pow(newY - y, 2));
    }

    @Override
    public String toString() {
        return name + " - (" + x + "," + y + "), distance: " + distance;
    }
}
