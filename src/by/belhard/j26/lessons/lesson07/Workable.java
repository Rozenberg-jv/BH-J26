package by.belhard.j26.lessons.lesson07;

public interface Workable {

    int a = 5;

    void doWork();
    String getName();

    //
    static void staticMethod() {
        System.out.println("interface static method");
    }

    default void defaultMethod() {
        System.out.println("interface default method");
        this.privateMethod();
    }

    private void privateMethod() {
        System.out.println("interface private method");
    }
}
