package by.belhard.j26.lessons.lesson14.annotationsExample;

public class Text {

    @Repeater
    private int id;
    @Repeater(times = 3)
    private String text;

    public Text(int id, String text) {
        this.id = id;
        this.text = text;
    }
}
