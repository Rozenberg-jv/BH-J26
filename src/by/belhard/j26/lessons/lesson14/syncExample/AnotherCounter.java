package by.belhard.j26.lessons.lesson14.syncExample;

public class AnotherCounter {

    private Object sync;

    public AnotherCounter(Object syncObject) {

        this.sync = syncObject;
    }

    public void sout() {
        synchronized (sync) { // mutex
            System.out.println("fqr");
        }
    }
}
