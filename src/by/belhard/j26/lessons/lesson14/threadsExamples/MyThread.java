package by.belhard.j26.lessons.lesson14.threadsExamples;

public class MyThread extends Thread {

    private final int times;
    private final int micros;
    private final Thread threadToWait;


    public MyThread(String name, int times, int micros, Thread threadToWait) {
        super(name);

        this.times = times;
        this.micros = micros;
        this.threadToWait = threadToWait;
        setDaemon(true);
    }

    @Override
    public void run() {

        try {
            threadToWait.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < times; i++) {
            try {
                sleep(micros);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(getName() + " " + i);
        }

        System.out.println(getName() + " finished");
    }
}
