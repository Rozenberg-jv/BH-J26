package by.belhard.j26.lessons.lesson14.syncExample;

public class Counter {

    private Object sync;

    public Counter(Object sync) {
        this.sync = sync;
    }

    private int i = 0;

    public void inc() {
        //
        //
        //
        synchronized (sync) {
            i++;
        }
        //
        //
        //
        //
    }

    public int getI() {
        return i;
    }
}
