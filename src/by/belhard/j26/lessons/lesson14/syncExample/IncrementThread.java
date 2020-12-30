package by.belhard.j26.lessons.lesson14.syncExample;

public class IncrementThread extends Thread {

    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        for (int i = 0; i < 100000; i++) {
            counter.inc();
        }
    }
}
