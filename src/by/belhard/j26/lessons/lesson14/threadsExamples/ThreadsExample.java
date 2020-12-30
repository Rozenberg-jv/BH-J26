package by.belhard.j26.lessons.lesson14.threadsExamples;

public class ThreadsExample {

    public static void main(String[] args) throws InterruptedException {
        Thread myThread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
//            for (; ; ) {
                try {
                    Thread.sleep(999);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                System.out.println("LambdaRunnable ");
                System.out.println("LambdaRunnable " + i);
            }
            System.out.println("LambdaRunnable finished");
        });
        Thread myThread1 = new MyThread("thread1", 5, 2000, myThread2);

//        myThread2.setDaemon(true);
        Thread myThread3 = new Thread(new MyRunnableThread("runnableThread3", 16, 200));


        myThread1.start();
        myThread2.start();
//        myThread3.start();

        myThread1.join(); // MainThread joins to myThread1
        myThread2.join();
//        myThread3.join();

        System.out.println("MainThread finished");
    }
}
