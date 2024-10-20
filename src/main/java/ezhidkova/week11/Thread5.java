package main.java.ezhidkova.week11;

public class Thread5 {


    public static class threads implements Runnable {

        String threadName;

        public threads(String threadName) {
            this.threadName = threadName;
        }
        @Override
        public void run() {
            for (int i = 0; i <= 10; i++) {
                System.out.println(threadName + " " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new threads("Поток 1"));
        Thread thread2 = new Thread(new threads("Поток 2"));

        thread1.start();
        thread2.start();
    }
}
