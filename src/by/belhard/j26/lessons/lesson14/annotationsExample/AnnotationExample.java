package by.belhard.j26.lessons.lesson14.annotationsExample;

public class AnnotationExample {

    public static void main(String[] args) throws IllegalAccessException {

        ObjectPrinter objectPrinter = new ObjectPrinter();

        Text text = new Text(1, "A");
        AnotherText anotherText = new AnotherText(2, "B", "|");

        objectPrinter.print(text);
        objectPrinter.print(anotherText);

        // 1 AAA
        // BBBBB ||
    }
}
