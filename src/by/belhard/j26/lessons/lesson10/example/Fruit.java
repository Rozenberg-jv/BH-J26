package by.belhard.j26.lessons.lesson10.example;

public class Fruit {

    private String title;
    private int count;

    public Fruit(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return String.format("%s %d", title, count);
    }
}
