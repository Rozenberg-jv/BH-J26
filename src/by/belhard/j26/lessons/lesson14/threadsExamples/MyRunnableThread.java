package by.belhard.j26.lessons.lesson14.threadsExamples;

public class MyRunnableThread implements Runnable {

    private final String name;
    private final int times;
    private final int micros;


    public MyRunnableThread(String name, int times, int micros) {
        this.name = name;
        this.times = times;
        this.micros = micros;
    }

    @Override
    public void run() {

        for (int i = 0; i < times; i++) {
            try {
                Thread.sleep(micros);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + " " + i);
        }

        System.out.println(name + " finished");
    }
}
