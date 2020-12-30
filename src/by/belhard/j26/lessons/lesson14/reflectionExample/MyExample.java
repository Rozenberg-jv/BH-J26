package by.belhard.j26.lessons.lesson14.reflectionExample;

public class MyExample {

    private final int a;

    public MyExample(Integer a) {
        this.a = a;
    }

    public void displayParam(String q) {
        System.out.println("param: " + q + ", a: " + this.a);
    }
}
