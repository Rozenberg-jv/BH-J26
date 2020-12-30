package by.belhard.j26.lessons.lesson14.annotationsExample;

public class AnotherText {

    private int id;
    @Repeater(times = 5)
    private String text;
    @Repeater(times = 2)
    private String another;

    public AnotherText(int id, String text, String another) {
        this.id = id;
        this.text = text;
        this.another = another;
    }


    // id = 5, text = "abc"
    // 5 abc
    // 55 abcabcabc
}
