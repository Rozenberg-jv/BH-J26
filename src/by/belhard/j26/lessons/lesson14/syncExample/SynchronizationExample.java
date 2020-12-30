package by.belhard.j26.lessons.lesson14.syncExample;

public class SynchronizationExample {

    public static void main(String[] args) throws InterruptedException {

        Object syncObject = new Object();
        Counter counter = new Counter(syncObject);
        AnotherCounter counter2 = new AnotherCounter(syncObject);

        Thread thread1 = new IncrementThread(counter);
        Thread thread2 = new IncrementThread(counter);
        Thread thread3 = new IncrementThread(counter);
        Thread thread4 = new IncrementThread(counter);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println(counter.getI());
    }
}
